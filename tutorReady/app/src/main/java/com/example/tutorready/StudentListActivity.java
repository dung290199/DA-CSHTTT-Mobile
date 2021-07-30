package com.example.tutorready;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tutorready.adapter.StudentListViewAdapter;
import com.example.tutorready.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ///   List<View> a=getView();

        List<Student> image_details = getListStudentData();
        final ListView listView = (ListView) findViewById(R.id.lv_listView);
        TextView textTittle = (TextView) findViewById(R.id.tv_tittle);
        listView.setAdapter(new StudentListViewAdapter(this, image_details));
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

    private List<Student> getListStudentData() {
        List<Student> list = new ArrayList<Student>();
        Student vietnam = new Student("Nguyễn Lê Na", "vn", "234324234");
        Student usa = new Student("Trần Minh", "us", "43234234234");
        Student russia = new Student("Bùi Thanh Hải", "ru", "3242342342");
        Student loan = new Student("Trần Gia Bảo", "ru", "324234234");

        Student a = new Student("Nguyễn Thị Hạnh", "vn", "2342342");
        Student b = new Student("Trần Anh Minh", "us", "42342342");
        Student c = new Student("Bùi Thanh ", "ru", "3242342");
        Student d = new Student("Lê Gia Khang", "ru", "23432423");

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(loan);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        return list;
    }
}