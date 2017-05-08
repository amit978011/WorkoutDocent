
package com.example.amit.workoutdocent;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.amit.workoutdocent.nutirents.fragment_for_nutirents_for_withoutequipment;


/**
 * Created by bikram on 2/23/2017.
 */

public class withoutequipmentfragment extends Fragment {
    ListView listView;
  //  ImageView im;
    FragmentTransaction fragmentTransaction;
    Withoutequipmentdesign cs;
    private FragmentManager fragmentManager;
    private Fragment fragment;

    TextView t1;
    ImageView im1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentwithoutequipment,container,false);
 im1=(ImageView)v.findViewById(R.id.back);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),MainActivity.class);
                startActivity(i);
            }
        });
        t1=(TextView)v.findViewById(R.id.text1);
        t1.setText("Without Equipment");
        init(v);

        return v;
    }

    private void init(View v) {


        fragmentManager = getFragmentManager();
        fragmentTransaction= fragmentManager.beginTransaction();

         listView = (ListView) v.findViewById(R.id.lstviewwithoutequipment);
        // im = (ImageView) v.findViewById(R.id.imgviewwithoutequipment);
         cs = new Withoutequipmentdesign(getActivity().getLayoutInflater());
         listView.setAdapter(cs);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if(i==0)
               {
                   fragment = fragmentManager.findFragmentByTag("frag0");

                   if (fragment != null) {
                       fragmentTransaction.remove(fragment);    // remove Transaction
                   }


                   fragment = new Fragment1();
                   fragmentTransaction.add(R.id.withoutequipment, fragment, "frag1");    //giving tag to fragment
                   fragmentTransaction.addToBackStack("frag1");
                   fragmentTransaction.commit();

               }
                if(i==1)
                {
                    fragment = fragmentManager.findFragmentByTag("frag0");
                   // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    if (fragment != null) {
                        fragmentTransaction.remove(fragment);    // remove Transaction
                    }


                    fragment = new Fragment2();
                    fragmentTransaction.add(R.id.withoutequipment, fragment, "frag2");    //giving tag to fragment
                    fragmentTransaction.addToBackStack("frag2");
                    fragmentTransaction.commit();
                }
                if(i==2)
                {
                    fragment = fragmentManager.findFragmentByTag("frag0");
                  //  FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    if (fragment != null) {
                        fragmentTransaction.remove(fragment);    // remove Transaction
                    }


                    fragment = new Fragment3();
                    fragmentTransaction.add(R.id.withoutequipment, fragment, "frag3");    //giving tag to fragment
                    fragmentTransaction.addToBackStack("frag3");
                    fragmentTransaction.commit();
                }
                if(i==3)
                {
                    fragment = fragmentManager.findFragmentByTag("frag0");
                  //  FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    if (fragment != null) {
                        fragmentTransaction.remove(fragment);    // remove Transaction
                    }


                    fragment = new Fragment4();
                    fragmentTransaction.add(R.id.withoutequipment, fragment, "frag4");    //giving tag to fragment
                    fragmentTransaction.addToBackStack("frag4");
                    fragmentTransaction.commit();
                }
                if(i==4)
                {
                    fragment = fragmentManager.findFragmentByTag("frag0");

                    if (fragment != null) {
                        fragmentTransaction.remove(fragment);    // remove Transaction
                    }
                    fragment_for_nutirents_for_withoutequipment frag=new fragment_for_nutirents_for_withoutequipment();
                    fragmentTransaction.add(R.id.withoutequipment,frag,"nutrition");
                    fragmentTransaction.addToBackStack("nutrition");
                    fragmentTransaction.commit();
                }
                if(i==5)
                {
                    Intent ie = new Intent(getActivity(), Youtube.class);
                    String strnme="_f2r2qmSyBM";
                    ie.putExtra("STRING_I_NEED",strnme);
                    startActivity(ie);

                }
            }
        });

    }




    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

}
