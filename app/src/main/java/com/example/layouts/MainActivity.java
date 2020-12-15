package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button task1;
    Button task2;
    Button task3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task1=findViewById(R.id.task1);
        task2=findViewById(R.id.task2);
        task3=findViewById(R.id.task3);
        task2.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Constraint.class);
            startActivity(intent);
        });

        task1.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,ActivityTask1.class);
            startActivity(intent);
        });

        task3.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,ActivityTask3.class);
            startActivity(intent);
        });
    }
}