package com.tutoringcenter.ldnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class vd1 extends AppCompatActivity {
    Button btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vd1);

        btnSignup=(Button) findViewById(R.id.button1);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(vd1.this,CreateAccActivity.class);
                startActivity(i);
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
