package com.example.tutorready;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tutorready.home.DoiMatKhauFragment;
import com.example.tutorready.home.FeeFragment;
import com.example.tutorready.home.HomeFragment;
import com.example.tutorready.student.DanhGiaFragment;
import com.example.tutorready.student.LichHocFragment;
import com.example.tutorready.student.DangkyHocFragment;
import com.example.tutorready.student.StudentInfoFragment;
import com.google.android.material.navigation.NavigationView;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import org.jetbrains.annotations.NotNull;

public class MainActivity5 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

  // Student
    private DrawerLayout drawerLayout;

    private static final int FRAGMENT_INFO = 0;
    private static final int FRAGMENT_LICHHOC = 1;
    private static final int FRAGMENT_DANG_KY_HOC = 2;
    private  int CurrentFragment = FRAGMENT_INFO;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        drawerLayout = findViewById(R.id.drawer_layout_student);

        Toolbar toolbar = findViewById(R.id.toolbar_student);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view_student);
        navigationView.setNavigationItemSelectedListener(this);


        replaceFragment(new HomeFragment());
        navigationView.getMenu().findItem(R.id.nav_home).setCheckable(true);




    }       

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_info_student) {
            if (CurrentFragment != FRAGMENT_INFO) {
                replaceFragment(new StudentInfoFragment());
                CurrentFragment = FRAGMENT_INFO;
            }

        }
        else if (id == R.id.nav_lichhoc) {
            if (CurrentFragment != FRAGMENT_LICHHOC) {
                replaceFragment(new StudentInfoFragment());
                CurrentFragment = FRAGMENT_LICHHOC;
            }

        } else if (id == R.id.nav_logout) {
            onBackPressed();
            finish();


            if (CurrentFragment != FRAGMENT_DANG_KY_HOC)
            {
                replaceFragment(new StudentInfoFragment());
                CurrentFragment = FRAGMENT_DANG_KY_HOC;
            }

        }


        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new HomeFragment()).commit();
                break;
            case R.id.nav_fee:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new FeeFragment()).commit();
                break;
            case R.id.nav_doimatkhau:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new DoiMatKhauFragment()).commit();
                break;
            case R.id.nav_info_student:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new StudentInfoFragment()).commit();
                break;
            case R.id.nav_lichhoc:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new LichHocFragment()).commit();
                break;
            case R.id.nav_dangkyhoc:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new DangkyHocFragment()).commit();
                break;
            case R.id.nav_danhgiagiasu:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new DanhGiaFragment()).commit();
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