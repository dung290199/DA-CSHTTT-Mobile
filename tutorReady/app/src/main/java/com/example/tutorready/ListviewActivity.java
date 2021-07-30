package com.example.tutorready;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tutorready.adapter.TutorListViewAdapter;
import com.example.tutorready.models.Student;
import com.example.tutorready.models.Tutor;

import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        List<View> a=getView();

        List<Tutor> image_details = getListTutorData();
        final ListView listView = (ListView) findViewById(R.id.lv_listView);
        TextView textTittle=(TextView) findViewById(R.id.tv_tittle) ;
        listView.setAdapter(new TutorListViewAdapter(this, image_details));
        textTittle.setText("loanloan");

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View view, int position, long id) {
             //   TextView v = (TextView) view.findViewById(R.id.tv_salary);
                Toast.makeText(getApplicationContext(), "selected Item Name is ", Toast.LENGTH_LONG).show();

            }
        });
    }

    private List<Student> getListData() {
        List<Student> list = new ArrayList<Student>();
        Student vietnam = new Student("Nguyễn Lê Na", "vn", "Lớp 8");
        Student usa = new Student("Trần Minh", "us", "Lớp 8");
        Student russia = new Student("Bùi Thanh Hải", "ru", "Lớp 1");
        Student loan = new Student("Trần Gia Bảo", "ru", "Lớp 5");

        Student a = new Student("Nguyễn Thị Hạnh", "vn", "Lớp 3");
        Student b = new Student("Trần Anh Minh", "us", "Lớp 4");
        Student c = new Student("Bùi Thanh ", "ru", "Lớp 1");
        Student d = new Student("Lê Gia Khang", "ru", "Lớp 7");

        list.add(vietnam);
        list.add(usa);
        list.add(russia);list.add(loan);
        list.add(a);
        list.add(b);
        list.add(c); list.add(d);
        return list;
    }
    private List<Tutor> getListTutorData() {


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



    private List<View> getView() {
        List<View> list = new ArrayList<View>();
        return null;
    }

}