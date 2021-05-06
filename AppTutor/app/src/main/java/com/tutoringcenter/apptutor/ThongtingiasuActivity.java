package com.tutoringcenter.apptutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tutoringcenter.apptutor.ui.home.HomeFragment;
import com.tutoringcenter.apptutor.ui.student.StudentFragment;

public class ThongtingiasuActivity extends Fragment {
    Spinner tutor;
    BottomNavigationView bottomNav;
    ViewPager viewPaper;
    ArrayAdapter<String> arrayAdapter;
    String[] mTestArray;

    FragmentTransaction fragmentTransaction;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
     //   mTestArray = getResources().getStringArray(R.array.Spinner_detail_tutor);
        View view=inflater.inflate(R.layout.fragment_thongtingiasu,container,false);
        tutor = (Spinner) view.findViewById(R.id.Spinner_detail);

        tutor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                String  SpinerValue3 = tutor.getItemAtPosition(position).toString();
                int a= (int) tutor.getItemIdAtPosition(position);
                Toast.makeText(getActivity().getBaseContext(),
                        "You have selected 222 : " + SpinerValue3,
                        Toast.LENGTH_SHORT).show();



                if (a==1) {
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new StudentFragment());
                    fragmentTransaction.commit();
                }
                if(a==2){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new StudentFragment());
                    fragmentTransaction.commit();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        return view;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.is_infor:

                fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtingiasuActivity());
                fragmentTransaction.commit();
                return true;

            case R.id.is_changepass:
                fragmentTransaction.replace(R.id.nav_host_fragment, new StudentFragment());
                fragmentTransaction.commit();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
