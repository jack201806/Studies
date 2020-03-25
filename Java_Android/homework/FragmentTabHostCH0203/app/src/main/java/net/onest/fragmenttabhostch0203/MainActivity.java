package net.onest.fragmenttabhostch0203;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import net.onest.fragmenttabhostch0203.fragment.FirstFragment;
import net.onest.fragmenttabhostch0203.fragment.SecondFragment;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Map<String, ImageView> imageViewMap = new HashMap<>();
    private Map<String, TextView> textViewMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取FragmentTabHost的引用
        FragmentTabHost fragmentTabHost = findViewById(android.R.id.tabhost);
        //初始化
        fragmentTabHost.setup(this,
                getSupportFragmentManager(),//管理多个Fragment对象的管理器
                android.R.id.tabcontent);//显示内容页面的控件的id

        //创建内容页面TabSpec对象
        TabHost.TabSpec tab1 = fragmentTabHost.newTabSpec("first_tab")
                .setIndicator(getTabSpecView("first_tab","短信",R.drawable.message));
//                .setIndicator("短信");
        //Class参数：类名.class,对象.getClass()
        fragmentTabHost.addTab(tab1,
                FirstFragment.class,//FristFragment类的Class（字节码）对象
                null);//传递数据时使用，不需要传递数据直接传null

        TabHost.TabSpec tab2 = fragmentTabHost.newTabSpec("second_tab")
                .setIndicator(getTabSpecView("second_tab","联系人",R.drawable.contact));
//                .setIndicator("联系人");
        fragmentTabHost.addTab(tab2,
                SecondFragment.class,//SecondFragment类的Class对象
                null);

        //处理fragmentTabHost的选项切换事件
        fragmentTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                //修改图片和文字的颜色
                switch (tabId){
                    case "first_tab"://选中了短信
                        imageViewMap.get("first_tab").setImageResource(R.drawable.message1);
                        imageViewMap.get("second_tab").setImageResource(R.drawable.contact);
                        break;
                    case "second_tab"://选中了联系人
                        imageViewMap.get("first_tab").setImageResource(R.drawable.message);
                        imageViewMap.get("second_tab").setImageResource(R.drawable.contact1);
                        break;
                }
            }
        });

        //设置默认选中的标签页:参数是下标
        fragmentTabHost.setCurrentTab(0);
        imageViewMap.get("first_tab").setImageResource(R.drawable.message1);
        //setTextColor不能直接传入color资源的id号
        textViewMap.get("first_tab").setTextColor(getResources().getColor(android.R.color.black));
    }

    public View getTabSpecView(String tag, String tilte, int drawable){
        View view = getLayoutInflater().inflate(R.layout.tab_spec_layout,null);

        //获取tab_spec_layout布局当中视图控件的引用
        ImageView icon = view.findViewById(R.id.icon);
        icon.setImageResource(drawable);

        //将ImageView对象存储到Map中
        imageViewMap.put(tag,icon);

        TextView tvTitle = view.findViewById(R.id.title);
        tvTitle.setText(tilte);

        textViewMap.put(tag,tvTitle);

        return view;
    }
}
