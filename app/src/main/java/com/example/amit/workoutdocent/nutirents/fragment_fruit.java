package com.example.amit.workoutdocent.nutirents;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.amit.workoutdocent.R;

/**
 * Created by bikram on 3/4/2017.
 */

public class fragment_fruit  extends Fragment
{
    WebView v1;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        View v= inflater.inflate(R.layout.fragment_fruit_4,vg,false);
        v1=(WebView)v.findViewById(R.id.webview);
        v1.loadUrl("file:///android_asset/fuits.html");
        return  v;
    }
}
