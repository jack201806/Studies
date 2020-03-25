package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
////        setContentView(R.layout.layout_02);
//        //创建LinearLayout
//        LinearLayout ll = new LinearLayout(this);
//        //设置布局属性
//        ll.setOrientation(LinearLayout.HORIZONTAL);
//
//        //创建视图对象
//        Button btn_confirm = new Button(this);
//        //设置控件对象的属性
//        btn_confirm.setText("确定");
//
//        //将控件对象添加到布局
//        ll.addView(btn_confirm);
//        setContentView(ll);
        setContentView(R.layout.gl);

        Button seyeon = findViewById(R.id.seyeon);
        Button weon = findViewById(R.id.weon);
        Button teoh = findViewById(R.id.teoh);
        Button tsae = findViewById(R.id.tsae);

        //设置随机色
        Random myR = new Random();
        int rc = 0xff000000|myR.nextInt(0x00ffffff);
        seyeon.setBackgroundColor(rc);
        int rc1 = 0xff000000|myR.nextInt(0x00ffffff);
        weon.setBackgroundColor(rc1);
        int rc2 = 0xff000000|myR.nextInt(0x00ffffff);
        teoh.setBackgroundColor(rc2);
        int rc3 = 0xff000000|myR.nextInt(0x00ffffff);
        tsae.setBackgroundColor(rc3);
    }
}
