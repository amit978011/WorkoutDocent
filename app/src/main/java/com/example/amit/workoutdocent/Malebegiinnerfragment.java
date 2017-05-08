
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

public class Malebegiinnerfragment extends Fragment
{
    TextView t1;
    ImageView im;
    Button b1,b2,b3,b4,b5;
    Intent i;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        View v=inflater.inflate(R.layout.malebeginnerfragment,vg,false);
        t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Male Beginner");
        im=(ImageView)v.findViewById(R.id.back);
        b1=(Button)v.findViewById(R.id.chestexercise);
        b2=(Button)v.findViewById(R.id.backexercise);
        b3=(Button)v.findViewById(R.id.legexercise);
        b4=(Button)v.findViewById(R.id.armsexercise);
        b5=(Button)v.findViewById(R.id.absexercise);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="O3iW4pJufGI";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="CK5DX2ZozKU";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="tFzx5WIjzd4";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="KwbhL3b0EoE";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="4g5MLxLigwQ";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        return v;
    }
}
