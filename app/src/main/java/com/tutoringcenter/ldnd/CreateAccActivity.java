package com.tutoringcenter.ldnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class CreateAccActivity extends AppCompatActivity {

    Button btnCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acc);
        dangNhap();
    }

    private void dangNhap() {
        btnCreate=findViewById(R.id.btn_cre);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CreateAccActivity.this,NewTrangchinhActivity.class);
                startActivity(i);
            }
        });
    }
}
