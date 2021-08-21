package com.example.tutorready.student;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.example.tutorready.MainActivity5;
import com.example.tutorready.MainActivity6;
import com.example.tutorready.R;


public class StudentInfoFragment extends Fragment {

    EditText edtUsername, edtEmail, edtFullname, edtPhone,edtAddress,edtBirthday;

    RadioGroup radioGroupGender;
    RadioButton male,female;
    Boolean gender, gender1;

    Button btnEdit, btnCancel, btnChooseAva, btnChooseCV;

    String id, token, username,fullname, email,phone,address, img_cv, img_ava, birthday;

    String username1,fullname1, email1,phone1,address1, img_cv1, img_ava1, birthday1;

    ImageView ava;


    public StudentInfoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student_info,container,false);

        MainActivity5 activity = (MainActivity5) getActivity();

        // Ánh xạ
        edtUsername = view.findViewById(R.id.edt_username);
        edtEmail = view.findViewById(R.id.edt_email);
        edtFullname = view.findViewById(R.id.edt_fullname);
        edtBirthday = view.findViewById(R.id.edt_birthday);
        edtAddress = view.findViewById(R.id.edt_address);
        edtPhone = view.findViewById(R.id.edt_phone);
        male = view.findViewById(R.id.radio_male);
        female = view.findViewById(R.id.radio_female);
        ava = view.findViewById(R.id.imageView);
        btnChooseAva = view.findViewById(R.id.btn_avatar);
        btnChooseCV = view.findViewById(R.id.btn_cv);

        btnEdit = view.findViewById(R.id.btn_update);
        btnCancel = view.findViewById(R.id.btn_cancel);


        // Nhận dữ liệu
        id = activity.getId();
        token = activity.getToken();

        username = activity.getUser();
        email = activity.getEmail();
        phone = activity.getPhone();
        address = activity.getAddress();
        fullname = activity.getFullname();
        birthday = activity.getBirthday();

        img_ava = activity.getAva();


        //Toast.makeText(activity.getBaseContext(), "Mời bạn nhập đầy đủ thông tin" + username, Toast.LENGTH_SHORT).show();


        // Hiển thị thông tin
        edtUsername.setText(username);
        edtEmail.setText(email);
        edtFullname.setText(fullname);
        edtBirthday.setText(birthday);
        edtAddress.setText(address);
        edtPhone.setText(phone);




        gender = activity.getGender();
        radioGroupGender = view.findViewById(R.id.radioGroup_gender);
        female = view.findViewById(R.id.radio_female);
        male = view.findViewById(R.id.radio_male);


        RequestQueue queue = Volley.newRequestQueue(getContext());

        ImageRequest imageRequest = new ImageRequest(img_ava, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                ava.setImageBitmap(response);

            }
        }, 0, 0, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                ava.setImageResource(R.drawable.hinhgiasu);

            }
        });
        queue.add(imageRequest);
        return view;
    }
}