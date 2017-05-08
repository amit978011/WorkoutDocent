
package com.example.amit.workoutdocent.bodybuilder_female;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.amit.workoutdocent.R;

/**
 * Created by bikram on 4/4/2017.
 */

public class workout_B extends Fragment
{
    WebView v1;
    public View onCreateView (LayoutInflater inflater,ViewGroup vg,Bundle  bn)
    {
        View v=inflater.inflate(R.layout.workoutb,vg,false);
        v1=(WebView)v.findViewById(R.id.webview);
        v1.loadUrl("file:///android_asset/bodybuildergirlchestB.html");
        return  v;
    }
}
