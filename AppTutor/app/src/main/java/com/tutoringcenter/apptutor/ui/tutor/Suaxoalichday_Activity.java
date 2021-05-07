package com.tutoringcenter.apptutor.ui.tutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tutoringcenter.apptutor.NewTrangchinhActivity;
import com.tutoringcenter.apptutor.R;

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
                Intent i=new Intent(Suaxoalichday_Activity.this, NewTrangchinhActivity.class);
                startActivity(i);
            }
        });
    }
}
