
package com.example.amit.workoutdocent.beginner_female;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amit.workoutdocent.R;
import com.example.amit.workoutdocent.Youtube;

/**
 * Created by bikram on 3/3/2017.
 */

public class beginner_female_thursday_fragment extends Fragment
{
    WebView v1;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        getActivity().setTitle("Thursday Exercise(Female)");
        View v=inflater.inflate(R.layout.beginner_female_thursday_fragment,vg,false);
        Button bt=(Button)v.findViewById(R.id.femalebeginnerthursdayvideo);
        ImageView im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        TextView t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Thursday Exercise");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Youtube.class);
                String strnme="k8YpZHZR9Ow";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        v1=(WebView)v.findViewById(R.id.webview);
        v1.loadUrl("file:///android_asset/beginnergirlshoulder.html");
        return v;
    }
}