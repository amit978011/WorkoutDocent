
package com.example.amit.workoutdocent;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by bikram on 2/27/2017.
 */

public class withequipment_activity extends AppCompatActivity
{
    Fragment fragment;
    FragmentManager fragmentManager;
  LinearLayout rl;
    Button food;

  RelativeLayout r11;
    TextView t1;
    ImageView im1;
    Button b1,b2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withequipment_activity);
      //  setTitle("Exercises with Equipments");
      rl=(LinearLayout)findViewById(R.id.buttons);
        t1=(TextView)findViewById(R.id.text1);
     r11=(RelativeLayout)findViewById(R.id.child);
        t1.setText("Excercise with Equipment");
        b1=(Button)findViewById(R.id.maleButton);
        b2=(Button)findViewById(R.id.femalebutton);
        im1=(ImageView)findViewById(R.id.back);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(withequipment_activity.this,MainActivity.class);
                startActivity(i);
            }
        });
        food=(Button)findViewById(R.id.food);
        fragmentManager=getSupportFragmentManager();
    }
    public void male(View v)
    {
        b1.setBackgroundColor(Color.rgb(255,167,175));
        b2.setBackgroundColor(Color.rgb(222,98,98));
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new shortfragment_male ();
        fragmentTransaction.replace(R.id.fragment_for_male_or_female, fragment, "frmale");    //giving tag to fragment
       // fragmentTransaction.addToBackStack("frmale");
        fragmentTransaction.commit();
    }
    public void female(View v)
    {
        b2.setBackgroundColor(Color.rgb(255,167,175));
        b1.setBackgroundColor(Color.rgb(222,98,98));
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragment = new shortfragment_female ();
        fragmentTransaction.replace(R.id.fragment_for_male_or_female, fragment, "frfemale");    //giving tag to fragment
       // fragmentTransaction.addToBackStack("frfemale");
        fragmentTransaction.commit();
    }
    public void foodwithequipment(View view)
    {
        Intent i2=new Intent(this,FoodWithEquipment.class);
        startActivity(i2);


    }
   public void onBackPressed()
    {
       /* rl.setVisibility(View.VISIBLE);
        food.setVisibility(View.VISIBLE);
        vf.setVisibility(View.VISIBLE);*/
       // setTitle("Exercises with Equipments");

        r11.setVisibility(View.VISIBLE);
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
