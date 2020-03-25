package net.onest.arrayadapterch0203;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView使用步骤：
        //1.准备数据源
        String[] names = {"Android基础开发","Android高级编程","Android综合应用"};
        //2.准备item的布局文件（SDK自带的布局文件）
        //3.选择一种Adapter，绑定Adapter
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,//环境上下文
                android.R.layout.simple_list_item_1,//item的布局文件
                names);//数据源
        ListView nameListView = findViewById(R.id.lv_names);
        nameListView.setAdapter(myAdapter);
        //4.给ListView设置item点击事件的监听器
        nameListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //parent是ListView对象
                //view是点击的item的视图对象
                //position是点击的item的位置，从0开始
                Log.e("点击ListView中position",position + "条");
                Log.e("点击ListView中id",id + "条");
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });
    }
}
