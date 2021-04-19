package com.tutoringcenter.ldnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText edtUserName,edtPhone;
    Button dangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dangNhap();
    }

    private void dangNhap() {
        dangNhap=findViewById(R.id.btn_login);
        edtUserName=findViewById(R.id.edt_username);
        dangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtUserName.setText("loanbaby");
            }
        });
    }
}
