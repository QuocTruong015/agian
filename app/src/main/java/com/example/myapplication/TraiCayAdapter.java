package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen,txtMoTa;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //Anh xa
            holder.txtTen = (TextView) convertView.findViewById(R.id.textViewTen);
            holder.txtMoTa = (TextView) convertView.findViewById(R.id.textViewMoTa);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHinh);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        //Gan gia tri
        TraiCay traicay = traiCayList.get(position);

        holder.txtTen.setText(traicay.getTen());
        holder.txtMoTa.setText(traicay.getMoTa());
        holder.imgHinh.setImageResource(traicay.getHinh());

        return convertView;
    }
}
