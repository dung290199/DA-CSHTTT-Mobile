package com.tutoringcenter.ldnd.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tutoringcenter.ldnd.R;
import com.tutoringcenter.ldnd.models.Teacher;

import java.util.List;

public class CustomAdapterStudent extends ArrayAdapter<Teacher> {
    private Context context;
    private int resoult;
    private List<Teacher> teacherList;
    public CustomAdapterStudent(@NonNull Context context, int resource, @NonNull List<Teacher> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resoult=resource;
        this.teacherList =objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Viewholder viewholder ;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_teacher,parent,false);
            viewholder=new Viewholder();
            viewholder.tv_id=convertView.findViewById(R.id.tv_id);
            viewholder.tv_n=convertView.findViewById(R.id.tv_nganh);
            viewholder.tv_ten=convertView.findViewById(R.id.tv_ten);

            viewholder.tv_email=convertView.findViewById(R.id.tv_email);
            viewholder.tv_sdt=convertView.findViewById(R.id.tv_sdt);

            convertView.setTag(viewholder);
        }else{
            viewholder= (Viewholder) convertView.getTag();
        }
        Teacher teacher = teacherList.get(position);
        viewholder.tv_id.setText(String.valueOf(teacher.getFullname()));
        viewholder.tv_ten.setText(teacher.getUsername());
        viewholder.tv_n.setText(teacher.getCv());
        viewholder.tv_email.setText(teacher.getEmail());
        viewholder.tv_sdt.setText(teacher.getPhone());

        return convertView;
    }
    public class Viewholder{
        TextView tv_id;
        TextView tv_n;
        TextView tv_ten;
        TextView tv_sdt;
        TextView tv_email;
    }
}
