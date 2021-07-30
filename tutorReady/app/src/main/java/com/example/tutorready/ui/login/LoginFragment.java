package com.example.tutorready.ui.login;

import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.example.tutorready.R;
import com.example.tutorready.ui.home.HomeFragment;
import com.example.tutorready.ui.tutor.ThongtincanhangiasuActivity;

public class LoginFragment extends Fragment {

    Button btnLogin,btnExit,inout;

    EditText edtMail,edtPass;
    TextView tvWelcome;
    private LoginViewModel loginViewModel;
    Spinner spinner;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        loginViewModel =
//                ViewModelProviders.of(this).get(LoginViewModel.class);
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        View a = inflater.inflate(R.layout.app_bar_main, container, false);
        btnExit=(Button) view.findViewById(R.id.btn_exit);
        btnLogin= (Button) view.findViewById(R.id.btn_login);
        edtMail= (EditText) view.findViewById(R.id.edt_mail);
        edtPass= (EditText) view.findViewById(R.id.edt_password);



        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);

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

//                if(mail.equals("")){
//                    Toast.makeText(getActivity(),"Mời nhập email",Toast.LENGTH_SHORT).show();
//                }
//                if(password.equals("")){
//                    Toast.makeText(getActivity(),"Mời nhập password",Toast.LENGTH_SHORT).show();
//                }
                if(mail.equals("giasu")||password.equals("s")){
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment,new ThongtincanhangiasuActivity());
                    fragmentTransaction.commit();
                    inout.setText("Đăng xuất");
                    tvWelcome.setText("Chào ...");
                    tvWelcome.setVisibility(View.VISIBLE);
                    spinner.setVisibility(View.VISIBLE);

                }
                if(mail.equals("hocsinh")||password.equals("")){
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment,new ThongtincanhangiasuActivity());
                    fragmentTransaction.commit();

                    ArrayAdapter adapter = ArrayAdapter.createFromResource(
                            getActivity(),
                            R.array.Spinner_detail_student,
                            R.layout.spinner_layout
                    );
                    adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
                    spinner.setAdapter(adapter);

                    inout.setText("Đăng xuất");
                    tvWelcome.setText("Chào ...");
                    tvWelcome.setVisibility(View.VISIBLE);
                    spinner.setVisibility(View.VISIBLE);
                }
                if(mail.equals("admin")||password.equals("")){
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment,new ThongtincanhangiasuActivity());
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