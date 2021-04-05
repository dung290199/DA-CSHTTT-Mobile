package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

                if ( 3>5 || 3>4 ){
                    Toast.makeText(MainActivity.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else Login();


            }
        });
    }

    public  void Login(){

    }

}
