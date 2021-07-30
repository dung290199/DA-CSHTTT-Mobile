package com.example.tutorready.ui.tutor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.tutorready.R;

public class TutorFragment extends Fragment {

    private TutorViewModel tutorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tutorViewModel =
                ViewModelProviders.of(this).get(TutorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tutor, container, false);

        return root;
    }
}