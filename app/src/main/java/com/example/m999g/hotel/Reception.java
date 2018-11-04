package com.example.m999g.hotel;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Reception  extends AppCompatActivity {
    private String Tag="MyMessage";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_lay);
        ArrayList<text> list=new ArrayList<text>();

        list.add(new text(R.drawable.chat,"Chat Service"));
        list.add(new text(R.drawable.make_bed,"Make Bed"));
        list.add(new text(R.drawable.wifi,"Wi-Fi Password"));
        list.add(new text(R.drawable.extra_bed,"Extra Bed"));
        list.add(new text(R.drawable.bell_service,"Bell Services"));
        list.add(new text(R.drawable.late_checkout,"Late CheckOut"));
        list.add(new text(R.drawable.room_change,"Room Change"));


        TextAdapter listAdapter=new TextAdapter(this, list);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        //for the background image of Reception Layout
      //  LinearLayout linearLayout=(LinearLayout) findViewById(R.id.image_background);
       // linearLayout.setBackgroundResource(R.drawable.hotel_bg);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            
            }
        });




    }

}