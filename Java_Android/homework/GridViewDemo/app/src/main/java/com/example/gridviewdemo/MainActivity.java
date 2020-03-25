package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        GridView gvS = findViewById(R.id.gvStudent);
        CustomAdapter myA = new CustomAdapter(this, students,
                R.layout.student_list_item);
        gvS.setAdapter(myA);
        gvS.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //同ListView一样
            }
        });
        initSpinner();
    }

    public void initData(){
        Student stu1 = new Student("张三","2018011785",R.drawable.boy);
        Student stu2 = new Student("李四","20180011786",R.drawable.girl);
        students.add(stu1);
        students.add(stu2);
    }

    public void initSpinner(){
        String[] cities = {"DP","PT","MX"};
        ArrayAdapter myAd = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                cities);
        Spinner spi = findViewById(R.id.spi);
        spi.setAdapter(myAd);
    }
}
