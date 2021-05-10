package com.tutoringcenter.apptutor.ui.login;

import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ui.home.HomeFragment;
import com.tutoringcenter.apptutor.ui.tutor.ThongtincanhangiasuActivity;

public class Signup extends Fragment {

    Button btnLogin,btnExit,inout;

    EditText edtMail,edtPass;
    TextView tvWelcome;
    private LoginViewModel loginViewModel;
    Spinner spinner;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        loginViewModel =
                ViewModelProviders.of(this).get(LoginViewModel.class);
        View view = inflater.inflate(R.layout.activity_dangkithongtingiasu, container, false);
        View a = inflater.inflate(R.layout.app_bar_main, container, false);


        return view;
    }

}