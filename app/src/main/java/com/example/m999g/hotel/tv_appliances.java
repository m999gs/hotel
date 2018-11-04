package com.example.m999g.hotel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class tv_appliances extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_lay);
        ArrayList<text> list=new ArrayList<text>();

        list.add(new text(R.drawable.ask_me,"Phone Charger"));
        list.add(new text(R.drawable.hotel_info,"Wake Up Call"));
        list.add(new text(R.drawable.housekeeping,"Tv Guide"));


        TextAdapter listAdapter=new TextAdapter(this, list);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });




    }
}
