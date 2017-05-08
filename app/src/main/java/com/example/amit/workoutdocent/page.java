
package com.example.amit.workoutdocent;

/**
 * Created by bikram on 4/4/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.amit.workoutdocent.bodybuilder_female.workout_A;
import com.example.amit.workoutdocent.bodybuilder_female.workout_B;

public class page  extends FragmentStatePagerAdapter
{
    int mNumOfTabs;
    public page(FragmentManager fm, int tabCount) {
        super(fm);
        mNumOfTabs=tabCount;
    }



    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                workout_A frag2 = new workout_A();
                return frag2;

            case 1:
                workout_B frag3= new workout_B();
                return frag3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
