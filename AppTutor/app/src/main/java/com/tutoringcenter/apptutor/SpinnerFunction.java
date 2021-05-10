package com.tutoringcenter.apptutor;

import androidx.fragment.app.FragmentTransaction;

import com.tutoringcenter.apptutor.ui.student.Timkiem;
import com.tutoringcenter.apptutor.ui.tutor.ThongtincanhangiasuActivity;

public class SpinnerFunction {
    public void spin(FragmentTransaction fragmentTransaction, int a){
        if (a==0) {

            fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
            fragmentTransaction.commit();
        }
        if(a==1){

            fragmentTransaction.replace(R.id.nav_host_fragment, new Timkiem());
            fragmentTransaction.commit();
        }
        if(a==2){

            fragmentTransaction.replace(R.id.nav_host_fragment, new Timkiem());
            fragmentTransaction.commit();
        }
        if(a==3){

            fragmentTransaction.replace(R.id.nav_host_fragment, new Timkiem());
            fragmentTransaction.commit();
        }
        if(a==4){

            fragmentTransaction.replace(R.id.nav_host_fragment, new Doimatkhau());
            fragmentTransaction.commit();
        }
    }
}
