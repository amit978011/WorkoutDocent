
package com.example.amit.workoutdocent;






import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by bikram on 2/22/2017.
 */

public class Withoutequipment  extends AppCompatActivity {



   // FragmentManager manager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withoutequipment);
        setTitle("Exercises without Equipments");


        //manager = getSupportFragmentManager();
        withoutequipmentfragment   f1 = new withoutequipmentfragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.withoutequipment, f1, "frag0");   // here 1st parameter tell thell base layout onto we gonna put on our fragments..
        transaction.commit();
    }
    public void onBackPressed()
    {
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



