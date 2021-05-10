package com.tutoringcenter.apptutor.ui.student;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.Doimatkhau;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.SpinnerFunction;
import com.tutoringcenter.apptutor.adapter.BlackListAdapter;
import com.tutoringcenter.apptutor.models.Black;
import com.tutoringcenter.apptutor.ui.tutor.ThongtincanhangiasuActivity;

import java.util.ArrayList;
import java.util.List;

public class Lopdanghoc extends Fragment {

    SpinnerFunction sf;

    Spinner spinner;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview,container,false);


        List<Black> image_details = getListTutorData();
        final ListView listView = (ListView) view.findViewById(R.id.lv_listView);
        listView.setAdapter(new BlackListAdapter(getActivity(), image_details));

        // When the user clicks on the ListItem

        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);

        spinner=toolbar.findViewById(R.id.Spinner_detail);
        FragmentTransaction fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                fragmentTransaction.commit();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                int a= (int) spinner.getItemIdAtPosition(position);
                String  SpinerValue3 = spinner.getItemAtPosition(position).toString();
                if (a==0) {

                    fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                    fragmentTransaction.commit();
                }
                if(a==1){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Dangkihoc());
                    fragmentTransaction.commit();
                }
                if(a==2){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Timkiem());
                    fragmentTransaction.commit();
                }
                if(a==3){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Lopdanghoc());
                    fragmentTransaction.commit();
                }
                if(a==4){

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

    private  List<Black> getListTutorData() {


        List<Black> list = new ArrayList<Black>();
        Black vietnam = new Black("Giáo viên:  Nguyễn Thùy Linh","Môn Toán","T2,4,6 17h","Quảng Nam") ;
        Black usa = new Black("Giáo viên :  Trần Minh","Môn Anh","T3,5,7 19h","Bình Định") ;

        list.add(vietnam);
        list.add(usa);
        return list;
    }



}