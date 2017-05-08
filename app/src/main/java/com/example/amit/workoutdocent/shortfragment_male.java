
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

import com.example.amit.workoutdocent.beginner_male.beginner_male_friday_fragment;
import com.example.amit.workoutdocent.beginner_male.beginner_male_monday_fragment;
import com.example.amit.workoutdocent.beginner_male.beginner_male_saturday_fragment;
import com.example.amit.workoutdocent.beginner_male.beginner_male_thursday_fragment;
import com.example.amit.workoutdocent.beginner_male.beginner_male_tuesday_fragment;
import com.example.amit.workoutdocent.beginner_male.beginner_male_wednesday_fragment;
import com.example.amit.workoutdocent.bodybuilder_male.bodybuilder_male_friday_fragment;
import com.example.amit.workoutdocent.bodybuilder_male.bodybuilder_male_monday_fragment;
import com.example.amit.workoutdocent.bodybuilder_male.bodybuilder_male_saturday_fragment;
import com.example.amit.workoutdocent.bodybuilder_male.bodybuilder_male_thursady_fragment;
import com.example.amit.workoutdocent.bodybuilder_male.bodybuilder_male_tuesday_fragment;
import com.example.amit.workoutdocent.bodybuilder_male.bodybuilder_male_wednesday_fragment;

import java.util.Calendar;

/**
 * Created by bikram on 2/27/2017.
 */

