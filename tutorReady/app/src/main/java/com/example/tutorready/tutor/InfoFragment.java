package com.example.tutorready.tutor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.tutorready.ActivityTutor;
import com.example.tutorready.R;

public class InfoFragment extends Fragment {

    EditText edtUsername;


    public InfoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_info,container,false);

        ActivityTutor activity = (ActivityTutor) getActivity();
        //String username = activity.getUser();


        edtUsername = view.findViewById(R.id.edt_username);
        edtUsername.setText(activity.getUser());


        return view;

    }
}