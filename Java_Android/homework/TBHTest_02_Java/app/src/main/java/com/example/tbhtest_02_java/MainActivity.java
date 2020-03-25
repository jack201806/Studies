package com.example.tbhtest_02_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Map<String,ImageView> imageViewMap = new HashMap<>();
    private Map<String,TextView> textViewMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTabHost fm = findViewById(android.R.id.tabhost);
        //初始化
        fm.setup(this,
                getSupportFragmentManager(),//管理多个Fragment对象的管理器
                android.R.id.tabcontent);//显示内容页面控件的id
        //创建内容页面TabSpace
        TabHost.TabSpec tab1 = fm.newTabSpec("satu").setIndicator(getTabSpecView("satu","短信",R.drawable.smsmono));
        TabHost.TabSpec tab2 = fm.newTabSpec("dua").setIndicator(getTabSpecView("dua","联系人",R.drawable.contactmono));
        TabHost.TabSpec tab3 = fm.newTabSpec("tiga").setIndicator(getTabSpecView("tiga","位置",R.drawable.positionmono));
        //Class参数：类名.class，对象.getClass()，Class.forName()<不常用>
        fm.addTab(tab1,
                fmc_01.class,//该类的字节码对象
                null);//传递数据时使用，不需要时为null
        fm.addTab(tab2,
                fmc_02.class,
                null);
        fm.addTab(tab3,
                fmc_03.class,
                null);
        //处理fragmentTabHost的选项切换事件
        fm.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                //修改图片和文字的颜色
                switch (tabId){
                    case "satu":
                        imageViewMap.get("satu").setImageResource(R.drawable.sms);
                        textViewMap.get("satu").setTextColor(Color.rgb(26,250,41));
                        imageViewMap.get("dua").setImageResource(R.drawable.contactmono);
                        textViewMap.get("dua").setTextColor(Color.rgb(138,138,138));
                        imageViewMap.get("tiga").setImageResource(R.drawable.positionmono);
                        textViewMap.get("tiga").setTextColor(Color.rgb(138,138,138));
                        break;
                    case "dua":
                        imageViewMap.get("satu").setImageResource(R.drawable.smsmono);
                        textViewMap.get("satu").setTextColor(Color.rgb(138,138,138));
                        imageViewMap.get("dua").setImageResource(R.drawable.contact);
                        textViewMap.get("dua").setTextColor(Color.rgb(18,150,219));
                        imageViewMap.get("tiga").setImageResource(R.drawable.positionmono);
                        textViewMap.get("tiga").setTextColor(Color.rgb(138,138,138));
                        break;
                    case "tiga":
                        imageViewMap.get("satu").setImageResource(R.drawable.smsmono);
                        textViewMap.get("satu").setTextColor(Color.rgb(138,138,138));
                        imageViewMap.get("dua").setImageResource(R.drawable.contactmono);
                        textViewMap.get("dua").setTextColor(Color.rgb(138,138,138));
                        imageViewMap.get("tiga").setImageResource(R.drawable.position);
                        textViewMap.get("tiga").setTextColor(Color.rgb(216,30,6));
                        break;
                }
            }
        });

        //设置默认选中的标签页：参数是下标
        fm.setCurrentTab(0);
        imageViewMap.get("satu").setImageResource(R.drawable.sms);
        textViewMap.get("satu").setTextColor(Color.rgb(26,250,41));
    }

    public View getTabSpecView(String tag,String title, int drawable){
        View view = getLayoutInflater().inflate(R.layout.tab_spec_layout,null);

        //获取tab_spec_layout布局当中视图控件的引用
        ImageView icon = view.findViewById(R.id.icon);
        icon.setImageResource(drawable);

        //将ImageView对象存储到Map中
        imageViewMap.put(tag,icon);

        TextView tt = view.findViewById(R.id.title);
        tt.setText(title);

        textViewMap.put(tag,tt);

        return view;
    }

}
