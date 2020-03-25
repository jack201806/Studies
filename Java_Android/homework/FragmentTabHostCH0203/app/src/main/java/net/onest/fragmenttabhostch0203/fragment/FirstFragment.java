package net.onest.fragmenttabhostch0203.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.onest.fragmenttabhostch0203.R;

//第一个内容页面对应的Fragment类
public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //加载内容页面的布局文件（将内容页面的XML布局文件转成View类型的对象）
        View view = inflater.inflate(R.layout.fragment_layout,//内容页面的布局文件
                container,//根视图对象
                false);//false表示需要手动调用addView方法将view添加到container
                                     //true表示不需要手动调用addView方法

        //获取内容页面当中控件的引用
        TextView tvContent = view.findViewById(R.id.tv_content);
        tvContent.setText("这是第一个内容页面");

        return view;
    }
}
