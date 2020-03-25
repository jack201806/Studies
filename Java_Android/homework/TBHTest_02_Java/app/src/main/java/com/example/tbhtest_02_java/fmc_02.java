package com.example.tbhtest_02_java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tbhtest_02_java.R;

public class fmc_02 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //加载内容页面的布局文件（将内容页面的xml布局文件转成view类型的对象）
        View view = inflater.inflate(R.layout.fmlayout_02,//内容页面的布局文件
                container,//根视图对象
                false);//false表示需要手动调用addView方法将view添加到container对象中
                                    //true表示不需要手动调用addView方法
        //获取内容页面当中控件的引用
        TextView tvc2 = view.findViewById(R.id.tvc_02);
        tvc2.setText("456");
        return view;
    }
}
