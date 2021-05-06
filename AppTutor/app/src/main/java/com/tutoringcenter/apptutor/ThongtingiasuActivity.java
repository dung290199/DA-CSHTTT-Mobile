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

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tutoringcenter.apptutor.ui.home.HomeFragment;
import com.tutoringcenter.apptutor.ui.student.StudentFragment;

public class ThongtingiasuActivity extends Fragment {
    Spinner tutor;
Spinner spinner;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_thongtingiasu,container,false);
        View a = inflater.inflate(R.layout.app_bar_main, container, false);
        tutor = (Spinner) view.findViewById(R.id.Spinner_detail);
        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);

        spinner=toolbar.findViewById(R.id.Spinner_detail);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                int a= (int) spinner.getItemIdAtPosition(position);
                String  SpinerValue3 = spinner.getItemAtPosition(position).toString();
                Toast.makeText(getActivity().getBaseContext(),
                        "You have selected 222 : " + SpinerValue3,
                        Toast.LENGTH_SHORT).show();

                if (a==0) {
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                    fragmentTransaction.commit();
                }
                if(a==1){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new Dangkitimgiasu());
                    fragmentTransaction.commit();
                }
                if(a==2){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new StudentFragment());
                    fragmentTransaction.commit();
                }
                if(a==3){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new StudentFragment());
                    fragmentTransaction.commit();
                }
                if(a==4){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new Doimatkhau());
                    fragmentTransaction.commit();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        tutor.setPrompt("Thông tin gia sư");

        return view;
    }

}
