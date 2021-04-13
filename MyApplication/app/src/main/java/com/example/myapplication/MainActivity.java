package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Màn hình đăng nhập
    EditText edt_name, edt_pass;
    Button login, signup, exit;
    String data_name, data_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.edt_username);
        edt_pass = findViewById(R.id.edt_password);

        login = findViewById(R.id.btn_login);
        signup = findViewById(R.id.btn_signup);


        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                data_name = edt_name.getText().toString().trim();
                data_pass = edt_pass.getText().toString().trim();

                if ( data_name =="" || data_pass ==""){
                    Toast.makeText(MainActivity.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else Login();

            }
        });

        signup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Bạn đã thoát khỏi ứng dụng",Toast.LENGTH_LONG).show();
                //id=session.getid();
                //session.setid(id);
                onBackPressed();
                finish();
            }
        });
    }

    public void Login(){




    }

}
