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

public class classic extends AppCompatActivity {
    MediaPlayer mPlayerclassic1, mPlayerclassic2, mPlayerclassic3;
    Button startButtonclassic1, pauseButtonclassic1, stopButtonclassic1, startButtonclassic2, pauseButtonclassic2, stopButtonclassic2, startButtonclassic3, pauseButtonclassic3, stopButtonclassic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_classic);

        final TextView classic1 = (TextView) findViewById(R.id.classic1);
        classic1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView classic2= (TextView) findViewById(R.id.classic2);
        classic2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView classic3 = (TextView) findViewById(R.id.classic3);
        classic3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerclassic1= MediaPlayer.create(this, R.raw.classic1);
        mPlayerclassic1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayclassic1();
            }
        });
        mPlayerclassic2= MediaPlayer.create(this, R.raw.classic2);
        mPlayerclassic2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayclassic2();
            }
        });
        mPlayerclassic3= MediaPlayer.create(this, R.raw.classic3);
        mPlayerclassic3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayclassic3();
            }
        });


        startButtonclassic1 = (Button) findViewById(R.id.startbuttonclassic1);
        pauseButtonclassic1 = (Button) findViewById(R.id.pausebuttonclassic1);
        stopButtonclassic1 = (Button) findViewById(R.id.stopbuttonclassic1);
        startButtonclassic2 = (Button) findViewById(R.id.startbuttonclassic2);
        pauseButtonclassic2 = (Button) findViewById(R.id.pausebuttonclassic2);
        stopButtonclassic2 = (Button) findViewById(R.id.stopbuttonclassic2);
        startButtonclassic3 = (Button) findViewById(R.id.startbuttonclassic3);
        pauseButtonclassic3 = (Button) findViewById(R.id.pausebuttonclassic3);
        stopButtonclassic3 = (Button) findViewById(R.id.stopbuttonclassic3);

        pauseButtonclassic1.setEnabled(false);
        stopButtonclassic1.setEnabled(false);
        pauseButtonclassic2.setEnabled(false);
        stopButtonclassic2.setEnabled(false);
        pauseButtonclassic3.setEnabled(false);
        stopButtonclassic3.setEnabled(false);

    }
    private void stopPlayclassic1(){
        mPlayerclassic1.stop();
        pauseButtonclassic1.setEnabled(false);
        stopButtonclassic1.setEnabled(false);
        try {
            mPlayerclassic1.prepare();
            mPlayerclassic1.seekTo(0);
            startButtonclassic1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playclassic1(View view){

        mPlayerclassic1.start();
        startButtonclassic1.setEnabled(false);
        pauseButtonclassic1.setEnabled(true);
        stopButtonclassic1.setEnabled(true);
    }
    public void pauseclassic1(View view){

        mPlayerclassic1.pause();
        startButtonclassic1.setEnabled(true);
        pauseButtonclassic1.setEnabled(false);
        stopButtonclassic1.setEnabled(true);
    }
    public void stopclassic1(View view){
        stopPlayclassic1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerclassic1.isPlaying())||(mPlayerclassic2.isPlaying())||(mPlayerclassic3.isPlaying())) {
            stopPlayclassic1();
            stopPlayclassic2();
            stopPlayclassic3();
        }
    }
    private void stopPlayclassic2(){
        mPlayerclassic2.stop();
        pauseButtonclassic2.setEnabled(false);
        stopButtonclassic2.setEnabled(false);
        try {
            mPlayerclassic2.prepare();
            mPlayerclassic2.seekTo(0);
            startButtonclassic2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayclassic3(){
        mPlayerclassic3.stop();
        pauseButtonclassic3.setEnabled(false);
        stopButtonclassic3.setEnabled(false);
        try {
            mPlayerclassic3.prepare();
            mPlayerclassic3.seekTo(0);
            startButtonclassic3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playclassic2(View view){

        mPlayerclassic2.start();
        startButtonclassic2.setEnabled(false);
        pauseButtonclassic2.setEnabled(true);
        stopButtonclassic2.setEnabled(true);
    }
    public void playclassic3(View view){

        mPlayerclassic3.start();
        startButtonclassic3.setEnabled(false);
        pauseButtonclassic3.setEnabled(true);
        stopButtonclassic3.setEnabled(true);
    }
    public void pauseclassic2(View view){

        mPlayerclassic2.pause();
        startButtonclassic2.setEnabled(true);
        pauseButtonclassic2.setEnabled(false);
        stopButtonclassic2.setEnabled(true);
    }
    public void pauseclassic3(View view){

        mPlayerclassic3.pause();
        startButtonclassic3.setEnabled(true);
        pauseButtonclassic3.setEnabled(false);
        stopButtonclassic3.setEnabled(true);
    }
    public void stopclassic2(View view){
        stopPlayclassic2();
    }
    public void stopclassic3(View view){
        stopPlayclassic3();
    }
}