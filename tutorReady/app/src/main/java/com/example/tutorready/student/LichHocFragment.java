package com.example.tutorready.student;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tutorready.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LichHocFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LichHocFragment extends Fragment {

    public LichHocFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_lich_hoc, container, false);
    }
}