package com.example.tutorready.ui.introduction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tutorready.R;

public class IntroductionFragment extends Fragment {

    private IntroductionViewModel introductionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        introductionViewModel =
//                ViewModelProviders.of(this).get(IntroductionViewModel.class);
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