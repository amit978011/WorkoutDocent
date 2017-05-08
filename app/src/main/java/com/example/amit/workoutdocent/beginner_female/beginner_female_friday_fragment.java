
package com.example.amit.workoutdocent.beginner_female;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amit.workoutdocent.R;


/**
 * Created by bikram on 3/3/2017.
 */

public class beginner_female_friday_fragment extends Fragment
{
    WebView v11;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        TextView v1;
        getActivity().setTitle("Friday Exercise(Female)");
        View v=inflater.inflate(R.layout.beginner_female_friday_fragment,vg,false);
  ;
        ImageView im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        v1=(TextView)v.findViewById(R.id.text1);
        v1.setText("Friday Exercise");

        v11=(WebView)v.findViewById(R.id.webview);
        v11.loadUrl("file:///android_asset/beginnergirlarm.html");
        return v;
    }
}