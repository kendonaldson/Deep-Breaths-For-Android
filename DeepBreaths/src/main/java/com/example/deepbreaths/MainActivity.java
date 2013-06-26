package com.example.deepbreaths;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.media.MediaPlayer;

public class MainActivity extends Activity {

    protected void onStart() {
        super.onStart();
        MediaPlayer player = MediaPlayer.create(this, R.raw.wave_loop);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);
        player.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
