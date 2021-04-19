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
import com.tutoringcenter.ldnd.models.Class;

import java.util.List;

public class CustomAdapterClass extends ArrayAdapter<Class> {
    private Context context;
    private int resource;
    private List<Class> lops;

    public CustomAdapterClass(@NonNull Context context, int resource, @NonNull List<Class> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.lops = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_class, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvid = (TextView) convertView.findViewById(R.id.tv_id);
            viewHolder.tvidlop = (TextView) convertView.findViewById(R.id.tv_idlop);
            viewHolder.tvtenlop = (TextView) convertView.findViewById(R.id.tv_tenlop);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Class lop = lops.get(position);
        viewHolder.tvid.setText(String.valueOf(lop.getId()));
        viewHolder.tvidlop.setText(lop.getIdlop());
        viewHolder.tvtenlop.setText(lop.getTenlop());
        return convertView;
    }

    public class ViewHolder {
        private TextView tvid;
        private TextView tvidlop;
        private TextView tvtenlop;

    }
}
