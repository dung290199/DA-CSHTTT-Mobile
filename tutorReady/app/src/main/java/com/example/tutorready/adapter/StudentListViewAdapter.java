package com.example.tutorready.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tutorready.R;
import com.example.tutorready.models.Student;

import java.util.List;

public class StudentListViewAdapter extends BaseAdapter {

    private List<Student> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public StudentListViewAdapter(Context aContext, List<Student> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_student, null);
            holder = new ViewHolder();
            holder.fullName = (TextView) convertView.findViewById(R.id.tv_fullName);
            holder.address = (TextView) convertView.findViewById(R.id.tv_address);
            holder.phone = (TextView) convertView.findViewById(R.id.tv_phone);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Student student = this.listData.get(position);
        holder.fullName.setText(student.getFullname());
        holder.address.setText(student.getAddress());
        holder.phone.setText(student.getPhone());

    //    int imageId = this.getMipmapResIdByName(student.getUsername());

//        holder.flagView.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
//    public int getMipmapResIdByName(String resName)  {
//        String pkgName = context.getPackageName();
//        // Return 0 if not found.
//        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
//        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
//        return resID;
//        //loan
//    }

    static class ViewHolder {
        TextView fullName;
        TextView address;
        TextView phone;
    }

}