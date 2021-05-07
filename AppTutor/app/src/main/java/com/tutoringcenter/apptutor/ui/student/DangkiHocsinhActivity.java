package com.tutoringcenter.apptutor.ui.student;

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
import com.tutoringcenter.apptutor.Doimatkhau;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ui.tutor.ThongtincanhangiasuActivity;

public class DangkiHocsinhActivity extends Fragment {
    Button btnConfirm;
    EditText edtFullName,edtPhone,edtBirthday,edtAddress,edtEmail,edtGender;
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_dangkithongtinhocsinh,container,false);

        btnConfirm=(Button) view.findViewById(R.id.btn_confirm);
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



        return view;
    }

}
