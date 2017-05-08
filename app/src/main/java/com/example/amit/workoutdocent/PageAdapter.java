package com.example.amit.workoutdocent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.amit.workoutdocent.nutirents.fragment_Neutral;
import com.example.amit.workoutdocent.nutirents.fragment_dryFruit;
import com.example.amit.workoutdocent.nutirents.fragment_flesh;
import com.example.amit.workoutdocent.nutirents.fragment_fruit;
import com.example.amit.workoutdocent.nutirents.fragment_starches;

/**
 * Created by bikram on 3/4/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter
{
    int mNumOfTabs;
    public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
         mNumOfTabs=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                fragment_fruit frag1 = new fragment_fruit();
                return frag1;
            case 1:
                fragment_starches frag2 = new fragment_starches();
                return frag2;
            case 2:
                fragment_flesh frag3= new fragment_flesh();
                return frag3;
            case 3:
                fragment_dryFruit frag4= new  fragment_dryFruit();
                return frag4;
            case 4:
                fragment_Neutral frag5= new   fragment_Neutral();
                return frag5;
            default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
