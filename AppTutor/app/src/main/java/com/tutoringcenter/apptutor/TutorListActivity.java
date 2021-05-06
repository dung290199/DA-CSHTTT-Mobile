package com.tutoringcenter.apptutor;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.tutoringcenter.apptutor.adapter.TutorListViewAdapter;
import com.tutoringcenter.apptutor.models.Tutor;

import java.util.ArrayList;
import java.util.List;

public class TutorListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        List<View> a=getView();

        List<Tutor> image_details = getListTutorData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        TextView textTittle=(TextView) findViewById(R.id.tv_tittle) ;
        listView.setAdapter(new TutorListViewAdapter(this, image_details));
        textTittle.setText("Danh sách gia sư");

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View view, int position, long id) {
                //   TextView v = (TextView) view.findViewById(R.id.tv_salary);
                Toast.makeText(getApplicationContext(), "selected Item Name is ", Toast.LENGTH_LONG).show();

            }
        });
    }

    private  List<Tutor> getListTutorData() {


        List<Tutor> list = new ArrayList<Tutor>();
        Tutor vietnam = new Tutor("1","Le Loan","12/12/1990") ;

        Tutor  usa = new Tutor("2","Le Loan", "12/12/1990");
        Tutor russia = new Tutor("3","Le Loan", "12/12/1990") ;

        Tutor loan = new Tutor("4","Le Loan","12/12/1990") ;


        list.add(vietnam);
        list.add(usa);
        list.add(russia);list.add(loan);
        return list;
    }



    private  List<View> getView() {
        List<View> list = new ArrayList<View>();
        return null;
    }

}