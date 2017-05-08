
package com.example.amit.workoutdocent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FoodWithEquipment extends Activity {
TextView t1;
    ImageView im;
    FoodWithEquipmentExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodwithequipment_activitymain);
        t1=(TextView)findViewById(R.id.text1);
        t1.setText("Nutrition");
        im=(ImageView)findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new FoodWithEquipmentExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
       /* expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
              *//*  Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();*//*
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
               *//* Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();*//*

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
               *//* Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();*//*
                return false;
            }
        });*/
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("BEETS");
        listDataHeader.add("BROWN RICE");
        listDataHeader.add("ORANGES");
        listDataHeader.add("CANTALOUPE");
        listDataHeader.add("COTTAGE CHEESE ");
        listDataHeader.add("EGGS");
        listDataHeader.add("MILK");
        listDataHeader.add("QUINOA");
        listDataHeader.add("SPINACH");
        listDataHeader.add("APPLES");
        listDataHeader.add("GREEK YOGURT");
        listDataHeader.add("WHEAT GERM");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add(" A good source of betaine, also known as trimethylglycine, this nutrient not only enhances liver and joint repair, but also has been shown in clinical research to increase muscle strength and power.\n" +
                "\n" +
                "Beets also provide an NO boost which can ehance energy and aid recovery.");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("A slow-digesting whole grain that provides you longer-lasting energy throughout the day, and during workouts. Brown rice also can help boost your growth hormone (GH) levels, which are critical for encouraging lean muscle growth, fat loss and strength gains.");


        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("Another good fruit that can actually help to boost muscle growth, strength and endurance, especially when eaten before workouts");
        List<String> CANTALOUPE  = new ArrayList<String>();
        CANTALOUPE.add("Due to it's relatively low fructose content, this melon is one of the few fruits that is actually a fast-digesting carb. That makes it a good carb to have first thing in the morning after a long night of fasting and one of the few good fruits to eat after workouts.");
        List<String> COTTAGE   = new ArrayList<String>();
        COTTAGE.add("Rich in casein protein, cottage cheese is a great go-to protein source, especially before bed.\n" +
                "\n" +
                "Casein protein is the slowest-digesting protein you can eat, meaning it prevents your muscles from being used as an energy source while you fast during the night.");
        List<String> EGGS   = new ArrayList<String>();
        EGGS.add("Eggs are known as the perfect protein, but their ability to boost lean muscle and strength gains isn't due to just the protein alone. It gets a lot of help from the yolks, where the cholesterol is found.\n" +
                "\n" +
                "If you're worried about your cholesterol shooting up from eating the yolks, cholesterol from eggs has been shown to decrease the amount of LDL (bad) cholesterol particles associated with atherosclerosis.");
        List<String> MILK   = new ArrayList<String>();
        MILK.add("Contains both whey and casein and is rich in the amino acid glutamine. Organic milk has about 70% more omega-3 fatty acids than conventional milk.");
        List<String> QUINOA  = new ArrayList<String>();
        QUINOA.add("A complete protein in addition to being a slow-digesting carb, quinoa has been linked with an increase in insulin-like growth factor-1 (IGF-1) levels, an important factor associated with lean muscle and strength gains.");
        List<String> SPINACH  = new ArrayList<String>();
        SPINACH.add("A good source of glutamine, the amino acid that is important for lean muscle growth.\n" +
                "\n" +
                "In addition to glutamine, spinach can increase muscle strength and endurance.");
        List<String> APPLE  = new ArrayList<String>();
        APPLE.add("The specific polyphenols in apples help to increase muscle strength and prevent muscle fatigue, allowing you to train harder for longer.\n" +
                "\n" +
                "Other research also shows that these polyphenols can increase fat burning as well. That's why it's a good idea to make apples a pre-workout carb source.");
        List<String> GREEK  = new ArrayList<String>();
        GREEK.add("Like plain yogurt, Greek yogurt starts from the same source: milk. Greek yogurt, however, has more protein (a whopping 20 g per cup) and fewer carbs (9 g per cup) than regular yogurt (16 g protein, 16 g carbs per cup).\n" +
                "\n" +
                "It's also a good source of casein protein.");
        List<String> WHEAT   = new ArrayList<String>();
        WHEAT.add("Rich in zinc, iron, selenium, potassium and B vitamins, high in fiber and protein, with a good amount of branched-chain amino acids (BCAAs), arginine and glutamine.\n" +
                "\n" +
                "This makes wheat germ a great source of slow-digesting carbohydrates and a quality protein that's a perfect food before workouts.");
        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
        listDataChild.put(listDataHeader.get(3), CANTALOUPE);
        listDataChild.put(listDataHeader.get(4), COTTAGE);
        listDataChild.put(listDataHeader.get(5), EGGS );
        listDataChild.put(listDataHeader.get(6), MILK );
        listDataChild.put(listDataHeader.get(7), QUINOA );
        listDataChild.put(listDataHeader.get(8), SPINACH );
        listDataChild.put(listDataHeader.get(9), APPLE );
        listDataChild.put(listDataHeader.get(10), GREEK );
        listDataChild.put(listDataHeader.get(11), WHEAT);
    }
}