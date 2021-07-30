package com.example.tutorready.ui.grade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tutorready.R;

public class GradeFragment extends Fragment {

    private GradeViewModel feeViewModel;


    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
//        feeViewModel =
//                ViewModelProviders.of(this).get(GradeViewModel.class);

        View view=inflater.inflate(R.layout.fragment_listclass,container,false);


        return view;
    }

}