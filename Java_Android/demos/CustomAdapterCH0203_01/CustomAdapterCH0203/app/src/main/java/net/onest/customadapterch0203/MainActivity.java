package net.onest.customadapterch0203;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //准备数据
        initData();
        //定义item布局文件(自定义)
        //创建Adapter，绑定Adapter
        initView();
        //设置监听器

    }
    public void initView(){
        CustomAdapter customAdapter = new CustomAdapter(this, students,
                R.layout.student_list_item);
        ListView stuListView = findViewById(R.id.lv_student);
        stuListView.setAdapter(customAdapter);
        stuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //打印选中的学生的姓名
                Log.e("选中的学生姓名",students.get(position).getName());
            }
        });
    }

    public void initData(){
        Student stu1 = new Student("张三","2018011785",R.drawable.boy);
        Student stu2 = new Student("李四","20180011786",R.drawable.girl);
        Student stu3 = new Student("张三","2018011785",R.drawable.boy);
        Student stu4 = new Student("李四","20180011786",R.drawable.girl);
        Student stu5 = new Student("张三","2018011785",R.drawable.boy);
        Student stu6 = new Student("李四","20180011786",R.drawable.girl);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);
        students.add(stu6);
    }
}
