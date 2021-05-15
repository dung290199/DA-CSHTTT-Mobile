package com.tutoringcenter.apptutor.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.Doimatkhau;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.SpinnerFunction;
import com.tutoringcenter.apptutor.ui.tutor.Duyetdangkihoc;
import com.tutoringcenter.apptutor.ui.tutor.Themlichday;

public class TrangchuAdmin extends Fragment {
    Spinner spinner;
    SpinnerFunction sf;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
     //   mTestArray = getResources().getStringArray(R.array.Spinner_detail_tutor);
        View view=inflater.inflate(R.layout.fragment_thongtincanhangiasu1,container,false);
        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);
        FragmentTransaction fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();

        spinner=toolbar.findViewById(R.id.Spinner_detail);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                int a= (int) spinner.getItemIdAtPosition(position);
                String  SpinerValue3 = spinner.getItemAtPosition(position).toString();
                if (a==0) {

                    fragmentTransaction.replace(R.id.nav_host_fragment, new TrangchuAdmin());
                    fragmentTransaction.commit();
                }
                if(a==1){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Themlichday());
                    fragmentTransaction.commit();
                }
                if(a==2){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Doimatkhau());
                    fragmentTransaction.commit();
                }
                if(a==3){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Duyetdangkihoc());
                    fragmentTransaction.commit();
                }
                if(a==4){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Doimatkhau());
                    fragmentTransaction.commit();
                } if(a==5){

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
