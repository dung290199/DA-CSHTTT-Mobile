package com.tutoringcenter.apptutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tutoringcenter.apptutor.ui.home.HomeFragment;

public class ThongtingiasuActivity extends Fragment {
    Spinner tutor;
    BottomNavigationView bottomNav;
    ViewPager viewPaper;
    ArrayAdapter<String> arrayAdapter;
    String[] mTestArray;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
     //   mTestArray = getResources().getStringArray(R.array.Spinner_detail_tutor);
        View view=inflater.inflate(R.layout.fragment_thongtingiasu,container,false);
        tutor = (Spinner) view.findViewById(R.id.Spinner_detail);

//        arrayAdapter=new ArrayAdapter(getActivity(),
//                R.layout.fragment_thongtingiasu,mTestArray);

      //  tutor.setAdapter(arrayAdapter);

//        tutor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onItemSelected(AdapterView<?> parent, View view,
//                                       int position, long id) {
//
//                switch (position) {
//                    case 0:
//                        Intent intent = new Intent(getActivity(), NewTrangchinhActivity.class);
//                        startActivity(intent);
//                    case 1:
//                        Toast.makeText(parent.getContext(), "Spinner item 2!", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 2:
//                        Toast.makeText(parent.getContext(), "Spinner item 3!", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 3:
//                        Toast.makeText(parent.getContext(), "Spinner item 2!", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 4:
//                        Toast.makeText(parent.getContext(), "Spinner item 3!", Toast.LENGTH_SHORT).show();
//                        break;}
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

        return view;
    }

}
