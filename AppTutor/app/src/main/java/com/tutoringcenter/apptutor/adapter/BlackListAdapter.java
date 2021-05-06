package com.tutoringcenter.apptutor.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.models.Black;

import java.util.List;

public class BlackListAdapter extends BaseAdapter {
    private List<Black> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public BlackListAdapter(Context aContext, List<Black> listData) {
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
            convertView = layoutInflater.inflate(R.layout.item_black, null);
            holder = new ViewHolder();
            holder.fullName = (TextView) convertView.findViewById(R.id.tv_fullName);
            holder.phone = (TextView) convertView.findViewById(R.id.tv_phone);
            holder.grade = (TextView) convertView.findViewById(R.id.tv_grade);
            holder.reason = (TextView) convertView.findViewById(R.id.tv_reason);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Black student = this.listData.get(position);
        holder.fullName.setText(student.getFullName());
        holder.grade.setText(student.getGrade());
        holder.phone.setText(student.getPhone());
        holder.reason.setText(student.getReason());

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
        TextView grade;
        TextView phone;
        TextView reason;
    }

}