package com.tutoringcenter.apptutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Suaxoalichday_Activity extends AppCompatActivity {
    Button btnCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suaxoalichday);
        dangNhap();
    }

    private void dangNhap() {
        btnCreate=findViewById(R.id.btn_update);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Suaxoalichday_Activity.this,NewTrangchinhActivity.class);
                startActivity(i);
            }
        });
    }
}
