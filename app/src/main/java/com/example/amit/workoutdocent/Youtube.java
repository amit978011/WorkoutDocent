
package com.example.amit.workoutdocent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by bikram on 3/19/2017.
 */

public class Youtube extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener
{
TextView t1;
    ImageView im;
    public static final String API_KEY ="AIzaSyCtk_IN4uWNchiAvgTlRX1aHobqwB54FBQ";
    public static String VIDEO_ID ;
    public void onCreate(Bundle bn)
    {
        super.onCreate(bn);
        setContentView(R.layout.youtubeactivity);
        t1=(TextView)findViewById(R.id.text1);

        im=(ImageView)findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtube1); //initilize youtube player view
        youTubePlayerView.initialize(API_KEY,  this);

        Bundle bundle = getIntent().getExtras();
        if(bundle.getString("title")!= null)
        {
            String title=bundle.getString("title");
            t1.setText(title);
        }
        else
        {
            t1.setText("You Tube");
        }
        if(bundle.getString("STRING_I_NEED")!= null)
        {
            VIDEO_ID =bundle.getString("STRING_I_NEED");
        }

    }
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) { //youtube player is youtube object coming after initilization.
        // for showing video on youtube screen we need to provide video url here..otherwise it will show loading sign
        if(null == youTubePlayer)  return;

        if(!b ) { //if above condition is false...
            youTubePlayer.cueVideo(VIDEO_ID); //play video...

        }







        // other lister you can use for advance configuration.. and for error handling...
        // just telling you not using it....

        youTubePlayer.setPlayerStateChangeListener(new YouTubePlayer.PlayerStateChangeListener() {
            @Override
            public void onLoading() {
               // Toast.makeText(second.this, "loading", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onLoaded(String s) {
               // Toast.makeText(second.this, "loaded", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAdStarted() {


            }

            @Override
            public void onVideoStarted() {
               // Toast.makeText(second.this, "started", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onVideoEnded() {
                //Toast.makeText(second.this, "ended", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError(YouTubePlayer.ErrorReason errorReason) {

            }
        });


        youTubePlayer.setPlaybackEventListener(new YouTubePlayer.PlaybackEventListener() {
            @Override
            public void onPlaying() {

            }

            @Override
            public void onPaused() {
               // Toast.makeText(second.this, "paused", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopped() {

            }

            @Override
            public void onBuffering(boolean b) {

            }

            @Override
            public void onSeekTo(int i) {

            }
        });






    }
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Failed to Initilize" ,Toast.LENGTH_LONG).show();  // (this) representing OnItemListener..so we using (this) instead of Context ( coz its representing the MainActivity)

    }

    @Override
    public void onBackPressed() {
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
