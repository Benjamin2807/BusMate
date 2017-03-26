package com.example.ctadmin.activities.activities.activities.activities;

/**
 * Created by ctadmin on 3/26/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.ctadmin.busmate.R;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        TextView name=(TextView)findViewById(R.id.textView10);
        TextView src=(TextView)findViewById(R.id.textView11);
        TextView dest=(TextView)findViewById(R.id.textView12);
        TextView date=(TextView)findViewById(R.id.textView15);
        TextView time=(TextView)findViewById(R.id.textView21);
        TextView id=(TextView)findViewById(R.id.textView13);


        String x1=getIntent().getStringExtra("name");
        String x2=getIntent().getStringExtra("source");
        String x3=getIntent().getStringExtra("destination");
        String x4=getIntent().getStringExtra("date");
        String x5=getIntent().getStringExtra("time");


        name.setText(x1);
        src.setText(x2);
        dest.setText(x3);
        date.setText(x4);
        time.setText(x5);
        id.setText("A228U");
    }
}