
package com.example.amit.workoutdocent;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bikram on 2/22/2017.
 */

public class Withoutequipmentdesign  extends BaseAdapter
{
    LayoutInflater infater1;
    int[] gh;
    public static  final int MAX_NO_LIST_ITEM=6;
    String[] dg={"Running","Walking","Exercise","Cycling","Nutrition","Diet Plan"};
    Fragment fragment;
  // int [] img={R.drawable.runninglogo,R.drawable.walkinglogo,R.drawable.exerciselogo,R.drawable.cyclelogo,R.drawable.foodlogo,R.drawable.dietplan};
  int [] img={R.drawable.runningpng,R.drawable.walkingpng,R.drawable.exercisepng,R.drawable.cyclingpng,R.drawable.nutritionpng,R.drawable.deitplanpng};

    FragmentManager fragmentManager;

    public Withoutequipmentdesign (LayoutInflater inflate )
    {
        // gh=im1;
        infater1=inflate;

    }
    public int getCount() {

        return MAX_NO_LIST_ITEM;
    }


    public Object getItem(int i)
    {
        return i;
    }


    public long getItemId(int i)
    {
        return i;
    }




    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view=infater1.inflate(R.layout.customlistview,viewGroup,false);
        ImageView im=(ImageView)view.findViewById(R.id.img1);
        TextView txt=(TextView)view.findViewById(R.id.txt1);
        im.setImageResource(img[i]);
        txt.setText(dg[i]);
        return view;
    }
}

