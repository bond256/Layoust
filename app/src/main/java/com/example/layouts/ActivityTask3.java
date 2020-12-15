package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityTask3 extends AppCompatActivity {
CostomeView costomeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ativity_task3);
        costomeView=findViewById(R.id.my_castom);
        costomeView.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTask3.this,"clicked button",Toast.LENGTH_SHORT).show();
                costomeView.setText("Android");
            }
        });
        costomeView.getImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTask3.this,"clicked image button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}