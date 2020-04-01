package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();


        String message=intent.getStringExtra("userName");
        int message2= intent.getIntExtra("userAge",0);

        TextView textView1 = findViewById(R.id.nameDis);
        textView1.setText("Your name  : " +message);

        String newmsg2=Integer.toString(message2);

        TextView textView2 = findViewById(R.id.ageDis);
        textView2.setText("Your age   :  " +newmsg2);
    }
}
