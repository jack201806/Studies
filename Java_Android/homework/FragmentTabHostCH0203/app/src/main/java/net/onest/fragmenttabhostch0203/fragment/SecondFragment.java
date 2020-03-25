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

public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout,//内容页面的布局文件
                container,//根视图对象
                false);

        //获取内容页面当中控件的引用
        TextView tvContent = view.findViewById(R.id.tv_content);
        tvContent.setText("这是第二个内容页面");

        return view;
    }
}
