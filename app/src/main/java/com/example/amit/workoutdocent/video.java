
package com.example.amit.workoutdocent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class video extends AppCompatActivity {
TextView t1;
    ImageView im;
    Dialog dialog;
    TextView t11,t2,t3,t4;
    Fragment fragment;

    RelativeLayout r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        t1=(TextView)findViewById(R.id.text1);
        r1=(RelativeLayout)findViewById(R.id.video1);
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_ACTION_BAR);
        dialog.setContentView(R.layout.dailog);
        dialog.show();
        t11=(TextView)dialog.findViewById(R.id.malebeginner);
        t2=(TextView)dialog.findViewById(R.id.femalebeginner);
        t3=(TextView)dialog.findViewById(R.id.malebodybuilder);
        t4=(TextView)dialog.findViewById(R.id.femalebodybuilder);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                fragment = new Malebegiinnerfragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();

                fragmentTransaction.replace(R.id.activity_video, fragment, "malebeg");
                //fragmentTransaction.addToBackStack("malebeg");
                fragmentTransaction.commit();

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              dialog.dismiss();
                fragment = new Femalebeginnerfragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();

                fragmentTransaction.replace(R.id.activity_video, fragment, "femalebeg");
                //fragmentTransaction.addToBackStack("femalebeg");
                fragmentTransaction.commit();
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                fragment = new Malebodybuilderfragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();

                fragmentTransaction.replace(R.id.activity_video, fragment, "malebod");
               // fragmentTransaction.addToBackStack("malebod");
                fragmentTransaction.commit();
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                fragment = new Femalebodybuilderfragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();

                fragmentTransaction.replace(R.id.activity_video, fragment, "malebod");
                //fragmentTransaction.addToBackStack("malebod");
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public void onBackPressed() {
        int count=getFragmentManager().getBackStackEntryCount();
        if(count==0)
        {
            super.onBackPressed();
        }
        else
        {

            getFragmentManager().popBackStack();
        }
    }
}
