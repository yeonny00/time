package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS=60000;

    private TextView  txt_timer;
    private Button btn_start;
    private Button btn_reset;

    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private CountDownTimer mcountDownTimer;
    private boolean mTimerRunning;
    private long mEndTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_timer = findViewById(R.id.txt_timer);
        btn_start = findViewById(R.id.btn_start);
        btn_reset = findViewById(R.id.btn_reset);

//        btn_start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mTimerRunning){
//                    pauseTimer();
//                } else
//                {
//                    startTimer();
//                }
//            }
//        });
//
//        btn_reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                resetTimer();
//            }
//        });
//
//    }
//
//    private void startTimer (){
//        mEndTime = System.currentTimeMillis() + mTimeLeftInMillis;
//
//        mcountDownTimer=new CountDownTimer(mTimeLeftInMillis,1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//
//
//            }
//
//            @Override
//            public void onFinish() {
//
//            }
//        };

    }
}