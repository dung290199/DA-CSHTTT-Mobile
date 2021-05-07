package com.tutoringcenter.apptutor.ui.tutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ui.home.HomeFragment;
import com.tutoringcenter.apptutor.ui.student.StudentFragment;

public class DangkiGiasuActivity extends Fragment {
    Button btnConfirm,btnUpload,btnCv;
    EditText edtFullName,edtPhone,edtBirthday,edtAddress,edtEmail,edtGender;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_dangkithongtingiasu,container,false);

        btnConfirm=(Button) view.findViewById(R.id.btn_confirm);
        btnUpload= (Button) view.findViewById(R.id.btn_upload);
        btnCv=(Button) view.findViewById(R.id.btn_cv);
        edtFullName= (EditText) view.findViewById(R.id.edt_fullName);
        edtPhone= (EditText) view.findViewById(R.id.edt_phone);
        edtBirthday= (EditText) view.findViewById(R.id.edt_birthday);
        edtAddress= (EditText) view.findViewById(R.id.edt_address);
        edtEmail= (EditText) view.findViewById(R.id.edt_email);
        edtGender= (EditText) view.findViewById(R.id.edt_gender);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fullName=edtFullName.getText().toString().trim();
                String phone=edtPhone.getText().toString().trim();
                String date=edtBirthday.getText().toString().trim();
                String address=edtAddress.getText().toString().trim();
                String email=edtEmail.getText().toString().trim();
                String gender=edtGender.getText().toString().trim();
                if(fullName.equals("")||phone.equals("")||date.equals("")||address.equals("")||email.equals("")||gender.equals("")){
                    Toast.makeText(getActivity(),"Mời nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
                if(!address.equals("a")){
                    Toast.makeText(getActivity(),"Mời nhập lại thông tin",Toast.LENGTH_SHORT).show();
                }
                if(fullName.equals("l")||phone.equals("a")||date.equals("a")||address.equals("a")||email.equals("a")||gender.equals("a")){
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment,new StudentFragment());
                    fragmentTransaction.commit();
                }
                else{
                    Toast.makeText(getActivity(), "Sai Email hoặc Password. Mời nhập lại .", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnCv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,new HomeFragment());
                fragmentTransaction.commit();
            }
        });
        btnUpload.setOnClickListener(new View.OnClickListener() {
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
