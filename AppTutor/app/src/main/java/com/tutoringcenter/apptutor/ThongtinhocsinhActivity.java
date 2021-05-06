package com.tutoringcenter.apptutor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tutoringcenter.apptutor.ui.student.StudentFragment;

public class ThongtinhocsinhActivity extends Fragment {
    Spinner tutor;
    BottomNavigationView bottomNav;
    ViewPager viewPaper;
    ArrayAdapter<String> arrayAdapter;
    String[] mTestArray;
    FragmentTransaction fragmentTransaction;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
     //   mTestArray = getResources().getStringArray(R.array.Spinner_detail_tutor);
        View view=inflater.inflate(R.layout.fragment_thongtinhocsinh,container,false);
        tutor = (Spinner) view.findViewById(R.id.Spinner_detail);

        fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();
        return view;
    }


}
