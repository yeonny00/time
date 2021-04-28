package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class setting extends AppCompatActivity {

//    private NumberPicker pic_min;
//    private NumberPicker pic_sec;
    private Button btn_save;
    private TextView txt_min;
    private TextView txt_sec;
    private int minCount=0;
    private int secCount=0;
    private Button btn_60;
    private Button btn_10;
    private Button btn_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

//        pic_min =findViewById(R.id.pic_min);
//        pic_sec=findViewById(R.id.pic_sec);
        btn_save=findViewById(R.id.btn_save);
        btn_60=findViewById(R.id.btn_60);
        btn_10=findViewById(R.id.btn_10);
        btn_5=findViewById(R.id.btn_5);
//        pic_min.setMinValue(0);
//        pic_min.setMaxValue(60);
//
//        pic_sec.setMinValue(0);
//        pic_sec.setMaxValue(50);

        txt_min=findViewById(R.id.txt_min);
        txt_sec=findViewById(R.id.txt_sec);
        txt_min.setText(minCount+"");
        txt_sec.setText(secCount+"");

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secCount<60) {
                    secCount = secCount + 5;
                    txt_sec.setText(secCount+"");
                }
                else {
                    secCount=0;
                    txt_sec.setText(secCount+"");
                }
            }
        });

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secCount<60) {
                    secCount = secCount + 10;
                    txt_sec.setText(secCount+"");
                }
                else {
                    secCount=0;
                    txt_sec.setText(secCount+"");
                }

            }
        });

        btn_60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minCount<60) {
                    minCount++;
                    txt_min.setText(minCount+"");
                }
                else {
                    minCount=0;
                    txt_min.setText(minCount+"");
                }
            }
        });
    }
}