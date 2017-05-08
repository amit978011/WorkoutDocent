
package com.example.amit.workoutdocent.nutirents;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amit.workoutdocent.PageAdapter;
import com.example.amit.workoutdocent.R;

/**
 * Created by bikram on 3/4/2017.
 */

public class fragment_for_nutirents_for_withoutequipment  extends Fragment
{
    ViewPager viewPager;
    TabLayout tabLayout;
    TextView t1;
    ImageView im;


    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle bn)
    {
        View v=inflater.inflate(R.layout.fragment_for_nutirents_for_withoutequipment,vg,false);
        t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Nutrition");
        im=(ImageView)v.findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
       init(v);
        return v;
    }

    private void init(View v)
    {
        viewPager=(ViewPager)v.findViewById(R.id.viewpager);
        tabLayout=(TabLayout)v.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Fruit"));    // adding tabs to tab layout (tabs are new object so  newTab() .. n they are getting created inside the layout so..they are connected..so you initlize object like tablayout.addTab()
        tabLayout.addTab(tabLayout.newTab().setText("Starches"));
        tabLayout.addTab(tabLayout.newTab().setText("Flesh"));
        tabLayout.addTab(tabLayout.newTab().setText("Dry Fruit"));
        tabLayout.addTab(tabLayout.newTab().setText("Leafy vegetable"));
        tabLayout.setTabTextColors(getResources().getColor(R.color.white), getResources().getColor(R.color.white));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        PageAdapter adapter = new PageAdapter(getActivity().getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                tabLayout.setTabTextColors(getResources().getColor(R.color.white), getResources().getColor(R.color.white));//here first parrot color is used for past tab and white color is used for current tab



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
