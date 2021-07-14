package com.example.tutorready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    EditText edt_username, edt_password;
    Button btn_login;
    String data_name, data_pass;

    public static final String username = "username";
    public static final String password = "password";


    String id, role, token;

    //Login
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initControl();

        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);


        btn_login = findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data_name = edt_username.getText().toString().trim();
                data_pass = edt_password.getText().toString().trim();

                if ( data_name.length() == 0|| data_pass.length() == 0){
                    Toast.makeText(MainActivity2.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity2.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplication(), ActivityStudent.class);
                    startActivity(intent);
                    //Login(data_name,data_pass);
                }
            }
        });

    }

    private void Login(String data_name, String data_pass) {

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //Toast.makeText(getActivity(), "Thông tin đã nhập " + data_name + data_pass, Toast.LENGTH_SHORT).show();

        final String url = "http://192.168.1.5:5000/api/auth/login";

        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if (response.trim().equals("Invalid password!")) {
                    Toast.makeText(getApplicationContext(), "Mật khẩu không chính xác!!!", Toast.LENGTH_SHORT).show();
                }

                if (response.trim().equals("Invalid username!")) {
                    Toast.makeText(getApplicationContext(), "Tài khoản không tồn tại!!!", Toast.LENGTH_SHORT).show();
                }
                if (!response.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công!!!", Toast.LENGTH_SHORT).show();

                    String data = response.toString();
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        token = (String) jsonObject.getString("token");
                        String user = (String) jsonObject.getString("user");

                        JSONObject jsonObject1 = new JSONObject(user);
                        id = (String) jsonObject1.getString("_id");
                        role = (String) jsonObject1.getString("role");

                        Toast.makeText(getApplicationContext(), "Đăng !", Toast.LENGTH_SHORT).show();

                        Toast.makeText(getApplicationContext(), "VẬY LÀ : "+id + role, Toast.LENGTH_SHORT).show();
                        if (role.equals("STUDENT")) {
                            Intent intent = new Intent(getApplicationContext(), ActivityStudent.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("id_user" ,id);
                            intent.putExtra("data",bundle);
                            startActivity(intent);
                        }
                        if (role.equals("ADMIN")) {
                            Intent intent = new Intent(getApplicationContext(), ActivityAdmin.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("token_user" ,token);
                            bundle.putString("id_user" ,id);
                            intent.putExtra("data",bundle);
                            startActivity(intent);
                        }
                        if (role.equals("TUTOR")) {
                            Intent intent = new Intent(getApplicationContext(), ActivityTutor.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("token_user" ,token);
                            bundle.putString("id_user" ,id);
                            intent.putExtra("data",bundle);
                            startActivity(intent);
                        }

                        //Toast.makeText(LoginActivity.this, "VÀO", Toast.LENGTH_SHORT).show();
                        //Toast.makeText(LoginActivity.this, "Đăng nhập thành công!!!" + user, Toast.LENGTH_LONG).show();
                        //Toast.makeText(LoginActivity.this, "Đăng nhập thành công!!!" + role, Toast.LENGTH_LONG).show();

                    } catch (JSONException e) {
                        //Toast.makeText(LoginActivity.this, "NOTTTTTTTTT!!", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Đăng nhập thất bại !!!" +error.toString(), Toast.LENGTH_LONG).show();
            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username",data_name);
                params.put("password",data_pass);
                return params;
            }
        };
        requestQueue.add(request);
    }

    private void initControl() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setSelectedItemId(R.id.login);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.login:
                        startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.signup:
                        startActivity(new Intent(getApplicationContext(),MainActivity3.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.fee:
                        startActivity(new Intent(getApplicationContext(),MainActivity4.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}