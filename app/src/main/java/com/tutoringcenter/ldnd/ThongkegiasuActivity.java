package com.tutoringcenter.ldnd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThongkegiasuActivity extends AppCompatActivity {
    Button btnMenu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongkegiasu);
        btnMenu=findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
ShowMenu();
            }
        });
    }
    private void ShowMenu(){
        PopupMenu popupMenu=new PopupMenu(this,btnMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_demo,popupMenu.getMenu());
        popupMenu.show();
    }

}
