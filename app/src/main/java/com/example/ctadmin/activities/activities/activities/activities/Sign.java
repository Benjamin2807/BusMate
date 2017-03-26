package com.example.ctadmin.activities.activities.activities.activities;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.ctadmin.busmate.R;

public class Sign extends AppCompatActivity {

    private final int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent intent = new Intent(Sign.this,Booking.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
