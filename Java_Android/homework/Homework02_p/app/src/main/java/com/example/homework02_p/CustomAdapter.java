package com.example.homework02_p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context mCon;
    private List<Char> crs = new ArrayList<>();
    private int itemLayoutRes;

    public CustomAdapter(Context mCon, List<Char> crs, int itemLayoutRes) {
        this.mCon = mCon;
        this.crs = crs;
        this.itemLayoutRes = itemLayoutRes;
    }

    @Override
    public int getCount() {
        if (null!=crs){
            return crs.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(null!=crs){
            return crs.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //convertView每个ITEM的视图对象
        //加载item的布局文件
        LayoutInflater inf = LayoutInflater.from(mCon);
        convertView = inf.inflate(itemLayoutRes,null);

        ImageView ivPhoto = convertView.findViewById(R.id.iv_photo);
        TextView tvName = convertView.findViewById(R.id.tv_name);
        TextView tvNo = convertView.findViewById(R.id.tv_no);

        ivPhoto.setImageResource(crs.get(position).getPhotoID());
        tvName.setText(crs.get(position).getMyung_sam());
        tvNo.setText(crs.get(position).getSukia_sq());

        return convertView;
    }
}
