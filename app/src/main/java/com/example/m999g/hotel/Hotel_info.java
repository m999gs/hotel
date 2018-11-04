package com.example.m999g.hotel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Hotel_info extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_info);
        TextView textView=(TextView)findViewById(R.id.hotel_bginfo);
        textView.setText("hotel info to be placed here");
    }
}
