package com.example.m999g.hotel;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please press twice to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView reception=(ImageView)findViewById(R.id.Reception);
        ImageView house_keeping=(ImageView)findViewById(R.id.Housekeeping);
        ImageView hotel_info=(ImageView)findViewById(R.id.Hotel_info);
        ImageView roomService=(ImageView)findViewById(R.id.roomService);
        ImageView concierge=(ImageView)findViewById(R.id.concierge);
        ImageView Ask_me=(ImageView)findViewById(R.id.Ask_me);
        ImageView Travel=(ImageView)findViewById(R.id.Travel);
        ImageView maintenance=(ImageView)findViewById(R.id.maintenance);
        ImageView tv=(ImageView)findViewById(R.id.tv);

        reception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Reception.class);
                startActivity(i);
            }
        });
        concierge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Concierge.class);
                startActivity(i);
            }
        });
        house_keeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,House_keeping.class);
                startActivity(i);
            }
        });
        hotel_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Hotel_info.class);
                startActivity(i);
            }
        });
        roomService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Room_service.class);
                startActivity(i);
            }
        });
        Ask_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Ask_me.class);
                startActivity(i);
            }
        });
        Travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Travel.class);
                startActivity(i);
            }
        });
        maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Maintenance.class);
                startActivity(i);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,tv_appliances.class);
                startActivity(i);
            }
        });





    }
}
