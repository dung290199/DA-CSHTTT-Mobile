package com.tutoringcenter.apptutor;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.tutoringcenter.apptutor.models.Grade;

import java.util.ArrayList;
import java.util.List;

public class ClassListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        List<View> a=getView();

        List<Grade> image_details = getListClassData();
        final ListView listView = (ListView) findViewById(R.id.lv_listView);
        TextView textTittle=(TextView) findViewById(R.id.tv_tittle) ;
        textTittle.setText("Danh sách lớp");

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View view, int position, long id) {
             //   TextView v = (TextView) view.findViewById(R.id.tv_salary);
                Toast.makeText(getApplicationContext(), "selected Item Name is ", Toast.LENGTH_LONG).show();

            }
        });
    }

    private  List<Grade> getListClassData() {


        List<Grade> list = new ArrayList<Grade>();
        Grade vietnam = new Grade("1","Le Loan","12/12/1990") ;

        Grade usa = new Grade("2","Le Loan", "12/12/1990");
        Grade russia = new Grade("3","Le Loan", "12/12/1990") ;

        Grade loan = new Grade("4","Le Loan","12/12/1990") ;


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