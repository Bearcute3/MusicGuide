package com.test.musicguide_1;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class metal extends AppCompatActivity {
    MediaPlayer mPlayerledzeppelin, mPlayerkiss, mPlayerblack;
    Button startButtonledzeppelin, pauseButtonledzeppelin, stopButtonledzeppelin, startButtonblack, pauseButtonblack, stopButtonblack, startButtonkiss, pauseButtonkiss, stopButtonkiss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_metal);

        final TextView metal3 = (TextView) findViewById(R.id.metal3);
        metal3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView metal5= (TextView) findViewById(R.id.metal5);
        metal5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView metal6 = (TextView) findViewById(R.id.metal6);
        metal6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerledzeppelin= MediaPlayer.create(this, R.raw.ledzeppelin);
        mPlayerledzeppelin.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayledzeppelin();
            }
        });
        mPlayerkiss= MediaPlayer.create(this, R.raw.kiss);
        mPlayerkiss.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaykiss();
            }
        });
        mPlayerblack= MediaPlayer.create(this, R.raw.blacksabbathparanoid);
        mPlayerblack.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayblack();
            }
        });


        startButtonledzeppelin = (Button) findViewById(R.id.startbuttonledzeppelin);
        pauseButtonledzeppelin = (Button) findViewById(R.id.pausebuttonledzeppelin);
        stopButtonledzeppelin = (Button) findViewById(R.id.stopbuttonledzeppelin);
        startButtonkiss = (Button) findViewById(R.id.startbuttonkiss);
        pauseButtonkiss = (Button) findViewById(R.id.pausebuttonkiss);
        stopButtonkiss = (Button) findViewById(R.id.stopbuttonkiss);
        startButtonblack = (Button) findViewById(R.id.startbuttonblack);
        pauseButtonblack = (Button) findViewById(R.id.pausebuttonblack);
        stopButtonblack = (Button) findViewById(R.id.stopbuttonblack);

        pauseButtonledzeppelin.setEnabled(false);
        stopButtonledzeppelin.setEnabled(false);
        pauseButtonblack.setEnabled(false);
        stopButtonkiss.setEnabled(false);
        pauseButtonkiss.setEnabled(false);
        stopButtonblack.setEnabled(false);

    }
    private void stopPlayledzeppelin(){
        mPlayerledzeppelin.stop();
        pauseButtonledzeppelin.setEnabled(false);
        stopButtonledzeppelin.setEnabled(false);
        try {
            mPlayerledzeppelin.prepare();
            mPlayerledzeppelin.seekTo(0);
            startButtonledzeppelin.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playledzeppelin(View view){

        mPlayerledzeppelin.start();
        startButtonledzeppelin.setEnabled(false);
        pauseButtonledzeppelin.setEnabled(true);
        stopButtonledzeppelin.setEnabled(true);
    }
    public void pauseledzeppelin(View view){

        mPlayerledzeppelin.pause();
        startButtonledzeppelin.setEnabled(true);
        pauseButtonledzeppelin.setEnabled(false);
        stopButtonledzeppelin.setEnabled(true);
    }
    public void stopledzeppelin(View view){
        stopPlayledzeppelin();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerledzeppelin.isPlaying())||(mPlayerblack.isPlaying())||(mPlayerkiss.isPlaying())) {
            stopPlayledzeppelin();
            stopPlaykiss();
            stopPlayblack();
        }
    }
    private void stopPlaykiss(){
        mPlayerkiss.stop();
        pauseButtonkiss.setEnabled(false);
        stopButtonkiss.setEnabled(false);
        try {
            mPlayerkiss.prepare();
            mPlayerkiss.seekTo(0);
            startButtonkiss.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayblack(){
        mPlayerblack.stop();
        pauseButtonblack.setEnabled(false);
        stopButtonblack.setEnabled(false);
        try {
            mPlayerblack.prepare();
            mPlayerblack.seekTo(0);
            startButtonblack.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playblack(View view){

        mPlayerblack.start();
        startButtonblack.setEnabled(false);
        pauseButtonblack.setEnabled(true);
        stopButtonblack.setEnabled(true);
    }
    public void playkiss(View view){

        mPlayerkiss.start();
        startButtonkiss.setEnabled(false);
        pauseButtonkiss.setEnabled(true);
        stopButtonkiss.setEnabled(true);
    }
    public void pauseblack(View view){

        mPlayerblack.pause();
        startButtonblack.setEnabled(true);
        pauseButtonblack.setEnabled(false);
        stopButtonblack.setEnabled(true);
    }
    public void pausekiss(View view){

        mPlayerkiss.pause();
        startButtonkiss.setEnabled(true);
        pauseButtonkiss.setEnabled(false);
        stopButtonkiss.setEnabled(true);
    }
    public void stopkiss(View view){
        stopPlaykiss();
    }
    public void stopblack(View view){
        stopPlayblack();
    }
}
