package net.onest.customadapterch0203;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> students = new ArrayList<>();
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //准备数据
        initData();
        //定义item布局文件(自定义)
        //创建Adapter，绑定Adapter
        initView();
        addStudent();
        //设置监听器
//        TextView tvName = findViewById(R.id.tv_name);--把这个写到这里会空引用
//        tvName.setText(students.get(position).getName());--再去引用这个就会出错，程序将不会正确打开
    }

    public void initView(){
        customAdapter = new CustomAdapter(this, students,
                R.layout.student_list_item);
        ListView stuListView = findViewById(R.id.lv_student);
        stuListView.setAdapter(customAdapter);
        stuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //打印选中学生的姓名
                Log.e("选中的学生姓名",students.get(position).getName());
                Log.e("选中的学生学号",students.get(position).getStuNo());
            }
        });
    }

    public void initData(){
        Student stu1 = new Student("张三","2018011785",R.drawable.boy);
        Student stu2 = new Student("李四","20180011786",R.drawable.girl);
//        Student stu3 = new Student("张三","2018011785",R.drawable.boy);
//        Student stu4 = new Student("李四","20180011786",R.drawable.girl);
//        Student stu5 = new Student("张三","2018011785",R.drawable.boy);
//        Student stu6 = new Student("李四","20180011786",R.drawable.girl);
        students.add(stu1);
        students.add(stu2);
//        students.add(stu3);
//        students.add(stu4);
//        students.add(stu5);
//        students.add(stu6);
    }

    public void addStudent(){
        Button btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //添加学生
                Student stu = new Student("王五","2018011787",R.drawable.boy);
                //修改数据源
                students.add(stu);
                //更新数据源
                customAdapter.notifyDataSetChanged();
            }
        });
    }
}