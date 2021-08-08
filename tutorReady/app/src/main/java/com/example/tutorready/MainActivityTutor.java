package com.example.tutorready;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tutorready.home.DoiMatKhauFragment;
import com.example.tutorready.home.FeeFragment;
import com.example.tutorready.home.HomeFragment;
import com.example.tutorready.student.DangkyHocFragment;
import com.example.tutorready.student.DanhGiaFragment;
import com.example.tutorready.student.LichHocFragment;
import com.example.tutorready.student.StudentInfoFragment;
import com.example.tutorready.tutor.DangKyDayFragment;
import com.example.tutorready.tutor.LichDayFragment;
import com.example.tutorready.tutor.TutorInfoFragment;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivityTutor extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tutor);
        drawerLayout = findViewById(R.id.drawer_layout_tutor);

        Toolbar toolbar = findViewById(R.id.toolbar_tutor);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view_tutor);
        navigationView.setNavigationItemSelectedListener(this);


        replaceFragment(new HomeFragment());
        navigationView.getMenu().findItem(R.id.nav_home).setCheckable(true);




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_tutor,new HomeFragment()).commit();
                break;
            case R.id.nav_fee:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_tutor,new FeeFragment()).commit();
                break;
            case R.id.nav_doimatkhau:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_tutor,new DoiMatKhauFragment()).commit();
                break;
            case R.id.nav_info_tutor:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_tutor,new TutorInfoFragment()).commit();
                break;
            case R.id.nav_lichday:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_tutor,new LichDayFragment()).commit();
                break;
            case R.id.nav_dangkyday:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_tutor,new DangKyDayFragment()).commit();
                break;
            case R.id.nav_logout:
                Toast.makeText(getApplication(), "Bạn đã thoát khỏi ứng dụng",Toast.LENGTH_LONG).show();
                onBackPressed();
                finish();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;



        //drawerLayout.closeDrawer(GravityCompat.START);
        //return true;

    }

    @Override
    public void onBackPressed() {
        if ( drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else {
            super.onBackPressed();
        }

    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content_frame_student,fragment);
        fragmentTransaction.commit();
    }
}