public class shortfragment_male extends Fragment {
    Button beginner,bodybuilder,food;
Dialog dialog,dialog1;
    LinearLayout r1;
RelativeLayout r11;
    ViewFlipper vf;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.shortfragment_male, container, false);
        r1=(LinearLayout)getActivity().findViewById(R.id.buttons);
        food=(Button)getActivity().findViewById(R.id.food);
       // vf=(ViewFlipper)getActivity().findViewById(R.id.vf);
        r11=(RelativeLayout)getActivity().findViewById(R.id.child);
        init(v);

        return v;
    }

    private void init(View v)
    {
final Fragment fragment;
      beginner=(Button)v.findViewById(R.id.button_for_beginerin_male);
      beginner.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              dialog = new Dialog(getActivity());
              dialog.requestWindowFeature(Window.FEATURE_RIGHT_ICON);

              dialog.setContentView(R.layout.custom_dailog_design);
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
                      TextView tvmon= (TextView)   monday.findViewById(R.id.bgnrmonday);
                      tvmon.setTextColor(Color.YELLOW);
                      break;
                  // Current day is Monday

                  case Calendar.TUESDAY:
                      TextView tvtue= (TextView)   tuesday.findViewById(R.id.bgnrtuesday);
                      tvtue.setTextColor(Color.YELLOW);
                      break;
                  case Calendar.WEDNESDAY:
                      TextView tvwed= (TextView)   wednesday.findViewById(R.id.bgnrwednesday);
                      tvwed.setTextColor(Color.YELLOW);
                      break;
                  case Calendar.THURSDAY:
                      TextView tvthu  = (TextView)   thursday.findViewById(R.id.bgnrthursday);
                      tvthu.setTextColor(Color.YELLOW);
                      break;
                  case Calendar.FRIDAY:
                      TextView tvfri= (TextView)   friday.findViewById(R.id.bgnrfriday);
                      tvfri.setTextColor(Color.YELLOW);
                      break;
                  case Calendar.SATURDAY:
                      TextView tvsat= (TextView)   saturday.findViewById(R.id.bgnrsaturday);
                      tvsat.setTextColor(Color.YELLOW);
                      break;


                  // etc.
              }
              monday.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      dialog.dismiss();
                     // vf.setVisibility(View.GONE);
                     /* r1.setVisibility(View.GONE);

                      food.setVisibility(View.GONE);*/
                      r11.setVisibility(View.GONE);
                      FragmentManager manager=getFragmentManager();
                      FragmentTransaction transaction=manager.beginTransaction();
                      Fragment fragment = manager.findFragmentByTag("frmale");

                      if (fragment != null) {
                          transaction.remove(fragment);
                      }
                      fragment=new beginner_male_monday_fragment();
                      transaction.replace(R.id.parentlayout,fragment,"mondayfrag");
                      transaction.addToBackStack("mondayfrag");
                      transaction.commit();
                  }
              });
              tuesday.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      dialog.dismiss();
                     /* vf.setVisibility(View.GONE);
                      r1.setVisibility(View.GONE);
                      food.setVisibility(View.GONE);*/
                      r11.setVisibility(View.GONE);
                      FragmentManager manager=getFragmentManager();
                      FragmentTransaction transaction=manager.beginTransaction();
                      Fragment fragment = manager.findFragmentByTag("frmale");

                      if (fragment != null) {
                          transaction.remove(fragment);
                      }
                      fragment=new beginner_male_tuesday_fragment();
                      transaction.replace(R.id.parentlayout,fragment,"tuesfrag");
                      transaction.addToBackStack("tuesfrag");
                      transaction.commit();
                  }
              });
              wednesday.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      dialog.dismiss();
                     /* vf.setVisibility(View.GONE);
                      r1.setVisibility(View.GONE);
                      food.setVisibility(View.GONE);*/
                      r11.setVisibility(View.GONE);
                      FragmentManager manager=getFragmentManager();
                      FragmentTransaction transaction=manager.beginTransaction();
                      Fragment fragment = manager.findFragmentByTag("frmale");

                      if (fragment != null) {
                          transaction.remove(fragment);
                      }
                      fragment=new beginner_male_wednesday_fragment();
                      transaction.replace(R.id.parentlayout,fragment,"wednesfrag");
                      transaction.addToBackStack("wednesfrag");
                      transaction.commit();
                  }
              });
              thursday.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      dialog.dismiss();
                     /* vf.setVisibility(View.GONE);
                      r1.setVisibility(View.GONE);
                      food.setVisibility(View.GONE);*/
                      r11.setVisibility(View.GONE);
                      FragmentManager manager=getFragmentManager();
                      FragmentTransaction transaction=manager.beginTransaction();
                      Fragment fragment = manager.findFragmentByTag("frmale");

                      if (fragment != null) {
                          transaction.remove(fragment);
                      }
                       fragment=new beginner_male_thursday_fragment();
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
                      Fragment fragment = manager.findFragmentByTag("frmale");

                      if (fragment != null) {
                          transaction.remove(fragment);
                      }
                       fragment=new beginner_male_friday_fragment();
                       transaction.replace(R.id.parentlayout,fragment,"fridayfrag");
                      transaction.addToBackStack("fridayfrag");
                      transaction.commit();
                  }
              });
              saturday.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      dialog.dismiss();
                 /*     r1.setVisibility(View.GONE);
                      vf.setVisibility(View.GONE);
                      food.setVisibility(View.GONE);*/
                      r11.setVisibility(View.GONE);
                      FragmentManager manager=getFragmentManager();
                      FragmentTransaction transaction=manager.beginTransaction();
                      Fragment fragment = manager.findFragmentByTag("frmale");

                      if (fragment != null) {
                          transaction.remove(fragment);
                      }
                    fragment=new beginner_male_saturday_fragment();
                      transaction.replace(R.id.parentlayout,fragment,"saturdayfrag");
                      transaction.addToBackStack("saturdayfrag");
                      transaction.commit();
                  }
              });

          }
      });
        bodybuilder=(Button)v.findViewById(R.id.button_for_bodybuilder_male);
        bodybuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1 = new Dialog(getActivity());

                dialog1.requestWindowFeature(Window.FEATURE_RIGHT_ICON);

                dialog1.setContentView(R.layout.custom_dailog_design_bodybuilder);
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
                        TextView tvmon= (TextView)   monday.findViewById(R.id.bldrmonday);
                        tvmon.setTextColor(Color.YELLOW);
                        break;
                    // Current day is Monday

                    case Calendar.TUESDAY:
                        TextView tvtue= (TextView)   tuesday.findViewById(R.id.bldrtuesday);
                        tvtue.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.WEDNESDAY:
                        TextView tvwed= (TextView)   wednesday.findViewById(R.id.bldrwednesday);
                        tvwed.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.THURSDAY:
                        TextView tvthu  = (TextView)   thursday.findViewById(R.id.bldrthursday);
                        tvthu.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.FRIDAY:
                        TextView tvfri= (TextView)   friday.findViewById(R.id.bldrfriday);
                        tvfri.setTextColor(Color.YELLOW);
                        break;
                    case Calendar.SATURDAY:
                        TextView tvsat= (TextView)   saturday.findViewById(R.id.bldrsaturday);
                        tvsat.setTextColor(Color.YELLOW);
                        break;


                    // etc.
                }
                monday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                      /*  r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frmale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                       fragment=new  bodybuilder_male_monday_fragment();
                          transaction.replace(R.id.parentlayout,fragment,"mondayfrag");
                        transaction.addToBackStack("mondayfrag");
                        transaction.commit();

                    }
                });
                tuesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                      /*  vf.setVisibility(View.GONE);
                        r1.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frmale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                       fragment=new  bodybuilder_male_tuesday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"tuesdayfrag");
                        transaction.addToBackStack("tuesdayfrag");
                        transaction.commit();
                    }
                });
                wednesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                     /*   vf.setVisibility(View.GONE);
                        r1.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frmale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new  bodybuilder_male_wednesday_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"wednesdayfrag");
                        transaction.addToBackStack("wednesdayfrag");
                        transaction.commit();
                    }
                });
                thursday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                      /*  vf.setVisibility(View.GONE);
                        r1.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frmale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                         fragment=new bodybuilder_male_thursady_fragment();
                        transaction.replace(R.id.parentlayout,fragment,"thursdayfrag");
                        transaction.addToBackStack("thursdayfrag");
                        transaction.commit();
                    }
                });
                friday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                    /*    r1.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frmale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment=new bodybuilder_male_friday_fragment();
                         transaction.replace(R.id.parentlayout,fragment,"fridayfrag");
                        transaction.addToBackStack("fridayfrag");
                        transaction.commit();

                    }
                });
                saturday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                     /*   r1.setVisibility(View.GONE);
                        vf.setVisibility(View.GONE);
                        food.setVisibility(View.GONE);*/
                        r11.setVisibility(View.GONE);
                        FragmentManager manager=getFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        Fragment fragment = manager.findFragmentByTag("frmale");

                        if (fragment != null) {
                            transaction.remove(fragment);
                        }
                        fragment =new bodybuilder_male_saturday_fragment();
                         transaction.replace(R.id.parentlayout,fragment,"saturdayfrag");
                        transaction.addToBackStack("saturdayfrag");
                        transaction.commit();

                    }
                });
            }
        });


  }


    }

