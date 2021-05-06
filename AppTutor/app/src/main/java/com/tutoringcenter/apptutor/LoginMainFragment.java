package com.tutoringcenter.apptutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class LoginMainFragment extends Fragment {
    EditText edtUserName,edtPhone;
    Button dangNhap,btn;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
//        loginViewModel =
//              ViewModelProviders.of(this).get(LoginViewModel.class);

        View view=inflater.inflate(R.layout.fragment_thongtingiasu,container,false);

        View a=inflater.inflate(R.layout.app_bar_main,container,false);

        btn=a.findViewById(R.id.btn_login);
        btn.setText("Đăng xuất");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
//        FragmentTransaction fragmentTransaction = getActivity()
//                .getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.nav_host_fragment,new FeeFragment());
//        fragmentTransaction.commit();

        return view;
    }

}