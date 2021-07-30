package com.example.tutorready;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.example.tutorready.ui.tutor.Duyetdangkihoc;
import com.example.tutorready.ui.tutor.Lichday;
import com.example.tutorready.ui.tutor.Themlichday;
import com.example.tutorready.ui.tutor.ThongtincanhangiasuActivity;

public class Doimatkhau extends Fragment {
    Spinner spinner;
    EditText old_pass,new_pass, re_new_pass;
    String pass1, pass2, pass3;
    Button update, back;
    SpinnerFunction sf;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_change_pass,container,false);
        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);

        old_pass = view.findViewById(R.id.old_pass);
        new_pass = view.findViewById(R.id.new_pass);
        re_new_pass = view.findViewById(R.id.re_new_pass);

        update =view.findViewById(R.id.btn_update);
        back = view.findViewById(R.id.btn_back);
        FragmentTransaction fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pass1 = old_pass.getText().toString().trim();
                pass2 = new_pass.getText().toString().trim();
                pass3 = re_new_pass.getText().toString().trim();

                if (pass1 == "" || pass2 == "" || pass3 == "") {
                    Toast.makeText(getActivity(), "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else {
                    if (pass2 != pass3) {
                        Toast.makeText(getActivity(), "Mật khẩu xác nhận không khớp !!!", Toast.LENGTH_SHORT).show();
                    } else {
                        // Lưu mật khẩu mới trong CSDL


                        Toast.makeText(getActivity(), "Bạn đã đổi mật khẩu thành công !!!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                int a= (int) spinner.getItemIdAtPosition(position);
                String SpinerValue3 = spinner.getItemAtPosition(position).toString();
                if (a==0) {

                    fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                    fragmentTransaction.commit();
                }
                if(a==1){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Themlichday());
                    fragmentTransaction.commit();
                }
                if(a==2){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Lichday());
                    fragmentTransaction.commit();
                }
                if(a==3){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Duyetdangkihoc());
                    fragmentTransaction.commit();
                }
                if(a==4){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Doimatkhau());
                    fragmentTransaction.commit();
                } if(a==5){

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Doimatkhau());
                    fragmentTransaction.commit();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        return view;
    }

}
