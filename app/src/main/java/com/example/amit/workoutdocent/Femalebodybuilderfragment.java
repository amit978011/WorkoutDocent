
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
public class Femalebodybuilderfragment extends Fragment
{
    TextView t1;
    ImageView im;
    Button b1,b2,b3,b4,b5;
    Intent i;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        View v=inflater.inflate(R.layout.femalebodybuilderfragment,vg,false);
        t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Female Bodybuilder");
        im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        b1=(Button)v.findViewById(R.id.backexercise);
        b2=(Button)v.findViewById(R.id.legexercise);
        b3=(Button)v.findViewById(R.id.shoulderexercise);
        b4=(Button)v.findViewById(R.id.armsexercise);
        b5=(Button)v.findViewById(R.id.absexercise);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              i=new Intent(getActivity(),Youtube.class);
                String strnme="1cYxSQzVYKI";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="vdcACykBa9I";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="0zQUhK1V4qY";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="WgYf6yX__Ss";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="9M8cUWRrm5k";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        return v;
    }
}
