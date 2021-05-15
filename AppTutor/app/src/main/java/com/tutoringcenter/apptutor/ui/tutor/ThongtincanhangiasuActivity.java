package com.tutoringcenter.apptutor.ui.tutor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.Doimatkhau;
import com.tutoringcenter.apptutor.Main;
import com.tutoringcenter.apptutor.Main22;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.SpinnerFunction;
import com.tutoringcenter.apptutor.admin.Review;

import java.io.FileNotFoundException;
import java.io.InputStream;

import static android.app.Activity.RESULT_OK;

public class ThongtincanhangiasuActivity extends Fragment {
    Spinner spinner;
    SpinnerFunction sf;
    ImageView imgAvarta;
    View view;
    Button button;
    public ThongtincanhangiasuActivity(){};
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
     //   mTestArray = getResources().getStringArray(R.array.Spinner_detail_tutor);
        view=inflater.inflate(R.layout.fragment_thongtincanhangiasu,container,false);
        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);
        FragmentTransaction fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();

        button=view.findViewById(R.id.btn_confirm);
        imgAvarta=view.findViewById(R.id.img_avatar);
        imgAvarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/+");
                startActivityForResult(Intent.createChooser(intent,"Pick an image"),1);

//                    Intent intent = new Intent(getActivity(), Main22.class);
//                    intent.putExtra("some","some data");
//                    startActivity(intent);
                Intent i = new Intent(getActivity(), Main.class); startActivity(i);
            }
        });
        button=view.findViewById(R.id.btn_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/+");
                startActivityForResult(Intent.createChooser(intent,"Pick an image"),1);
            }
        });
        spinner=toolbar.findViewById(R.id.Spinner_detail);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                int a= (int) spinner.getItemIdAtPosition(position);
                String  SpinerValue3 = spinner.getItemAtPosition(position).toString();
                if (a==0) {

                    fragmentTransaction.replace(R.id.nav_host_fragment, new Review());
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
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 1) {
            ImageView imageView = view.findViewById(R.id.img_avatar);

            try {
                InputStream inputStream = getActivity().getContentResolver().openInputStream(data.getData());
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                imageView.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
