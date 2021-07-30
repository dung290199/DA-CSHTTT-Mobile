package com.example.tutorready.ui.fee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tutorready.R;

public class FeeFragment extends Fragment {

    private FeeViewModel feeViewModel;

    Button btnSignupTeach,btnSignupStudy;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
//        feeViewModel =
//                ViewModelProviders.of(this).get(FeeViewModel.class);

        View view=inflater.inflate(R.layout.fragment_fee,container,false);


        return view;
    }

}