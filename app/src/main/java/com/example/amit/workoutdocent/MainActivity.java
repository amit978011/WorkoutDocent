
package com.example.amit.workoutdocent;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.LayoutRes;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button b2,b3;
Bitmap bitmap;

    Bundle bundle;
    TextView userid;

    private FirebaseAuth firebaseAuth;
    public static int IMAGE_PUTTING = 1;
/*public class Navigation1 extends AppCompatActivity
{
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(R.layout.nav_header_main);
        TextView userid;
        userid=(TextView)findViewById(R.id.tvuserid);
userid.setText("Amit97811");

    }
}*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        setTitle("Workout Docent");
        Intent intent=getIntent();

        //userid.setText("amit978022");
        firebaseAuth= FirebaseAuth.getInstance();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View  navView=  navigationView.getHeaderView(0);
        userid=(TextView) navView.findViewById(R.id.tvuserid);



       // b2.setBackgroundColor(android.graphics.Color.TRANSPARENT);



        b2=(Button)findViewById(R.id.btnwithoutequipment);
        /*if(bundle.getString("userid")!= null)
        {
            String user =bundle.getString("userid");

        }
*/

        String id = intent.getStringExtra("userid");


        if (intent.getStringExtra("userid").equals("login here")) {

            userid.setText(id);
            userid.setTextSize(18);
userid.setTextColor(Color.YELLOW);
        }
        else {
            userid.setTextColor(Color.CYAN);
            userid.setTextSize(14);
            userid.setText(id);
        }



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ii=new Intent(MainActivity.this,Withoutequipment.class);
                startActivity(ii);

               // Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });

        b3=(Button)findViewById(R.id.btnwithequipment);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1=new Intent(MainActivity.this,withequipment_activity.class);
                startActivity(i1);

               // Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });

        userid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        if(userid.getText().equals("login here"))
        {
            Intent i1=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i1);


        }
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.camera) {
            // Handle the camera action
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); // we captured the image and sending it directly
            startActivityForResult(intent, IMAGE_PUTTING);


        } else if (id == R.id.Share) {

            /*Intent intent = new Intent(this,Gallery.class);
            startActivity(intent);
*/
            // we captured the image and sending it directly


        } else if (id == R.id.video)
        {
            Intent intent= new Intent(this,video.class);
            startActivity(intent);
        }
        else if (id == R.id.nutrition)
        {
          Intent intent =new Intent(this,FoodWithEquipment.class);
            startActivity(intent);
        } else if (id == R.id.nav_gym) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.co.in/maps?q=" + "gym"));
            startActivity(intent);




        }


        else if (id == R.id.nav_signout)
        {
            firebaseAuth.signOut();
            finish();

            Intent i=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {  //
        //super.onActivityResult(requestCode, resultCode, data);

        // IMAGE_PUTTING code is for putting image in sd card by clicking through camera  and GETTING_IMAGE is for getting image from sd card

        if(requestCode == IMAGE_PUTTING && resultCode == RESULT_OK && data != null) {

            bitmap = (Bitmap) data.getExtras().get("data");   // geting intent data with getExtra and getting value of key (data) using get method

            // now got the image time to store it in sd card

            // get path to sd card n store image in it

            if(Build.VERSION.SDK_INT < 23) {

                storeImageInSdCard(bitmap);

            } else
                // for alove L version we need to get permission at the door to get throught that location ...
                if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {  // checkSelfPermission is a method avail in 23 api ..without if condition of (SDK_INT < 23 ) you cant implement it..

                    requestPermissions(new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE},IMAGE_PUTTING );

                } else {

                    storeImageInSdCard(bitmap);
                }



        }
    }



    public void storeImageInSdCard(Bitmap bitmap) {

        File file;
        File sdFile = Environment.getExternalStorageDirectory();
        File dir=new File(sdFile.getAbsolutePath()+"/Workout Images");
        if(dir.exists()){

            file=new File(dir,getDateTime()+".png");

            //save your file then
        }
        else{
            dir.mkdirs();
            file=new File(dir,getDateTime()+".png");

            //save your file then
        }



        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file); // read ulta ..writing output stream to file sd
            //Bitmap myBitmap = BitmapFactory.decodeFile();

            //.decodeFile(sdFile.getAbsolutePath()+"/Workout Images");
            bitmap.compress(Bitmap.CompressFormat.PNG,0, fileOutputStream);

            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private final static String getDateTime() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("PST"));
        return df.format(new Date());
    }

}

