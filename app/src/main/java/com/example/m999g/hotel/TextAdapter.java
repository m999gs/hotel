package com.example.m999g.hotel;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TextAdapter extends ArrayAdapter<text>{
    public TextAdapter(Activity activity, ArrayList<text> textList){
        super(activity,0,textList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        text obj=getItem(position);
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_format,parent,false);
        }
        TextView textItem=(TextView) listItemView.findViewById(R.id.textItem);
        assert obj != null;
        textItem.setText(obj.getMyText());


        ImageView img=(ImageView) listItemView.findViewById(R.id.iconImage);

            img.setImageResource(obj.getMyImage());
            img.setVisibility(View.VISIBLE);

        // View textContainer=listItemView.findViewById(R.id.linearcolor); this may come in use if you add any transparency
        System.gc();
        return listItemView;
    }
}
