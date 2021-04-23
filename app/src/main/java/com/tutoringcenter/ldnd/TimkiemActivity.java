package com.tutoringcenter.ldnd;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TimkiemActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btnSignup;
    private Spinner spnCity;

    private Button btnCity;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timkiem);
        Spinner subjects = findViewById(R.id.subjects);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.Spinner_Subjects,
                R.layout.spinner_layout
        );
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        subjects.setAdapter(adapter);
        subjects.setOnItemSelectedListener(this);

        Spinner levels = findViewById(R.id.levels);
        ArrayAdapter adapterLevels = ArrayAdapter.createFromResource(
                this,
                R.array.Spinner_Levels,
                R.layout.spinner_layout
        );
        adapterLevels.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        levels.setAdapter(adapterLevels);
        levels.setOnItemSelectedListener(this);

        Spinner requests = findViewById(R.id.requests);
        ArrayAdapter adapterRequests = ArrayAdapter.createFromResource(
                this,
                R.array.Spinner_Requests,
                R.layout.spinner_layout
        );
        adapterRequests.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        requests.setAdapter(adapterRequests);
        requests.setOnItemSelectedListener(this);

        Spinner area = findViewById(R.id.area);
        ArrayAdapter adapterArea = ArrayAdapter.createFromResource(
                this,
                R.array.Spinner_Area,
                R.layout.spinner_layout
        );
        adapterArea.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        area.setAdapter(adapterArea);
        area.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
