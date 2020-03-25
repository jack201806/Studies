package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private  List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //ListView使用步骤：
//        //1.准备数据源
//        String[] names = {"Android基础开发","Android高级编程","Android综合应用"};
//        //2.准备item的布局文件
//        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                names);//数据源
//        ListView lsv = findViewById(R.id.lsv);
//        lsv.setAdapter(myAdapter);
//        //3.选择一种Adapter，绑定Adapter
//        //4.给ListView设置一个item点击事件的监听器
//        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {//position值和id值一样（笑哭）
//                //parent是ListView对象
//                //view是点击的item的视图对象
//                //position是点击的item对象，从0开始
//                Log.e("ListViewPosition",position+"条");
//                Log.e("ListViewID",id+"条");
//                view.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
//            }
//        });
//        ------------
//        //准备数据源
//        List<Map<String,String>> stu = new ArrayList<Map<String,String>>();
//        Map<String,String> s1 = new HashMap<>();
//        s1.put("姓名","张三");
//        s1.put("学号","2018011785");
//        Map<String,String> s2 = new HashMap<>();
//        s2.put("姓名","李四");
//        s2.put("学号","2018011792");
//        Map<String,String> s3 = new HashMap<>();
//        s3.put("姓名","王五");
//        s3.put("学号","2018011806");
//        stu.add(s1);
//        stu.add(s2);
//        stu.add(s3);
//        //准备item布局文件
//
//        //创建并绑定Adapter
//        SimpleAdapter myA = new SimpleAdapter(this,//环境上下文
//                stu,//数据源
//                android.R.layout.simple_list_item_2,//item的布局文件
//                new String[]{"姓名","学号"},//可以创建一个匿名数组->数据源中Map的k值
//                new int[]{android.R.id.text1,android.R.id.text2});//item布局中显示内容的控件的id
//
//        ListView stuLsv = findViewById(R.id.lv_stu);
//        stuLsv.setAdapter(myA);
//        //设置ListView的监听器
//      ----------
        //准备数据
        //准备数据
        initData();
        //定义item布局文件
        //创建并绑定Adapter
        CustomAdapter cta = new CustomAdapter(this,students,R.layout.ctlayout);
        ListView stv = findViewById(R.id.lv_stu_1);
        stv.setAdapter(cta);
        //设置监听器
    }
    public void  initData(){
        Student s1 = new Student("张三","2018011785",R.drawable.satu);
        Student s2 = new Student("李四","2018011792",R.drawable.dua);
        Student s3 = new Student("王五","2018011806",R.drawable.tiga);
        students.add(s1);
        students.add(s2);
        students.add(s3);
    }
}
