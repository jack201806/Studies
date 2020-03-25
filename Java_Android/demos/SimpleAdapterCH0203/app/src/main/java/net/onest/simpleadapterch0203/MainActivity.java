package net.onest.simpleadapterch0203;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //准备数据源
        List<Map<String, String>> students = new ArrayList<>();
        Map<String, String> stu1 = new HashMap<>();
        stu1.put("name", "张三");
        stu1.put("stuNo", "2018011785");
        Map<String, String> stu2 = new HashMap<>();
        stu2.put("name","李四");
        stu2.put("stuNo","2018011786");
        students.add(stu1);
        students.add(stu2);
        //准备item布局文件(自带的布局文件)
        //创建Adapter，绑定Adapter
        SimpleAdapter myAdapter = new SimpleAdapter(this,//环境上下文
                students,//数据源
                android.R.layout.simple_list_item_2,//item的布局文件
                new String[]{"name","stuNo"},//数据源中Map的key值
                new int[]{android.R.id.text1, android.R.id.text2});//item布局当中显示内容的控件的id

        ListView studentListView = findViewById(R.id.lv_student);
        studentListView.setAdapter(myAdapter);
        //设置ListView的监听器
    }
}
