package com.example.homework02;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context mCon;
    private List<Goods> goods;
    private int itemLayoutRes;

    public CustomAdapter(Context mCon, List<Goods> goods, int itemLayoutRes) {
        this.mCon = mCon;
        this.goods = goods;
        this.itemLayoutRes = itemLayoutRes;
    }

    @Override
    public int getCount() {
        if (null!=goods){
            return goods.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (null!=goods){
            return goods.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inf = LayoutInflater.from(mCon);
        convertView = inf.inflate(itemLayoutRes,null);

        TextView gdStore = convertView.findViewById(R.id.store);
        TextView gdIntro = convertView.findViewById(R.id.intro);
        TextView gdPrice = convertView.findViewById(R.id.price);
        ImageView gdPhoto = convertView.findViewById(R.id.goodsim);
        final EditText amount = convertView.findViewById(R.id.amount);
        Button minus = convertView.findViewById(R.id.minus_amount);
        Button add = convertView.findViewById(R.id.add_amount);
        final RadioButton satu = convertView.findViewById(R.id.satu);
        final RadioButton dua = convertView.findViewById(R.id.dua);

        gdStore.setText(goods.get(position).getStore());
        gdIntro.setText(goods.get(position).getIntro());
        gdPhoto.setImageResource(goods.get(position).getPhotoID());
        gdPrice.setText(goods.get(position).getPrice());
        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (satu.isChecked()==true){
                    dua.setChecked(true);
                }
            }
        });
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dua.isChecked()==true){
                    satu.setChecked(true);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(amount.getText().toString());
                Log.e("num","minus");
                if (number>1){
                    number--;
                    amount.setText(number+"");
                }else {
                    number=1;
                    amount.setText(number+"");
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(amount.getText().toString());
                Log.e("num","add");
                number++;
                amount.setText(number+"");
            }
        });
        return convertView;
    }
}
