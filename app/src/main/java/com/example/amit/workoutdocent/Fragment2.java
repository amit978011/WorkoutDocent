

package com.example.amit.workoutdocent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bikram on 2/23/2017.
 */
public class Fragment2  extends Fragment {
TextView t1;
    ImageView im1;
    WebView v1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


     View v= inflater.inflate(R.layout.fragmentwalking,container,false);
        t1=(TextView)v.findViewById(R.id.text1);
        im1=(ImageView)v.findViewById(R.id.back);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        t1.setText("Walking");
        WebView v1=(WebView)v.findViewById(R.id.walkingview);
        v1.loadUrl("file:///android_asset/walking.html");

        return v;
    }
}
