package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.se.omapi.Session;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    // Màn hình sau khi đăng nhập thành công

    Button home, person;
    SharedPreferences sharedPreferences;
    Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




    }
}