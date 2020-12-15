package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Constraint extends AppCompatActivity {
 Button button;
 TextView textView;
 ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        button=findViewById(R.id.button_contraint);
        imageButton=findViewById(R.id.imageButton_constraint);
        textView=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Android");
                Toast.makeText(Constraint.this,"press button",Toast.LENGTH_SHORT).show();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Constraint.this,"press imagebutton",Toast.LENGTH_SHORT).show();
            }
        });
    }
}