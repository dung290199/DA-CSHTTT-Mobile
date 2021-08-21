package com.example.tutorready.student;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tutorready.R;

import java.util.ArrayList;


public class DangkyHocFragment extends Fragment {

    Spinner spinnerSubject,spinnerLevel,spinnerRequest,spinnerArea;
    String subject,level,request,area;
    Button btnSearch;

    public DangkyHocFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dang_ky_hoc,container,false);

        spinnerSubject = view.findViewById(R.id.subjects);
        spinnerLevel = view.findViewById(R.id.levels);
        spinnerRequest = view.findViewById(R.id.requests);
        spinnerArea = view.findViewById(R.id.area);

        ArrayList<String> arrayMonhoc = new ArrayList<String>();
        arrayMonhoc.add("Toán học");
        arrayMonhoc.add("Ngữ văn");
        arrayMonhoc.add("Sinh học");
        arrayMonhoc.add("Vật lí");
        arrayMonhoc.add("Hoá học");
        arrayMonhoc.add("Vật lí");
        arrayMonhoc.add("Năng khiếu");
        arrayMonhoc.add("Tiếng anh");
        arrayMonhoc.add("Các môn khác");
        ArrayAdapter arrayAdapterMonhoc = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item,arrayMonhoc);
        arrayAdapterMonhoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSubject.setAdapter(arrayAdapterMonhoc);

        spinnerSubject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Bạn chọn môn "+ arrayMonhoc.get(position) , Toast.LENGTH_LONG).show();
                subject = arrayMonhoc.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> arrayLevel = new ArrayList<String>();
        arrayLevel.add("Mầm non");
        arrayLevel.add("Cấp 1");
        arrayLevel.add("Cấp 2");
        arrayLevel.add("Cấp 3");
        arrayLevel.add("Người đi làm");
        ArrayAdapter arrayAdapterCap = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item,arrayLevel);
        arrayAdapterCap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLevel.setAdapter(arrayAdapterCap);

        spinnerLevel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Bạn chọn môn "+ arrayLevel.get(position) , Toast.LENGTH_LONG).show();
                level = arrayLevel.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayList<String> arrayRequest = new ArrayList<String>();
        arrayRequest.add("Sinh viên");
        arrayRequest.add("Giáo viên");
        ArrayAdapter arrayAdapterRequest = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item,arrayRequest);
        arrayAdapterRequest.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRequest.setAdapter(arrayAdapterRequest);

        spinnerRequest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Bạn chọn môn "+ arrayRequest.get(position) , Toast.LENGTH_LONG).show();
                request = arrayRequest.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> arrayArea = new ArrayList<String>();
        arrayArea.add("Cẩm Lệ");
        arrayArea.add("Hải Châu");
        arrayArea.add("Liên Chiểu");
        arrayArea.add("Ngũ Hành Sơn");
        arrayArea.add("Sơn Trà");
        arrayArea.add("Thanh Khê");
        arrayArea.add("Hoàng Sa");
        arrayArea.add("Hòa Vang");
        arrayArea.add("Hòa Khánh");
        ArrayAdapter arrayAdapterArea = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item,arrayArea);
        arrayAdapterArea.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerArea.setAdapter(arrayAdapterArea);


        spinnerArea.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Bạn chọn môn "+ arrayArea.get(position) , Toast.LENGTH_LONG).show();
                area = arrayArea.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Bạn chọn môn " , Toast.LENGTH_LONG).show();
            }
        });




        return view;
    }
}