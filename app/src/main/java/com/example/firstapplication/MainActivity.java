package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText result1;
    EditText result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        result1=findViewById(R.id.name);
        result2=findViewById(R.id.age);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                int age2= Integer.parseInt(result2.getText().toString());

                intent.putExtra("userName",result1.getText().toString());
                intent.putExtra("userAge",age2);
                startActivity(intent);
            }
        });

    }
}
