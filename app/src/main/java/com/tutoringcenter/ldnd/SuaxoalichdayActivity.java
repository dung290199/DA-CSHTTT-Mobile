package com.tutoringcenter.ldnd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tutoringcenter.ldnd.dao.GiasuDao;
import com.tutoringcenter.ldnd.dao.GiasuDaoImpl;

public class SuaxoalichdayActivity extends AppCompatActivity {
    private GiasuDao a;
    Button update,delete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suaxoalichday);

        a=new GiasuDaoImpl();
        update=findViewById(R.id.btn_update);
        delete=findViewById(R.id.btn_delete);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Update();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Delete();
            }
        });
    }
    void Update(){

    }
    void Delete(){

    }
}
