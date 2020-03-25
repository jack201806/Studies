package com.example.tbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.引用TabHost
        TabHost tabHost = findViewById(android.R.id.tabhost);
        //2.初始化tabHost
        tabHost.setup();
        //3.创建TabSpe页面
        TabHost.TabSpec tab1 = tabHost.newTabSpec("msg").
                setIndicator("短信")//选项按钮显示的文字
                .setContent(R.id.tab1);//**页面对应的布局
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2 = tabHost.newTabSpec("con").
                setIndicator("联系人")//选项按钮显示的文字
                .setContent(R.id.tab2);//**页面对应的布局
        tabHost.addTab(tab2);
        TabHost.TabSpec tab3 = tabHost.newTabSpec("mail").
                setIndicator("邮件")//选项按钮显示的文字
                .setContent(R.id.tab3);//**页面对应的布局
        tabHost.addTab(tab3);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {//当切换选项按钮时调用
                Log.e("切换选项",tabId);
            }
        });
    }
}
