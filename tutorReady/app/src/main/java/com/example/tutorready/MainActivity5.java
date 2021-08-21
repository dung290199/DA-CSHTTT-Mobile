package com.example.tutorready;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tutorready.student.DoiMatKhau2Fragment;
import com.example.tutorready.tutor.DoiMatKhauFragment;
import com.example.tutorready.home.FeeFragment;
import com.example.tutorready.student.HomeFragment;
import com.example.tutorready.student.DanhGiaFragment;
import com.example.tutorready.student.LichHocFragment;
import com.example.tutorready.student.DangkyHocFragment;
import com.example.tutorready.student.StudentInfoFragment;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity5 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

  // Student
    private DrawerLayout drawerLayout;

    String id,token,role,email,fullname,birthday,address,phone,user,picture;
    Boolean gender;


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

        getData();




    }

    private void getData() {

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();


        id = bundle.getString("id_user");
        token = bundle.getString("token_user");

        user = bundle.getString("username");
        email = bundle.getString("email_user");
        fullname = bundle.getString("fullname");
        birthday = bundle.getString("birthday");
        phone = bundle.getString("phone");
        address = bundle.getString("address");

        role = bundle.getString("role_user");
        gender = bundle.getBoolean("gender");

        picture = bundle.getString("picture");

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

        /*
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


         */

        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new HomeFragment()).commit();
                break;
            case R.id.nav_fee:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new FeeFragment()).commit();
                break;
            case R.id.nav_doimatkhau:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame_student,new DoiMatKhau2Fragment()).commit();
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

    public String getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAva() {
        return picture;
    }

    public String getAddress() {
        return address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public Boolean getGender() {
        return gender;
    }
}