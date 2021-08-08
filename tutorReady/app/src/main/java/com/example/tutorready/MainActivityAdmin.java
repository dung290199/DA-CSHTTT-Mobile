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

import com.example.tutorready.admin.AdminFragment;
import com.example.tutorready.admin.DuyetYeuCauFragment;
import com.example.tutorready.admin.GiaSuFragment;
import com.example.tutorready.admin.HocSinhFragment;
import com.example.tutorready.home.DoiMatKhauFragment;
import com.example.tutorready.home.FeeFragment;
import com.example.tutorready.home.HomeFragment;
import com.example.tutorready.student.DangkyHocFragment;
import com.example.tutorready.student.DanhGiaFragment;
import com.example.tutorready.student.LichHocFragment;
import com.example.tutorready.student.StudentInfoFragment;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivityAdmin extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);

        drawerLayout = findViewById(R.id.drawer_layout_admin);

        Toolbar toolbar = findViewById(R.id.toolbar_admin);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view_admin);
        navigationView.setNavigationItemSelectedListener(this);


        replaceFragment(new HomeFragment());
        navigationView.getMenu().findItem(R.id.nav_home).setCheckable(true);




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_admin,new HomeFragment()).commit();
                break;
            case R.id.nav_fee:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_admin,new FeeFragment()).commit();
                break;
            case R.id.nav_doimatkhau:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_admin,new DoiMatKhauFragment()).commit();
                break;
            case R.id.nav_info_admin:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_admin,new AdminFragment()).commit();
                break;
            case R.id.nav_giasu:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_admin,new GiaSuFragment()).commit();
                break;
            case R.id.nav_hocsinh:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_admin,new HocSinhFragment()).commit();
                break;
            case R.id.nav_duyetyeucau:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_admin,new DuyetYeuCauFragment()).commit();
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