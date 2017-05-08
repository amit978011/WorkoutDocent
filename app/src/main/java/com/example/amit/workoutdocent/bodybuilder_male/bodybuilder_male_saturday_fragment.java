
package com.example.amit.workoutdocent.bodybuilder_male;


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
 * Created by bikram on 3/2/2017.
 */

public class bodybuilder_male_saturday_fragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bn)
    {        getActivity().setTitle("Saturday Exercise(Male)");

        View v=inflater.inflate(R.layout.bodybuilder_male_saturday_fragment,container,false);
        Button bt=(Button)v.findViewById(R.id.malebodybuildersaturdayvideo);
        ImageView im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        TextView t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("saturday Exercise");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Youtube.class);
                String strnme="vH-CGlxES8w";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });
        WebView webView=(WebView)v.findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/malebodybuildersaturday.html");
        return v;
    }
}
