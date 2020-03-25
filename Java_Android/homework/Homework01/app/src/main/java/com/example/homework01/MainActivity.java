package com.example.homework01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.title01);
        title.setGravity(Gravity.CENTER);
        String tStr = "<big><big><big>分享生活 发现世界</big></big></big>";
        title.setText(Html.fromHtml(tStr));

        Button get = findViewById(R.id.Get);
        get.setTextColor(Color.WHITE);
        get.setOnClickListener(new View.OnClickListener() {

            EditText tel = findViewById(R.id.tel);
            TextView notice = findViewById(R.id.notice);

            @Override
            public void onClick(View v) {
                if(tel.getText().toString().length()==0){
                    Log.e("telError","手机号码不能为空！");
                    String notice_0 = "<font color='#ff0000'>手机号码不能为空！</font>";
                    notice.setText(Html.fromHtml(notice_0));
                }
                else if(tel.getText().toString().length()!=11){
                    Log.e("telError","手机号码格式错误");
                    String notice_x = "<font color='#ff0000'>手机号码格式错误，请重试</font>";
                    notice.setText(Html.fromHtml(notice_x));
                }
                else {
                    Log.e("tel","手机号码正确");
                    String notice_11 = "<font color='#00ff00'>手机号码正确</font>";
                    notice.setText(Html.fromHtml(notice_11));
                }
            }
        });

    }
}
