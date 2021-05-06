package com.tutoringcenter.apptutor.ui.student;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.ui.grade.GradeFragment;

public class StudentFragment extends Fragment {

    private StudentViewModel studentViewModel;
    Button btnFind;
    SearchView search;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        studentViewModel =
                ViewModelProviders.of(this).get(StudentViewModel.class);
        View view = inflater.inflate(R.layout.fragment_student, container, false);
        search=view.findViewById(R.id.sv_search);
        btnFind= (Button) view.findViewById(R.id.btn_find);

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Selected :" + " " + "", Toast.LENGTH_LONG).show();
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,new GradeFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}