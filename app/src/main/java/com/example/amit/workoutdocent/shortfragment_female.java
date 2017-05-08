
package com.example.amit.workoutdocent;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.amit.workoutdocent.beginner_female.beginner_female_friday_fragment;
import com.example.amit.workoutdocent.beginner_female.beginner_female_monday_fragment;
import com.example.amit.workoutdocent.beginner_female.beginner_female_saturday_fragment;
import com.example.amit.workoutdocent.beginner_female.beginner_female_thursday_fragment;
import com.example.amit.workoutdocent.beginner_female.beginner_female_tuesday_fragment;
import com.example.amit.workoutdocent.beginner_female.beginner_female_wednesday_fragment;
import com.example.amit.workoutdocent.bodybuilder_female.bodybuilder_female_friday_fragment;
import com.example.amit.workoutdocent.bodybuilder_female.bodybuilder_female_monday_fragment;
import com.example.amit.workoutdocent.bodybuilder_female.bodybuilder_female_saturday_fragment;
import com.example.amit.workoutdocent.bodybuilder_female.bodybuilder_female_thursday_fragment;
import com.example.amit.workoutdocent.bodybuilder_female.bodybuilder_female_tuesday_fragment;
import com.example.amit.workoutdocent.bodybuilder_female.bodybuilder_female_wednesday_fragment;

import java.util.Calendar;


/**
 * Created by bikram on 2/27/2017.
 */

public class shortfragment_female extends Fragment
{ Button bt1,bt2,food;
    Dialog dialog,dialog1;
    LinearLayout r1;
    ViewFlipper vf;

