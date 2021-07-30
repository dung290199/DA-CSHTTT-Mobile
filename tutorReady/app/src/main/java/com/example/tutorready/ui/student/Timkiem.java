package com.example.tutorready.ui.student;

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
import com.example.tutorready.R;
import com.example.tutorready.SpinnerFunction;
import com.example.tutorready.adapter.BlackListAdapter;
import com.example.tutorready.models.Black;
import com.example.tutorready.ui.tutor.ThongtincanhangiasuActivity;

import java.util.ArrayList;
import java.util.List;

public class Timkiem extends Fragment {

    SpinnerFunction sf;

    Spinner spinner;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_student,container,false);


        List<Black> image_details = getListTutorData();
        final ListView listView = (ListView) view.findViewById(R.id.lv_listView);
        listView.setAdapter(new BlackListAdapter(getActivity(), image_details));

        // When the user clicks on the ListItem

        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);

        FragmentTransaction fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                fragmentTransaction.commit();
            }
        });


        return view;
    }

    private List<Black> getListTutorData() {


        List<Black> list = new ArrayList<Black>();
        Black vietnam = new Black("Le Loan","Môn Toán","Lớp 1","Quảng Nam") ;
//        Black usa = new Black("Trần Minh","Môn Toán","Lớp 1","Bình Định") ;
//        Black russia = new Black("Lê Hồng","Môn Toán","Lớp 2","Đà Nẵng") ;
//        Black loan = new Black("Nguyễn Nhàn","Môn Toán","Lớp 3","Gia Lai") ;
//        Black e = new Black("Vũ Minh Anh","Môn Toán","Lớp 3","Quảng Nam") ;
//        Black a = new Black("Bùi Xuân Bảo","Môn Toán","Lớp 9","Quảng Trị") ;
//        Black b = new Black("Le F","Môn Toán","3","A") ;
//        Black c = new Black("Le S","Môn Toán","3","A") ;
//        list.add(vietnam);
//        list.add(usa);
//        list.add(russia);list.add(loan);
//        list.add(a);
//        list.add(c);
//        list.add(b);list.add(e);
        list.add(vietnam);
        return list;
    }



}