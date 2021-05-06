package com.tutoringcenter.apptutor.ui.student;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.Dangkitimgiasu;
import com.tutoringcenter.apptutor.Doimatkhau;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ThongtincanhangiasuActivity;
import com.tutoringcenter.apptutor.ui.grade.GradeFragment;

public class StudentFragment extends Fragment {
    Spinner spinner;
    private StudentViewModel studentViewModel;
    Button btnFind;
    SearchView search;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        studentViewModel =
                ViewModelProviders.of(this).get(StudentViewModel.class);
        View view = inflater.inflate(R.layout.fragment_student, container, false);
        search=view.findViewById(R.id.sv_search);
        btnFind= (Button) view.findViewById(R.id.btn_find);
        spinner = (Spinner) view.findViewById(R.id.Spinner_detail);
        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Selected :" + " " + "", Toast.LENGTH_LONG).show();
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,new GradeFragment());
                fragmentTransaction.commit();
            }
        });
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
        return view;
    }
}