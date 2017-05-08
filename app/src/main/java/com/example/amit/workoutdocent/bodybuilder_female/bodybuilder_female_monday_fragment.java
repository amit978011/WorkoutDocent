
package com.example.amit.workoutdocent.bodybuilder_female;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amit.workoutdocent.R;
import com.example.amit.workoutdocent.page;

/**
 * Created by bikram on 3/3/2017.
 */

public class bodybuilder_female_monday_fragment  extends Fragment
{

   TabLayout t11;
    ViewPager v11;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        getActivity().setTitle("Monday Exercise(Female)");
        View v=inflater.inflate(R.layout.bodybuilder_female_monday_fragment_3,vg,false);

        ImageView im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        TextView t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Monday Exercise");

       t11=(TabLayout)v.findViewById(R.id.tab_layout);
        v11=(ViewPager)v.findViewById(R.id.viewpager);
        t11.addTab(t11.newTab().setText("Workout A"));    // adding tabs to tab layout (tabs are new object so  newTab() .. n they are getting created inside the layout so..they are connected..so you initlize object like tablayout.addTab()
        t11.addTab(t11.newTab().setText("Workout B"));
        t11.setTabTextColors(getResources().getColor(R.color.white), getResources().getColor(R.color.white));
        t11.setTabGravity(TabLayout.GRAVITY_FILL);
       page adapter = new page(getActivity().getSupportFragmentManager(), t11.getTabCount());
        v11.setAdapter(adapter);
        v11.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(t11));
        t11.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                v11.setCurrentItem(tab.getPosition());
                t11.setTabTextColors(getResources().getColor(R.color.white), getResources().getColor(R.color.white));//here first parrot color is used for past tab and white color is used for current tab



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return  v;

    }
}
