package com.tutoringcenter.ldnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DangkiGiasuActivity extends AppCompatActivity {
    Button btnSignup;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangkithongtingiasu);

        btnSignup=findViewById(R.id.btn_signup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DangkiGiasuActivity.this,CreateAccActivity.class);
                startActivity(i);
            }
        });
    }

}
