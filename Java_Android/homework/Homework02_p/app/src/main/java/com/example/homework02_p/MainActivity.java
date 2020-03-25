package com.example.homework02_p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Char> crs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        CustomAdapter cta = new CustomAdapter(this,crs,R.layout.crs_items);
        ListView crsView = findViewById(R.id.lvs);
        crsView.setAdapter(cta);
    }

    public void initData(){
        Char cr1 = new Char("红细胞","0010",R.drawable.red);
        Char cr2 = new Char("白细胞","0011",R.drawable.white);
        Char cr3 = new Char("血小板","0100",R.drawable.pass);
        crs.add(cr1);
        crs.add(cr2);
        crs.add(cr3);
    }
}
