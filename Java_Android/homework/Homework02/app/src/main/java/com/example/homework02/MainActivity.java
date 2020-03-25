package com.example.homework02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Goods> goods = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        CustomAdapter cta = new CustomAdapter(this,goods,R.layout.custom_itm);
        ListView goodsView = findViewById(R.id.lvs);
        goodsView.setAdapter(cta);
    }

    public void initData(){
        Goods weon = new Goods("华为旗舰店",
                "正品Huawei/华为Mate9全网通4G双卡双待指纹徕卡双摄智能4G手机",
                "2000.0",
                R.drawable.phone);
        Goods teoh = new Goods("创意良品",
                "iWALK三合一充电线移动电源一拖二可爱迷你充电宝苹果安卓充电线",
                "88.0",
                R.drawable.charger);
        goods.add(weon);
        goods.add(teoh);
    }
}
