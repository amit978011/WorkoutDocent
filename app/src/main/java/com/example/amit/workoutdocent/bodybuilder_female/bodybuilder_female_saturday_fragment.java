
package com.example.amit.workoutdocent.bodybuilder_female;

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

public class bodybuilder_female_saturday_fragment  extends Fragment
{ WebView v1;

    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        getActivity().setTitle("Saturday Exercise(Female)");
        View v=inflater.inflate(R.layout.bodybuilder_female_saturday_fragment_3,vg,false);
        Button bt=(Button)v.findViewById(R.id.femalebodybuildersaturdayvideo);
        ImageView im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        TextView t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Saturday Exercise");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Youtube.class);
                String strnme="9M8cUWRrm5k";
                i.putExtra("STRING_I_NEED",strnme);
                startActivity(i);
            }
        });

        v1=(WebView)v.findViewById(R.id.webview);
        v1.loadUrl("file:///android_asset/bodybuildergirlabs.html");
        return  v;

    }
}
