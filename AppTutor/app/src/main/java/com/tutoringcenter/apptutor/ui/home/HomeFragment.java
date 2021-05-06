package com.tutoringcenter.apptutor.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tutoringcenter.apptutor.DangkiGiasuActivity;
import com.tutoringcenter.apptutor.DangkiHocsinhActivity;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ui.introduction.IntroductionFragment;
import com.tutoringcenter.apptutor.ui.student.StudentFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    Button btnSignupTeach,btnSignupStudy;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

        View view=inflater.inflate(R.layout.fragment_home,container,false);

        btnSignupTeach= (Button) view.findViewById(R.id.btn_signup_teach);

        btnSignupTeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Selected :" + " " + "", Toast.LENGTH_LONG).show();
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,new DangkiGiasuActivity());
                fragmentTransaction.commit();
            }
        });

        btnSignupStudy= (Button) view.findViewById(R.id.btn_signup_study);

        btnSignupStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Selected :" + " " + "", Toast.LENGTH_LONG).show();
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,new DangkiHocsinhActivity());
                fragmentTransaction.commit();
            }
        });

        return view;
    }

}