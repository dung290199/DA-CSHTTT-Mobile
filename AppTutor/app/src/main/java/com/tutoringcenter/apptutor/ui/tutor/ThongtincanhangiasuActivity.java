package com.tutoringcenter.apptutor.ui.tutor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.Doimatkhau;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.admin.BlackListActivityfake;
import com.tutoringcenter.apptutor.ui.student.DangkiHocsinhActivity;
import com.tutoringcenter.apptutor.ui.student.Dangkitimgiasu;
import com.tutoringcenter.apptutor.ui.student.StudentFragment;

public class ThongtincanhangiasuActivity extends Fragment {
    Spinner spinner;

    FragmentTransaction fragmentTransaction;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
     //   mTestArray = getResources().getStringArray(R.array.Spinner_detail_tutor);
        View view=inflater.inflate(R.layout.fragment_thongtincanhangiasu,container,false);
        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);

        spinner=toolbar.findViewById(R.id.Spinner_detail);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                int a= (int) spinner.getItemIdAtPosition(position);
                String  SpinerValue3 = spinner.getItemAtPosition(position).toString();

                if (a==0) {
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                    fragmentTransaction.commit();
               }
                if(a==1){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new BlackListActivityfake());
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
