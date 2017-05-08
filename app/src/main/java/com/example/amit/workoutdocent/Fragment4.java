
package com.example.amit.workoutdocent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by bikram on 2/23/2017.
 */
public class Fragment4   extends Fragment {
TextView t1;
    ImageView im1;
    ToggleButton tb1,tb2;
    WebView webView,webView1,webView2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


     View v= inflater.inflate(R.layout.fragmentroadcycling,container,false);
        t1=(TextView)v.findViewById(R.id.text1);
        im1=(ImageView)v.findViewById(R.id.back);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        t1.setText("Cycling");
        webView=(WebView) v.findViewById(R.id.webview_cycling);
        webView1=(WebView) v.findViewById(R.id.webview_cycling_nvrdob4riding);
        webView2=(WebView) v.findViewById(R.id.webview_cycling_headphone);

        webView.loadUrl("file:///android_asset/cycling.html");
        webView1.loadUrl("");
        webView2.loadUrl("");

        tb1 =(ToggleButton) v.findViewById(R.id.btn_cycling_nvrdob4ride);
        tb1.setText("Things You Should Never Do Before a Ride");
        tb1.setTextOff("Things You Should Never Do Before a Ride");
        tb1.setTextOn("Hide");


        tb2 =(ToggleButton) v.findViewById(R.id.btn_cycling_headphone);
        tb2.setText("Should You Ride With Headphones?");
        tb2.setTextOff("Should You Ride With Headphones?");
        tb2.setTextOn("Hide");


        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(tb2.isChecked())    //if tb2 already pressed and note hide and tb1 then pressed
                {
                    webView2.loadUrl("");
                    webView.loadUrl("");
                    tb2.setChecked(false);
                    tb2.setTextOff("Should You Ride With Headphones?");
                }



                if(tb1.isChecked())
                {
                    webView1.loadUrl("file:///android_asset/cycling1.html");
                    webView.loadUrl("");
                    webView2.loadUrl("");
                }
                else
                {
                    // webView1.setVisibility(View.GONE);
                    webView1.loadUrl("");
                    webView.loadUrl("file:///android_asset/cycling.html");
                    webView2.loadUrl("");

                }


            }
        });



        tb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tb1.isChecked())    //if tb2 already pressed and note hide and tb1 then pressed
                {
                    webView1.loadUrl("");
                    webView.loadUrl("");
                    tb1.setChecked(false);
                    tb1.setTextOff("Things You Should Never Do Before a Ride");
                }


                if(tb2.isChecked())
                {

                    webView2.loadUrl("file:///android_asset/cycling2.html");
                    webView.loadUrl("");
                    webView1.loadUrl("");

                }
                else
                {
                    // webView1.setVisibility(View.GONE);
                    webView2.loadUrl("");
                    webView.loadUrl("file:///android_asset/cycling.html");
                    webView1.loadUrl("");


                }


            }
        });









        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        return v;
    }
}
