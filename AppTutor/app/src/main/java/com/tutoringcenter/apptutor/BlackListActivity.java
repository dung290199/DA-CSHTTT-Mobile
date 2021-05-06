package com.tutoringcenter.apptutor;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.tutoringcenter.apptutor.adapter.BlackListAdapter;
import com.tutoringcenter.apptutor.models.Black;

import java.util.ArrayList;
import java.util.List;

public class BlackListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        List<View> a=getView();

        List<Black> image_details = getListTutorData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        TextView textTittle=(TextView) findViewById(R.id.tv_tittle) ;
        listView.setAdapter(new BlackListAdapter(this, image_details));
        textTittle.setText("Danh sách đen");

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View view, int position, long id) {
                //   TextView v = (TextView) view.findViewById(R.id.tv_salary);
                Toast.makeText(getApplicationContext(), "selected Item Name is ", Toast.LENGTH_LONG).show();

            }
        });
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



    private  List<View> getView() {
        List<View> list = new ArrayList<View>();
        return null;
    }

}