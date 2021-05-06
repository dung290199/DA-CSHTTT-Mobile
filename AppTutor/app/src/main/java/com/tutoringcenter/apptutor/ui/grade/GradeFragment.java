package com.tutoringcenter.apptutor.ui.grade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.ViewModelProviders;

import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ui.fee.FeeViewModel;

public class GradeFragment extends Fragment {

    private GradeViewModel feeViewModel;


    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        feeViewModel =
                ViewModelProviders.of(this).get(GradeViewModel.class);

        View view=inflater.inflate(R.layout.fragment_listclass,container,false);


        return view;
    }

}