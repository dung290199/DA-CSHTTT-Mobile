package com.example.tutorready;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner province, district, gender ;

    ImageView avatar;
    ImageButton imgAva;
    EditText name, phone, email, address ;

    // Thông tin chung
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        province = findViewById(R.id.spinnerProvince);
        district = findViewById(R.id.spinnerDistrict);

        String[] textProvince = getResources().getStringArray(R.array.provinces);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textProvince);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        province.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if ( parent.getId() == R.id.spinnerProvince) {

            switch (position) {
                case 0:
                    String[] textDistrict = getResources().getStringArray(R.array.hoavang);
                    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textDistrict);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    district.setAdapter(adapter);
                    break;
                case 1:
                    String[] textDistrict1 = getResources().getStringArray(R.array.camle);
                    ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textDistrict1);
                    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    district.setAdapter(adapter1);
                    break;
                case 2:
                    String[] textDistrict2 = getResources().getStringArray(R.array.haichau);
                    ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textDistrict2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    district.setAdapter(adapter2);
                    break;
                case 3:
                    String[] textDistrict3 = getResources().getStringArray(R.array.lienchieu);
                    ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textDistrict3);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    district.setAdapter(adapter3);
                    break;
                case 4:
                    String[] textDistrict4 = getResources().getStringArray(R.array.nguhanhson);
                    ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textDistrict4);
                    adapter4.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    district.setAdapter(adapter4);

                    break;
                case 5:
                    String[] textDistrict5 = getResources().getStringArray(R.array.sontra);
                    ArrayAdapter adapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textDistrict5);
                    adapter5.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    district.setAdapter(adapter5);

                    break;
                case 6:
                    String[] textDistrict6 = getResources().getStringArray(R.array.thanhkhe);
                    ArrayAdapter adapter6 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textDistrict6);
                    adapter6.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    district.setAdapter(adapter6);
                    break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
