package com.example.homework03;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoanActivity_1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.loan_1,container,false);
        LinearLayout loan_1 = view.findViewById(R.id.loan_1);

        final EditText weon = view.findViewById(R.id.loan_amount_1);
//        double num = Double.parseDouble(weon.getText().toString());
        final Button calculate = view.findViewById(R.id.calculate_01);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("公积金贷款", "贷款金额："+weon.getText().toString()+"万元");
            }
        });
        return view;
    }
}
