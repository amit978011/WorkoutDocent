
package com.example.amit.workoutdocent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bikram on 4/19/2017.
 */

public class Malebodybuilderfragment extends Fragment
{
    TextView t1;
    ImageView im;
    Button b1,b2,b3,b4,b5,b6;
    Intent i;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        View v=inflater.inflate(R.layout.malebodybuilderfragment,vg,false);
        t1=(TextView)v.findViewById(R.id.text1);
        b1=(Button)v.findViewById(R.id.chestexercise);
        b2=(Button)v.findViewById(R.id.backexercise);
        b4=(Button)v.findViewById(R.id.shoulderexercise);
        b5=(Button)v.findViewById(R.id.armsexercise);
        b6=(Button)v.findViewById(R.id.absexercise);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="RDsaaZblRZk";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="mcCg_ycMhlA";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="KSp803OS8Mo";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="Zb-K7YAzAZM";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="vH-CGlxES8w";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        t1.setText("Male Bodybuilder");
        im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        return v;
    }
}