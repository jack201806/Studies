package net.onest.androidch0202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        //使用Java代码创建LinearLayout
//        LinearLayout linearLayout = new LinearLayout(this);
//        //设置布局的属性
//        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//
//        //创建视图对象
//        Button btnOk = new Button(this);
//        //设置控件对象的属性
//        btnOk.setText("确定");
//
//        //将控件对象添加到布局(添加子视图)
//        linearLayout.addView(btnOk);
//
//        //显示到界面
//        setContentView(linearLayout);


    }
}
