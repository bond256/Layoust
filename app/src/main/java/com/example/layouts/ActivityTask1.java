package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTask1 extends AppCompatActivity {
    Button buttonTask1;
    TextView textViewTask1;
    ImageButton imageButtonTask1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        buttonTask1=findViewById(R.id.buttonTask1);
        imageButtonTask1=findViewById(R.id.imageButtonTask1);
        textViewTask1=findViewById(R.id.textViewTask1);
        buttonTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTask1.this,"button click",Toast.LENGTH_SHORT).show();
                textViewTask1.setText("Android");
            }
        });

        imageButtonTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTask1.this,"image button click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}