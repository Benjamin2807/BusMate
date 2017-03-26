package com.example.ctadmin.activities.activities.activities.activities;

/**
 * Created by ctadmin on 3/26/2017.
 */
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.ctadmin.busmate.R;
public class Booking extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Button b1 = (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                EditText e1 = (EditText) findViewById(R.id.editText);
                EditText e2 = (EditText) findViewById(R.id.editText1);
                EditText e3 = (EditText) findViewById(R.id.editText2);
                EditText e4 = (EditText) findViewById(R.id.editText3);


                String a = e1.getText().toString();
                String b = e2.getText().toString();
                String c = e3.getText().toString();
                String d = e4.getText().toString();

                RadioGroup radio = (RadioGroup) findViewById(R.id.benja);
                int selected_id = radio.getCheckedRadioButtonId();
                RadioButton radiobutton = (RadioButton) findViewById(selected_id);
                String radioButtonText2 = (radiobutton.getText().toString());

                Intent intent = new Intent(new Intent(Booking.this, Final.class));
                intent.putExtra("name", a);
                intent.putExtra("source", b);
                intent.putExtra("destination", c);
                intent.putExtra("date", d);
                intent.putExtra("time", radioButtonText2);
                startActivity(intent);
            }

        });
    }
}
