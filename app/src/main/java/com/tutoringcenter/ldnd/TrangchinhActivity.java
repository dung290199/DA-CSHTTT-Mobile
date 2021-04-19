package com.tutoringcenter.ldnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TrangchinhActivity extends AppCompatActivity {
    Button btnDangki;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);

    }

    private void loginEvent() {
//        btnDangki=findViewById(R.id.btn_dangki);
        btnDangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TrangchinhActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
