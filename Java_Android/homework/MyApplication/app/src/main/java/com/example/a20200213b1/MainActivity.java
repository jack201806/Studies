package com.example.a20200213b1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signup = findViewById(R.id.signup);
        signup.setTextColor(Color.WHITE);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//点击当前按钮会自动调用
                Log.e("MainActivity","按钮已点击");
            }
        });

        Button cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MainActivity","取消");
            }
        });
        //获取控件的引用
        RadioGroup gender = findViewById(R.id.gender);
        final RadioButton setisa = findViewById(R.id.setisa);
        final RadioButton seteman_kyo = findViewById(R.id.seteman_kyo);
        //注册监听器
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //选中单选按钮
                switch (checkedId){
                    case R.id.setisa://选中男
                        setisa.setChecked(true);
                        seteman_kyo.setChecked(false);
                        break;
                    case R.id.seteman_kyo:
                        seteman_kyo.setChecked(true);
                        setisa.setChecked(false);
                        break;
                }
            }
        });

        //获取布局文件中视图控件的对象
//        TextView tvText = findViewById(R.id.tv_hello);
//        tvText.setText("Hello Android!");

        //使用Java代码创建视图界面
        //Context环境上下文
//        TextView tvC = new TextView(this);//TextView是context子类类型，有向上转型的事情
//        tvC.setText("这里用的是Java代码");
//        setContentView(tvC);
    }
}
