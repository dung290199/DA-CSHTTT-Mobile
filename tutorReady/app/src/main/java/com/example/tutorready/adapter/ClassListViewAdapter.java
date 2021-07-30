package com.example.tutorready.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tutorready.R;
import com.example.tutorready.models.Grade;

import java.util.List;

public class ClassListViewAdapter extends ArrayAdapter<Grade> {

    private List<Grade> listData;
    private LayoutInflater layoutInflater;
    private Context context;
    public ClassListViewAdapter(Context context, int item_class, List<Grade> listData){
        super(context,item_class,listData);
        this.context = context;
        this.listData=listData;
        listData=listData;
    }

    @Override
    public int getCount() {
        return listData.size();
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.lichday, null);
            holder = new ViewHolder();
//            holder.id = (TextView) convertView.findViewById(R.id.textView_countryName);
//            holder.nameClass = (TextView) convertView.findViewById(R.id.textView_countryName);
//            holder.request = (TextView) convertView.findViewById(R.id.textView_population);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Grade student = this.listData.get(position);
        holder.id.setText(student.getIdlop());
        holder.nameClass.setText(student.getTenlop());
        holder.request.setText(student.getRequest());

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
        TextView nameClass;
        TextView request;
    }

}