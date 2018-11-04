package com.example.m999g.hotel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class House_keeping  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_lay);
        ArrayList<text> list=new ArrayList<text>();

        list.add(new text(R.drawable.cleaning_room,"Clean Room"));
        list.add(new text(R.drawable.laundry_service,"Laundry Services"));
        list.add(new text(R.drawable.request_assistant,"Request Assistance"));
        list.add(new text(R.drawable.supervision,"Room supervision"));
        list.add(new text(R.drawable.turndown,"Turndown service"));
        list.add(new text(R.drawable.bed_and_bath,"Bed & bath service"));



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