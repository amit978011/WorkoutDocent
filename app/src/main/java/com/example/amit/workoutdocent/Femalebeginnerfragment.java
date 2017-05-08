
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

public class Femalebeginnerfragment extends Fragment
{
    TextView t1;
    ImageView im;
    Button b1,b2,b3;
    Intent i;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        View v=inflater.inflate(R.layout.femalebeginnerfragment,vg,false);
        t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Female Beginner");
        b1=(Button)v.findViewById(R.id.chestexercise);
        b2=(Button)v.findViewById(R.id.shoulderexercise);
        b3=(Button)v.findViewById(R.id.absexercise);
        im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="D5SR4tf2LSM";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="k8YpZHZR9Ow";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getActivity(),Youtube.class);
                String strnme="ZRoCijxmaZ8";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        return v;
    }
}
