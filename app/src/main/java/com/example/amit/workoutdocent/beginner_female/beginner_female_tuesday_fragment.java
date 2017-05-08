
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

public class beginner_female_tuesday_fragment   extends Fragment
{ WebView v1;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        TextView t1;
        getActivity().setTitle("Tuesday Exercise(Female)");
        View v=inflater.inflate(R.layout.beginner_female_tuesday_fragment,vg,false);

        ImageView im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
       t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Tuesday Exercise");
       v1=(WebView)v.findViewById(R.id.webview);
        v1.loadUrl("file:///android_asset/beginnergirlback.html");
        return v;
    }
}