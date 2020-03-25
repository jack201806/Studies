package net.onest.customadapterch0203;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context mContext;
    private List<Student> students = new ArrayList<>();
    private int itemLayoutRes;

    public CustomAdapter(Context mContext, List<Student> students, int itemLayoutRes) {
        this.mContext = mContext;
        this.students = students;
        this.itemLayoutRes = itemLayoutRes;
    }

    @Override
    public int getCount() {//获得数据的条数
        if (null != students){
            return students.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {//获取每个item显示的数据对象
        if (null != students){
            return students.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {//获取每个item的id值
        return position;
    }

    @Override
    //获取item的视图对象
    public View getView(final int position, View convertView, ViewGroup parent) {
        //convertView每个item的视图对象
        //加载item的布局文件
        if (convertView==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(itemLayoutRes, null);
        }//优化，convertView不为空就直接往下运行

        //获取item控件的引用
        ImageView ivPhoto = convertView.findViewById(R.id.iv_photo);
        TextView tvName = convertView.findViewById(R.id.tv_name);
        TextView tvNo = convertView.findViewById(R.id.tv_no);
        Button btn_del = convertView.findViewById(R.id.btn_del);

        //设置控件内容
        ivPhoto.setImageResource(students.get(position).getPhotoId());
        tvName.setText(students.get(position).getName());
        tvNo.setText(students.get(position).getStuNo());

        //设置控件事件监听器
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //从数据源中删除某种数据
                students.remove(position);
                //更新Adapter
                notifyDataSetChanged();
            }
        });

        return convertView;
    }
}
