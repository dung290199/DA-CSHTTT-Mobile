package com.tutoringcenter.apptutor.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.AppBarLayout;
import com.tutoringcenter.apptutor.Doimatkhau;
import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.adapter.BlackListAdapter;
import com.tutoringcenter.apptutor.models.Black;
import com.tutoringcenter.apptutor.ui.student.StudentFragment;
import com.tutoringcenter.apptutor.ui.tutor.ThongtincanhangiasuActivity;

import java.util.ArrayList;
import java.util.List;

public class BlackListActivityfake extends Fragment {


    Spinner spinner;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview,container,false);


        List<Black> image_details = getListTutorData();
        final ListView listView = (ListView) view.findViewById(R.id.lv_listView);
        TextView textTittle=(TextView) view. findViewById(R.id.tv_tittle) ;
        listView.setAdapter(new BlackListAdapter(getActivity(), image_details));
        textTittle.setText("Danh sách đen");

        // When the user clicks on the ListItem

        AppBarLayout toolbar = (AppBarLayout) getActivity().findViewById(R.id.appbar);

        spinner=toolbar.findViewById(R.id.Spinner_detail);

        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                fragmentTransaction.commit();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                int a= (int) spinner.getItemIdAtPosition(position);
                String  SpinerValue3 = spinner.getItemAtPosition(position).toString();

                if (a==0) {
                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new ThongtincanhangiasuActivity());
                    fragmentTransaction.commit();
                }
                if(a==1){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new BlackListActivityfake());
                    fragmentTransaction.commit();
                }
                if(a==2){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new StudentFragment());
                    fragmentTransaction.commit();
                }
                if(a==3){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, new StudentFragment());
                    fragmentTransaction.commit();
                }
                if(a==4){

                    FragmentTransaction fragmentTransaction = getActivity()
                            .getSupportFragmentManager().beginTransaction();
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

    private  List<Black> getListTutorData() {


        List<Black> list = new ArrayList<Black>();
        Black vietnam = new Black("Le C","5545455","2","Không trả tiền lương") ;
        Black usa = new Black("Le A","54444","1","Xúc phạm gia sư") ;
        Black russia = new Black("Le F","545545","3","A") ;
        Black loan = new Black("Le S","42424","3","A") ;
        Black e = new Black("Le C","5545455","2","Không trả tiền lương") ;
        Black a = new Black("Le A","54444","1","Xúc phạm gia sư") ;
        Black b = new Black("Le F","545545","3","A") ;
        Black c = new Black("Le S","42424","3","A") ;
        list.add(vietnam);
        list.add(usa);
        list.add(russia);list.add(loan);
        list.add(a);
        list.add(c);
        list.add(b);list.add(e);
        return list;
    }



}