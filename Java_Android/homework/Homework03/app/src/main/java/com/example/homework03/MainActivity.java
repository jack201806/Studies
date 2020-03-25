package com.example.homework03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.graphics.Color;
import android.os.Bundle;
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
        fm.setup(this,
                getSupportFragmentManager(),
                android.R.id.tabcontent);
        TabHost.TabSpec t1 = fm.newTabSpec("satu").setIndicator(getTabSpecView("satu","公积金贷款",R.drawable.first));
        TabHost.TabSpec t2 = fm.newTabSpec("dua").setIndicator(getTabSpecView("dua","商业贷款",R.drawable.second));
        TabHost.TabSpec t3 = fm.newTabSpec("tiga").setIndicator(getTabSpecView("tiga","组合贷款",R.drawable.third));
        fm.addTab(t1,LoanActivity_1.class,null);
        fm.addTab(t2,LoanActivity_2.class,null);
        fm.addTab(t3,LoanActivity_3.class,null);
        fm.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                switch (tabId){
                    case "satu":
                        imageViewMap.get("satu").setImageResource(R.drawable.first1);
                        textViewMap.get("satu").setTextColor(Color.rgb(0,133,119));
                        imageViewMap.get("dua").setImageResource(R.drawable.second);
                        textViewMap.get("dua").setTextColor(Color.rgb(64,64,64));
                        imageViewMap.get("tiga").setImageResource(R.drawable.third);
                        textViewMap.get("tiga").setTextColor(Color.rgb(64,64,64));
                        break;
                    case "dua":
                        imageViewMap.get("satu").setImageResource(R.drawable.first);
                        textViewMap.get("satu").setTextColor(Color.rgb(64,64,64));
                        imageViewMap.get("dua").setImageResource(R.drawable.second1);
                        textViewMap.get("dua").setTextColor(Color.rgb(0,133,119));
                        imageViewMap.get("tiga").setImageResource(R.drawable.third);
                        textViewMap.get("tiga").setTextColor(Color.rgb(64,64,64));
                        break;
                    case "tiga":
                        imageViewMap.get("satu").setImageResource(R.drawable.first);
                        textViewMap.get("satu").setTextColor(Color.rgb(64,64,64));
                        imageViewMap.get("dua").setImageResource(R.drawable.second);
                        textViewMap.get("dua").setTextColor(Color.rgb(64,64,64));
                        imageViewMap.get("tiga").setImageResource(R.drawable.third1);
                        textViewMap.get("tiga").setTextColor(Color.rgb(0,133,119));
                        break;
                }
            }
        });
        fm.setCurrentTab(0);
        imageViewMap.get("satu").setImageResource(R.drawable.first1);
        textViewMap.get("satu").setTextColor(Color.rgb(0,133,119));
    }

    public View getTabSpecView(String tag,String title,int drawable){
        View view = getLayoutInflater().inflate(R.layout.tab_spec_layout,null);

        ImageView icon = view.findViewById(R.id.icon);
        icon.setImageResource(drawable);
        imageViewMap.put(tag,icon);

        TextView tt = view.findViewById(R.id.title);
        tt.setText(title);
        textViewMap.put(tag,tt);

        return view;
    }
}
