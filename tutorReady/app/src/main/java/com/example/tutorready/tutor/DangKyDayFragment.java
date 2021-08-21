package com.example.tutorready.tutor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.tutorready.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;


public class DangKyDayFragment extends Fragment {


    String[] student,scheduals;



    public DangKyDayFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dang_ky_day,container,false);


        //Dangkyday();
        return view;
    }

    private void Dangkyday(String token, String tutorName, String className, String idSubject, String subjectName, String address, String idGrade, String gradeName, String[] listStudent, String[] listLichday) {
        RequestQueue queue = Volley.newRequestQueue(getContext());

        String url_dangkyday = "https://tutorready.herokuapp.com/api/user/course/new"; //???

        JSONObject js = new JSONObject();
        try {

            js.put("tutorName",tutorName);
            js.put("name",className);
            js.put("address",address);
            js.put("students",listStudent);
            js.put("schedules",listLichday);

            JSONObject subject = new JSONObject();
            subject.put("_id",idSubject);
            subject.put("name",subjectName);



            JSONObject grade = new JSONObject();
            grade.put("_id",idGrade);
            grade.put("name",gradeName);


            js.put("subject", subject);
            js.put("grade", grade);


        }catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(
                Request.Method.POST,url_dangkyday, js,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Toast.makeText(getContext(), "Mở lớp thành công !!!"  , Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                //Toast.makeText(getContext(), "Cập nhật thông tin không thành công !!!" +error.getMessage(), Toast.LENGTH_LONG).show();
                Toast.makeText(getContext(), "Error: " +error.toString(), Toast.LENGTH_LONG).show();
            }
        }) {


            /*
        JsonObjectRequest putRequest = new JsonObjectRequest(Request.Method.POST, url_dangkyday, js,null,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // response
                        Toast.makeText(getContext(), "Mở lớp thành công !!!"  , Toast.LENGTH_LONG).show();

                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //Toast.makeText(getContext(), "Cập nhật thông tin không thành công !!!" +error.getMessage(), Toast.LENGTH_LONG).show();
                        Toast.makeText(getContext(), "Error: " +error.toString(), Toast.LENGTH_LONG).show();

                    }
                }
        ) {

             */

            @Override
            public Map<String, String> getHeaders()
            {
                Map<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json");
                headers.put("Authorization","Bearer "+token);
                return headers;
            }

            @Override
            public byte[] getBody() {
                try {
                    Log.i("json", js.toString());
                    return js.toString().getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
        queue.add(jsonObjReq);
    }
}