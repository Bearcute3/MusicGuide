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

public class rock extends AppCompatActivity {
    MediaPlayer mPlayerrock1, mPlayerrock2, mPlayerrock3;
    Button startButtonrock1, pauseButtonrock1, stopButtonrock1, startButtonrock2, pauseButtonrock2, stopButtonrock2, startButtonrock3, pauseButtonrock3, stopButtonrock3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_rock);

        final TextView rock1 = (TextView) findViewById(R.id.rock1);
        rock1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView rock2= (TextView) findViewById(R.id.rock2);
        rock2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView rock3 = (TextView) findViewById(R.id.rock3);
        rock3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerrock1= MediaPlayer.create(this, R.raw.rock1);
        mPlayerrock1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrock1();
            }
        });
        mPlayerrock2= MediaPlayer.create(this, R.raw.rock2);
        mPlayerrock2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrock2();
            }
        });
        mPlayerrock3= MediaPlayer.create(this, R.raw.rock3);
        mPlayerrock3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrock3();
            }
        });


        startButtonrock1 = (Button) findViewById(R.id.startbuttonrock1);
        pauseButtonrock1 = (Button) findViewById(R.id.pausebuttonrock1);
        stopButtonrock1 = (Button) findViewById(R.id.stopbuttonrock1);
        startButtonrock2 = (Button) findViewById(R.id.startbuttonrock2);
        pauseButtonrock2 = (Button) findViewById(R.id.pausebuttonrock2);
        stopButtonrock2 = (Button) findViewById(R.id.stopbuttonrock2);
        startButtonrock3 = (Button) findViewById(R.id.startbuttonrock3);
        pauseButtonrock3 = (Button) findViewById(R.id.pausebuttonrock3);
        stopButtonrock3 = (Button) findViewById(R.id.stopbuttonrock3);

        pauseButtonrock1.setEnabled(false);
        stopButtonrock1.setEnabled(false);
        pauseButtonrock2.setEnabled(false);
        stopButtonrock2.setEnabled(false);
        pauseButtonrock3.setEnabled(false);
        stopButtonrock3.setEnabled(false);

    }
    private void stopPlayrock1(){
        mPlayerrock1.stop();
        pauseButtonrock1.setEnabled(false);
        stopButtonrock1.setEnabled(false);
        try {
            mPlayerrock1.prepare();
            mPlayerrock1.seekTo(0);
            startButtonrock1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playrock1(View view){

        mPlayerrock1.start();
        startButtonrock1.setEnabled(false);
        pauseButtonrock1.setEnabled(true);
        stopButtonrock1.setEnabled(true);
    }
    public void pauserock1(View view){

        mPlayerrock1.pause();
        startButtonrock1.setEnabled(true);
        pauseButtonrock1.setEnabled(false);
        stopButtonrock1.setEnabled(true);
    }
    public void stoprock1(View view){
        stopPlayrock1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerrock1.isPlaying())||(mPlayerrock2.isPlaying())||(mPlayerrock3.isPlaying())) {
            stopPlayrock1();
            stopPlayrock2();
            stopPlayrock3();
        }
    }
    private void stopPlayrock2(){
        mPlayerrock2.stop();
        pauseButtonrock2.setEnabled(false);
        stopButtonrock2.setEnabled(false);
        try {
            mPlayerrock2.prepare();
            mPlayerrock2.seekTo(0);
            startButtonrock2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayrock3(){
        mPlayerrock3.stop();
        pauseButtonrock3.setEnabled(false);
        stopButtonrock3.setEnabled(false);
        try {
            mPlayerrock3.prepare();
            mPlayerrock3.seekTo(0);
            startButtonrock3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playrock2(View view){

        mPlayerrock2.start();
        startButtonrock2.setEnabled(false);
        pauseButtonrock2.setEnabled(true);
        stopButtonrock2.setEnabled(true);
    }
    public void playrock3(View view){

        mPlayerrock3.start();
        startButtonrock3.setEnabled(false);
        pauseButtonrock3.setEnabled(true);
        stopButtonrock3.setEnabled(true);
    }
    public void pauserock2(View view){

        mPlayerrock2.pause();
        startButtonrock2.setEnabled(true);
        pauseButtonrock2.setEnabled(false);
        stopButtonrock2.setEnabled(true);
    }
    public void pauserock3(View view){

        mPlayerrock3.pause();
        startButtonrock3.setEnabled(true);
        pauseButtonrock3.setEnabled(false);
        stopButtonrock3.setEnabled(true);
    }
    public void stoprock2(View view){
        stopPlayrock2();
    }
    public void stoprock3(View view){
        stopPlayrock3();
    }
}