    RelativeLayout r11;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.shortfragment_female, container, false);
        bt1=(Button)v.findViewById(R.id.button_for_beginerin_female);
        bt2=(Button)v.findViewById(R.id.button_for_bodybuilder_female);
        r1=(LinearLayout)getActivity().findViewById(R.id.buttons);
        food=(Button)getActivity().findViewById(R.id.food);

        r11=(RelativeLayout)getActivity().findViewById(R.id.child);
       // vf=(ViewFlipper)getActivity().findViewById(R.id.vf);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(getActivity());
                dialog.requestWindowFeature(Window.FEATURE_RIGHT_ICON);

                dialog.setContentView(R.layout.custom_dialog_design_female_beginner);
                dialog.show();
                LinearLayout monday = (LinearLayout) dialog.findViewById(R.id.layout_monday);
                LinearLayout tuesday = (LinearLayout) dialog.findViewById(R.id.layout_tuesday);
                LinearLayout wednesday = (LinearLayout) dialog.findViewById(R.id.layout_wednesday);
                LinearLayout thursday = (LinearLayout) dialog.findViewById(R.id.layout_thursday);
                LinearLayout friday = (LinearLayout) dialog.findViewById(R.id.layout_friday);
                LinearLayout saturday = (LinearLayout) dialog.findViewById(R.id.layout_saturday);
                Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_WEEK);
                switch (day) {
                    case Calendar.MONDAY:
                        TextView tvmon= (TextView)   monday.findViewById(R.id.febgnrmonday);
                        tvmon.setTextColor(Color.YELLOW);
                        break;
                    // Current day is Monday

                    case Calendar.TUESDAY:
                        TextView tvtue= (TextView)   tuesday.findViewById(R.id.febgnrtuesday);
                        tvtue.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.WEDNESDAY:
                        TextView tvwed= (TextView)   wednesday.findViewById(R.id.febgnrwednesday);
                        tvwed.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.THURSDAY:
                        TextView tvthu  = (TextView)   thursday.findViewById(R.id.febgnrthursday);
                        tvthu.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.FRIDAY:
                        TextView tvfri= (TextView)   friday.findViewById(R.id.febgnrfriday);
                        tvfri.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.SATURDAY:
                        TextView tvsat= (TextView)   saturday.findViewById(R.id.febgnrsaturday);
                        tvsat.setTextColor(Color.YELLOW);
                        break;


                    // etc.
                }
                monday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                       /* r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new beginner_female_monday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"mondayfrag");
                        transaction.addToBackStack("mondayfrag");
                        transaction.commit();
                    }
                });
                tuesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                       /* r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                       fragment=new beginner_female_tuesday_fragment();

                        transaction.replace(R.id.parentlayout,fragment,"tuesfrag");
                        transaction.addToBackStack("tuesfrag");
                        transaction.commit();
                    }
                });
                wednesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                      /*  r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new beginner_female_wednesday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"wednesfrag");
                        transaction.addToBackStack("wednesfrag");
                        transaction.commit();
                    }
                });
                thursday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                      /*  r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new beginner_female_thursday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"thursdayfrag");
                        transaction.addToBackStack("thursdayfrag");
                        transaction.commit();
                    }
                });
                friday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                     /*   r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new beginner_female_friday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"fridayfrag");
                        transaction.addToBackStack("fridayfrag");
                        transaction.commit();
                    }
                });
                saturday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                       /* r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                       fragment=new beginner_female_saturday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"saturdayfrag");
                        transaction.addToBackStack("saturdayfrag");
                        transaction.commit();
                    }
                });

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1= new Dialog(getActivity());
                dialog1.requestWindowFeature(Window.FEATURE_RIGHT_ICON);
                dialog1.setContentView(R.layout.custom_dialog_design_female_bodybuilder);
                dialog1.show();
                LinearLayout monday = (LinearLayout) dialog1.findViewById(R.id.layout_monday);
                LinearLayout tuesday = (LinearLayout) dialog1.findViewById(R.id.layout_tuesday);
                LinearLayout wednesday = (LinearLayout) dialog1.findViewById(R.id.layout_wednesday);
                LinearLayout thursday = (LinearLayout) dialog1.findViewById(R.id.layout_thursday);
                LinearLayout friday = (LinearLayout) dialog1.findViewById(R.id.layout_friday);
                LinearLayout saturday = (LinearLayout) dialog1.findViewById(R.id.layout_saturday);
                Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_WEEK);
                switch (day) {
                    case Calendar.MONDAY:
                        TextView tvmon= (TextView)   monday.findViewById(R.id.febdlmonday);
                        tvmon.setTextColor(Color.YELLOW);
                        break;
                    // Current day is Monday

                    case Calendar.TUESDAY:
                        TextView tvtue= (TextView)   tuesday.findViewById(R.id.febdltuesday);
                        tvtue.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.WEDNESDAY:
                        TextView tvwed= (TextView)   wednesday.findViewById(R.id.febdlwednesday);
                        tvwed.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.THURSDAY:
                        TextView tvthu  = (TextView)   thursday.findViewById(R.id.febdlthursday);
                        tvthu.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.FRIDAY:
                        TextView tvfri= (TextView)   friday.findViewById(R.id.febdlfriday);
                        tvfri.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.SATURDAY:
                        TextView tvsat= (TextView)   saturday.findViewById(R.id.febdlsaturday);
                        tvsat.setTextColor(Color.YELLOW);
                        break;


                    // etc.
                }
                monday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                       /* r1.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new bodybuilder_female_monday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"mondayfrag");
                        transaction.addToBackStack("mondayfrag");
                        transaction.commit();

                    }
                });
                tuesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                     /*   r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                       fragment=new bodybuilder_female_tuesday_fragment();

                        transaction.replace(R.id.parentlayout,fragment,"tuesdayfrag");
                        transaction.addToBackStack("tuesdayfrag");
                        transaction.commit();
                    }
                });
                wednesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                       /* r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                       fragment=new bodybuilder_female_wednesday_fragment();

                        transaction.replace(R.id.parentlayout,fragment,"wednesdayfrag");
                        transaction.addToBackStack("wednesdayfrag");
                        transaction.commit();
                    }
                });
                thursday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                      /*  r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new bodybuilder_female_thursday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"thursdayfrag");
                        transaction.addToBackStack("thursdayfrag");
                        transaction.commit();
                    }
                });
                friday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                     /*   r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                     fragment=new bodybuilder_female_friday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"fridayfrag");
                        transaction.addToBackStack("fridayfrag");
                        transaction.commit();

                    }
                });
                saturday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frfemale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                       fragment=new bodybuilder_female_saturday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"saturdayfrag");
                        transaction.addToBackStack("saturdayfrag");
                        transaction.commit();

                    }
                });
            }
        });
        return v;
    }
}
