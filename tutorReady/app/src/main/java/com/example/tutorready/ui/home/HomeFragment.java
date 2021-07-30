package com.example.tutorready.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.tutorready.R;
import com.example.tutorready.ui.student.DangkiHocsinhActivity;
import com.example.tutorready.ui.tutor.DangkiGiasuActivity;

public class HomeFragment extends Fragment {

//    private HomeViewModel homeViewModel;

    Button btnSignupTeach,btnSignupStudy;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);

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