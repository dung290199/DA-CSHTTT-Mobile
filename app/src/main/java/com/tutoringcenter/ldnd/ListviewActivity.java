package com.tutoringcenter.ldnd;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);


        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(ListviewActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Phản hồi : Nhấp vào Phản hồi để trực tiếp phản hồi một bình luận.\n" +
                "Gửi trái tim: Chọn biểu tượng trái tim  bên dưới một bình luận để thể hiện sự cảm kích.\n" +
                "Thích: Chọn biểu tượng thích  để thể hiện bạn thích một bình luận.\n" +
                "Không thích: Chọn biểu tượng không thích  để thể hiện bạn không thích một bình luận.\n" +
                "Ghim: Chọn biểu tượng Thêm  sau đó Ghim để làm nổi bật một bình luận lên đầu trang xem video của bạn. Tùy chọn này chỉ xuất hiện khi bạn xem bình luận của từng video.", "vn", 98000000);
        Country usa = new Country("United States", "us", 320000000);
        Country russia = new Country("Russia", "ru", 142000000);
        Country loan = new Country("loan", "ru", 142000000);
        Country lee = new Country("lee", "ru", 142000000);
        Country anh = new Country("anh", "ru", 142000000);

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(loan);list.add(lee);list.add(anh);
        return list;
    }

}