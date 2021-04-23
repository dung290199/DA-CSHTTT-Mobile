package com.tutoringcenter.ldnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class vd2 extends AppCompatActivity {
    Button btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timkiem);

        btnSignup=findViewById(R.id.button);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vd2.this, TimkiemActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void home(){
//
//    }
//
//    private void loginEvent() {
////        btnDangki=findViewById(R.id.btn_dangki);
//        btnDangki.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(TrangchinhActivity.this,LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
}
