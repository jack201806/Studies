package net.onest.androidch0201;

import androidx.appcompat.app.AppCompatActivity;

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

        //获取布局文件中视图控件的对象
//        TextView tvText = findViewById(R.id.tv_hello);
//        tvText.setText("Hello Android!");


        //使用Java代码创建视图界面
        //Context环境上下文
//        TextView tvContent = new TextView(this);
//        tvContent.setText("我是使用Java代码创建的");
//        setContentView(tvContent);


        //处理按钮的点击事件
        Button btnReg = findViewById(R.id.btn_reg);
        //注册监听器
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//点击当前按钮会自动调用
                Log.e("MainActivity","点击了按钮");
            }
        });

        //获取控件的引用
        RadioGroup rgGender = findViewById(R.id.rg_gender);
        final RadioButton rbBoy = findViewById(R.id.rb_boy);
        final RadioButton rbGirl = findViewById(R.id.rb_girl);

        //注册监听器
        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //选中单选按钮
                switch (checkedId){
                    case R.id.rb_boy://选中男
                        rbBoy.setChecked(true);
                        rbGirl.setChecked(false);
                        break;
                    case R.id.rb_girl://选中女
                        rbBoy.setChecked(false);
                        rbGirl.setChecked(true);
                        break;
                }

            }
        });
    }
}
