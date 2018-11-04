package com.example.m999g.hotel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Concierge extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_lay);
        ArrayList<text> list=new ArrayList<text>();

        list.add(new text(R.drawable.newspaper,"NewsPaper"));
        list.add(new text(R.drawable.lost_and_found,"Lost and Found"));
        list.add(new text(R.drawable.make_any_request,"Make Any Request"));
        list.add(new text(R.drawable.airport_shuttle,"Airport Shuttle"));
        list.add(new text(R.drawable.folio,"Folio"));
        list.add(new text(R.drawable.lost_and_found,"Lost/Delayed luggage"));
        list.add(new text(R.drawable.massage,"Massage"));
        list.add(new text(R.drawable.press_reader,"Press Reader"));
        list.add(new text(R.drawable.baby_stroller,"baby stroller rental"));
        list.add(new text(R.drawable.art_and_culture,"Arts and culture"));
        list.add(new text(R.drawable.shopping,"Shopping"));
        list.add(new text(R.drawable.tours,"Tours"));
        list.add(new text(R.drawable.packages,"Packages"));


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
