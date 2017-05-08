
package com.example.amit.workoutdocent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by amit on 2/23/2017.
 */

public class Logo_Acivity extends Activity {

    private static int SPLASH_TIME_OUT = 2000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_activity);




        new Handler().postDelayed(new Runnable() {
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Logo_Acivity.this,MainActivity2.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
    /*public void clickme(View v)
    {
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);

    }*/
}
