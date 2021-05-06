package com.tutoringcenter.apptutor.ui.login;

import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.LoginMainFragment;
import com.tutoringcenter.apptutor.NewTrangchinhActivity;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ThongtingiasuActivity;
import com.tutoringcenter.apptutor.ThongtinhocsinhActivity;
import com.tutoringcenter.apptutor.ui.grade.GradeFragment;
import com.tutoringcenter.apptutor.ui.home.HomeFragment;

import static android.content.Context.INPUT_METHOD_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;

public class LoginFragment extends Fragment {

    Button btnLogin,btnExit;
    EditText edtMail,edtPass;
    private LoginViewModel loginViewModel;

Toolbar toolbar;
    Button text;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        loginViewModel =
                ViewModelProviders.of(this).get(LoginViewModel.class);
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        View a = inflater.inflate(R.layout.app_bar_main, container, false);
        btnExit=(Button) view.findViewById(R.id.btn_exit);
        btnLogin= (Button) view.findViewById(R.id.btn_login);
        edtMail= (EditText) view.findViewById(R.id.edt_mail);
        edtPass= (EditText) view.findViewById(R.id.edt_password);

        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);
        Button topBack = (Button) toolbar.findViewById(R.id.btn_logout);
        topBack.setText("loanloan");

      //  getSupportActionBar().setDisplayShowTitleEnabled(false);
        edtPass.setInputType(InputType.TYPE_NULL);
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            edtPass.setRawInputType(InputType.TYPE_CLASS_TEXT);
            edtPass.setTextIsSelectable(true);
        }
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mail=edtMail.getText().toString().trim();
                String password=edtMail.getText().toString().trim();

                if(mail.equals("")){
                    Toast.makeText(getActivity(),"Mời nhập email",Toast.LENGTH_SHORT).show();
                }
                if(password.equals("")){
                    Toast.makeText(getActivity(),"Mời nhập password",Toast.LENGTH_SHORT).show();
                }
                if(mail.equals("loan")||password.equals("1234")){
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment,new ThongtingiasuActivity());
                    fragmentTransaction.commit();
                }
                if(mail.equals("a")||password.equals("a")){
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment,new ThongtinhocsinhActivity());
                    fragmentTransaction.commit();
                }
                else{
                   // Toast.makeText(getActivity(), "Sai Email hoặc Password. Mời nhập lại .", Toast.LENGTH_LONG).show();
                }

            }
        });
//        FragmentTransaction fragmentTransaction = getActivity()
//                .getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.nav_host_fragment,new HomeFragment());
//        fragmentTransaction.commit();
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,new HomeFragment());
                fragmentTransaction.commit();


            }
        });

        return view;
    }

}