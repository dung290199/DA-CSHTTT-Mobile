package com.tutoringcenter.apptutor.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tutoringcenter.apptutor.R;
import com.tutoringcenter.apptutor.models.Tutor;

import java.util.List;

public class TutorListViewAdapter extends BaseAdapter {

    private List<Tutor> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public TutorListViewAdapter(Context aContext, List<Tutor> listData) {
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
            convertView = layoutInflater.inflate(R.layout.item_tutor, null);
            holder = new ViewHolder();


            holder.id = (TextView) convertView.findViewById(R.id.tv_id);
            holder.fullName = (TextView) convertView.findViewById(R.id.tv_fullName);
            holder.birthday = (TextView) convertView.findViewById(R.id.tv_birthday);
//            holder.job = (TextView) convertView.findViewById(R.id.tv_job);
//            holder.workplace = (TextView) convertView.findViewById(R.id.tv_workplace);
//            holder.major = (TextView) convertView.findViewById(R.id.tv_major);
//            holder.granduate = (TextView) convertView.findViewById(R.id.tv_graduate);
//            holder.classStudy = (TextView) convertView.findViewById(R.id.tv_classStudy);
//            holder.subject = (TextView) convertView.findViewById(R.id.tv_subject);
//            holder.address = (TextView) convertView.findViewById(R.id.tv_address);
//            holder.salary = (TextView) convertView.findViewById(R.id.tv_salary);
//            holder.note = (TextView) convertView.findViewById(R.id.tv_note);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Tutor tutor = this.listData.get(position);
        holder.id.setText(tutor.getId());
        holder.fullName.setText(tutor.getFullname());
        holder.birthday.setText(tutor.getBirthday());
        //holder.job.setText(tutor.get);
        //holder.workplace.setText(tutor.);
        //holder.major.setText(tutor.get);
        //holder.granduate.setText(tutor.);
        //holder.classStudy.setText(tutor.);
        //holder.subject.setText(tutor.);
        //holder.address.setText(tutor.getAddress());
        //holder.salary.setText(tutor.);
        //holder.note.setText(tutor.);

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
        TextView id;
        TextView fullName;
        TextView birthday;
//        TextView job;
//        TextView workplace;
//        TextView major;
//        TextView granduate;
//        TextView classStudy;
//        TextView subject;
//        TextView address;
//        TextView salary;
//        TextView note;


    }

}