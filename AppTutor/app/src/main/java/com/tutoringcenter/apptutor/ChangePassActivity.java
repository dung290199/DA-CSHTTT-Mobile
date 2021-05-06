package com.tutoringcenter.apptutor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePassActivity extends AppCompatActivity {

    // Đổi mật khẩu
    EditText old_pass,new_pass, re_new_pass;
    String pass1, pass2, pass3;
    Button update, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pass);

        old_pass = findViewById(R.id.old_pass);
        new_pass = findViewById(R.id.new_pass);
        re_new_pass = findViewById(R.id.re_new_pass);

        update = findViewById(R.id.btn_update);
        back = findViewById(R.id.btn_back);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pass1 = old_pass.getText().toString().trim();
                pass2 = new_pass.getText().toString().trim();
                pass3 = re_new_pass.getText().toString().trim();

                if (pass1 == "" || pass2 == "" || pass3 == "") {
                    Toast.makeText(ChangePassActivity.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else {
                    if (pass2 != pass3) {
                        Toast.makeText(ChangePassActivity.this, "Mật khẩu xác nhận không khớp !!!", Toast.LENGTH_SHORT).show();
                    } else {
                        // Lưu mật khẩu mới trong CSDL


                        Toast.makeText(ChangePassActivity.this, "Bạn đã đổi mật khẩu thành công !!!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}