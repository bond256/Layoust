package com.example.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CostomeView extends LinearLayout {
private TextView textView;
private ImageView imageView;
private Button button;
private ImageButton imageButton;
private FrameLayout frameLayout;

    public CostomeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    void init(Context context,AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.my_view, this, true);
        inflate(context, R.layout.my_view, this);
        textView = findViewById(R.id.textViewTask3);
        imageView = findViewById(R.id.imageViewTask3);
        button = findViewById(R.id.buttonTask3);
        imageButton = findViewById(R.id.imageButtonTask3);
        TypedArray attributes=context.obtainStyledAttributes(attrs,R.styleable.costomeView);
        textView.setText(attributes.getString(R.styleable.costomeView_text));
        imageView.setImageDrawable(attributes.getDrawable(R.styleable.costomeView_image));
        imageButton.setImageDrawable(attributes.getDrawable(R.styleable.costomeView_imageButton));
        button.setText(attributes.getString(R.styleable.costomeView_textButton));
        frameLayout=findViewById(R.id.frame_layout);
        frameLayout.setBackgroundColor(attributes.getColor(R.styleable.costomeView_color,0));
        attributes.recycle();
    }

    public void setText(String text){
        textView.setText(text);
    }


    public Button getButton(){
        return button;
    }

    public ImageButton getImageButton(){
        return imageButton;
    }

}
