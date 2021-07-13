package com.example.tutorready.guest;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.tutorready.ActivityAdmin;
import com.example.tutorready.ActivityStudent;
import com.example.tutorready.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginFragment extends Fragment {

    EditText edt_username, edt_password;
    Button btn_login;
    String data_name, data_pass;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        edt_username = view.findViewById(R.id.edt_username);
        edt_password = view.findViewById(R.id.edt_password);

        btn_login = view.findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data_name = edt_username.getText().toString().trim();
                data_pass = edt_password.getText().toString().trim();

                if ( data_name.length() == 0|| data_pass.length() == 0){
                    Toast.makeText(getActivity(), "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else {
                    Login(data_name,data_pass);


                }
            }
        });



        return view;
    }

    private void Login(final String data_name,final String data_pass) {
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());

        //Toast.makeText(getActivity(), "Thông tin đã nhập " + data_name + data_pass, Toast.LENGTH_SHORT).show();

        //http://192.168.1.12:5000/api/auth/login
        final String url = "http://192.168.1.7:5000/api/auth/login";

        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (!response.trim().equals("")) {
                    Toast.makeText(getActivity(), "Đăng nhập thành công!!!", Toast.LENGTH_SHORT).show();
                    // Toast.makeText(LoginActivity.this, "TRẢ VỀ: "+response.toString(), Toast.LENGTH_LONG).show();
                    //Intent intent = new Intent(LoginActivity.this, MainActivity2.class);
                    //startActivity(intent);


                    String data = response.toString();
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        String token = (String) jsonObject.getString("token");
                        String user = (String) jsonObject.getString("user");

                        JSONObject jsonObject1 = new JSONObject(user);
                        //id = (String) jsonObject1.getString("_id");
                        String role = (String) jsonObject1.getString("role");
                        if (role.equals("STUDENT")) {
                           Intent intent = new Intent(getActivity(), ActivityStudent.class);
                           //intent.putExtra("data_name", "pass");
                           startActivity(intent);
                        }
                        if (role.equals("ADMIN")) {
                            Intent intent = new Intent(getActivity(), ActivityAdmin.class);
                            //intent.putExtra("data_name", "pass");
                            startActivity(intent);
                        }
                        if (role.equals("TUTOR")) {
                            Intent intent = new Intent(getActivity(), ActivityStudent.class);
                            intent.putExtra("data_name", "pass");
                            startActivity(intent);
                        }

                        //Toast.makeText(LoginActivity.this, "VÀO", Toast.LENGTH_SHORT).show();
                        //Toast.makeText(LoginActivity.this, "Đăng nhập thành công!!!" + user, Toast.LENGTH_LONG).show();
                        //Toast.makeText(LoginActivity.this, "Đăng nhập thành công!!!" + role, Toast.LENGTH_LONG).show();

                    } catch (JSONException e) {
                        //Toast.makeText(LoginActivity.this, "NOTTTTTTTTT!!", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                } else
                    Toast.makeText(getActivity(), "Đăng nhập thất bại !!!", Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), "Đăng nhập thất bại !!!" +error.toString(), Toast.LENGTH_LONG).show();

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


}
