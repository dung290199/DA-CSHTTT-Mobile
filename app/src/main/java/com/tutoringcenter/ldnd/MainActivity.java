package com.tutoringcenter.ldnd;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNav;
    ViewPager viewPaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottom_navigation);
        viewPaper=findViewById(R.id.viewPaper);

        setUpViewPager();

        bottomNav.setOnNavigationItemSelectedListener((menuItem)-> {
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    viewPaper.setCurrentItem(0);
                    //Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                    break;

                case     R.id.nav_favorites:
                    viewPaper.setCurrentItem(1);
                    //Toast.makeText(MainActivity.this,"Favorites",Toast.LENGTH_SHORT).show();
                    break;

                case R.id.nav_search:
                    viewPaper.setCurrentItem(2);
                    // Toast.makeText(MainActivity.this,"Search",Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        });
    }
    private void setUpViewPager(){
        ViewPagerAdapter viewPagerAdapter =new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPaper.setAdapter(viewPagerAdapter);

        viewPaper.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottomNav.getMenu().findItem(R.id.nav_home).setChecked(true);
                        break;
                    case 1:
                        bottomNav.getMenu().findItem(R.id.nav_favorites).setChecked(true);
                        break;
                    case 2:
                        bottomNav.getMenu().findItem(R.id.nav_search).setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}