package com.example.amit.workoutdocent.beginner_male;

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
 * Created by bikram on 2/28/2017.
 */

public class beginner_male_tuesday_fragment extends Fragment
{
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bn)
{
   // getActivity().setTitle("Tuesday Exercise(Male)");

    View v=inflater.inflate(R.layout.beginner_male_tuesday_fragment,container,false);
    ImageView im=(ImageView)v.findViewById(R.id.back);
    TextView t1=(TextView)v.findViewById(R.id.text1);
    t1.setText("Tuesday Exercise");
    im.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getActivity().onBackPressed();
        }
    });
    Button bt=(Button)v.findViewById(R.id.malebeginnertuesdayvideo);
    bt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(getActivity(),Youtube.class);
            String strnme="CK5DX2ZozKU";
            i.putExtra("STRING_I_NEED",strnme);
            startActivity(i);
        }
    });
    WebView webView=(WebView)v.findViewById(R.id.webview);
    webView.loadUrl("file:///android_asset/malebegntuesday.html");
    return v;
}
}
