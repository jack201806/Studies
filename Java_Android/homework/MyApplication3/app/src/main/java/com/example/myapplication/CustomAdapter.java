package com.example.myapplication;

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
    private List<Student> stu = new ArrayList<>();
    private int itemLayoutRes;

    public CustomAdapter(Context mCon, List<Student> stu, int itemLayoutRes) {
        this.mCon = mCon;
        this.stu = stu;
        this.itemLayoutRes = itemLayoutRes;
    }

    public CustomAdapter() {
    }

    @Override
    public int getCount() {
        if(null!=stu){
            return stu.size();
        }
        return 0;
    }//获得数据源的条数

    @Override
    public Object getItem(int position) {
        if (null!=stu){
            return stu.get(position);
        }
        return null;
    }//获取每个item显示的数据对象

    @Override
    public long getItemId(int position) {
        return position;
    }//获取每个item的id值

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载item的布局文件
        LayoutInflater inflater = LayoutInflater.from(mCon);
        convertView = inflater.inflate(R.layout.activity_main,null);

        //获取item控件的引用
        ImageView ivPhoto = convertView.findViewById(R.id.iv_photo);
        TextView tvName = convertView.findViewById(R.id.tv_name);
        TextView tvNo = convertView.findViewById(R.id.tv_no);

        //设置控件内容
        ivPhoto.setImageResource(stu.get(position).getPhotoId());
        tvName.setText(stu.get(position).getName());
        tvNo.setText(stu.get(position).getStuNo());

        return convertView;
    }//获取item的视图对象
}
