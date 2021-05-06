package com.tutoringcenter.apptutor.ui.introduction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tutoringcenter.apptutor.R;

public class IntroductionFragment extends Fragment {

    private IntroductionViewModel introductionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        introductionViewModel =
                ViewModelProviders.of(this).get(IntroductionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_student, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        introductionViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}