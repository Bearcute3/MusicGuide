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

public class rocknroll extends AppCompatActivity {
    MediaPlayer mPlayerrocknroll1, mPlayerrocknroll2, mPlayerrocknroll3;
    Button startButtonrocknroll1, pauseButtonrocknroll1, stopButtonrocknroll1, startButtonrocknroll2, pauseButtonrocknroll2, stopButtonrocknroll2, startButtonrocknroll3, pauseButtonrocknroll3, stopButtonrocknroll3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_rocknroll);

        final TextView rocknroll1 = (TextView) findViewById(R.id.rocknroll1);
        rocknroll1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView rocknroll2= (TextView) findViewById(R.id.rocknroll2);
        rocknroll2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView rocknroll3 = (TextView) findViewById(R.id.rocknroll3);
        rocknroll3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerrocknroll1= MediaPlayer.create(this, R.raw.rocknroll1);
        mPlayerrocknroll1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrocknroll1();
            }
        });
        mPlayerrocknroll2= MediaPlayer.create(this, R.raw.rocknroll2);
        mPlayerrocknroll2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrocknroll2();
            }
        });
        mPlayerrocknroll3= MediaPlayer.create(this, R.raw.rocknroll3);
        mPlayerrocknroll3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrocknroll3();
            }
        });


        startButtonrocknroll1 = (Button) findViewById(R.id.startbuttonrocknroll1);
        pauseButtonrocknroll1 = (Button) findViewById(R.id.pausebuttonrocknroll1);
        stopButtonrocknroll1 = (Button) findViewById(R.id.stopbuttonrocknroll1);
        startButtonrocknroll2 = (Button) findViewById(R.id.startbuttonrocknroll2);
        pauseButtonrocknroll2 = (Button) findViewById(R.id.pausebuttonrocknroll2);
        stopButtonrocknroll2 = (Button) findViewById(R.id.stopbuttonrocknroll2);
        startButtonrocknroll3 = (Button) findViewById(R.id.startbuttonrocknroll3);
        pauseButtonrocknroll3 = (Button) findViewById(R.id.pausebuttonrocknroll3);
        stopButtonrocknroll3 = (Button) findViewById(R.id.stopbuttonrocknroll3);

        pauseButtonrocknroll1.setEnabled(false);
        stopButtonrocknroll1.setEnabled(false);
        pauseButtonrocknroll2.setEnabled(false);
        stopButtonrocknroll2.setEnabled(false);
        pauseButtonrocknroll3.setEnabled(false);
        stopButtonrocknroll3.setEnabled(false);

    }
    private void stopPlayrocknroll1(){
        mPlayerrocknroll1.stop();
        pauseButtonrocknroll1.setEnabled(false);
        stopButtonrocknroll1.setEnabled(false);
        try {
            mPlayerrocknroll1.prepare();
            mPlayerrocknroll1.seekTo(0);
            startButtonrocknroll1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playrocknroll1(View view){

        mPlayerrocknroll1.start();
        startButtonrocknroll1.setEnabled(false);
        pauseButtonrocknroll1.setEnabled(true);
        stopButtonrocknroll1.setEnabled(true);
    }
    public void pauserocknroll1(View view){

        mPlayerrocknroll1.pause();
        startButtonrocknroll1.setEnabled(true);
        pauseButtonrocknroll1.setEnabled(false);
        stopButtonrocknroll1.setEnabled(true);
    }
    public void stoprocknroll1(View view){
        stopPlayrocknroll1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerrocknroll1.isPlaying())||(mPlayerrocknroll2.isPlaying())||(mPlayerrocknroll3.isPlaying())) {
            stopPlayrocknroll1();
            stopPlayrocknroll2();
            stopPlayrocknroll3();
        }
    }
    private void stopPlayrocknroll2(){
        mPlayerrocknroll2.stop();
        pauseButtonrocknroll2.setEnabled(false);
        stopButtonrocknroll2.setEnabled(false);
        try {
            mPlayerrocknroll2.prepare();
            mPlayerrocknroll2.seekTo(0);
            startButtonrocknroll2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayrocknroll3(){
        mPlayerrocknroll3.stop();
        pauseButtonrocknroll3.setEnabled(false);
        stopButtonrocknroll3.setEnabled(false);
        try {
            mPlayerrocknroll3.prepare();
            mPlayerrocknroll3.seekTo(0);
            startButtonrocknroll3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playrocknroll2(View view){

        mPlayerrocknroll2.start();
        startButtonrocknroll2.setEnabled(false);
        pauseButtonrocknroll2.setEnabled(true);
        stopButtonrocknroll2.setEnabled(true);
    }
    public void playrocknroll3(View view){

        mPlayerrocknroll3.start();
        startButtonrocknroll3.setEnabled(false);
        pauseButtonrocknroll3.setEnabled(true);
        stopButtonrocknroll3.setEnabled(true);
    }
    public void pauserocknroll2(View view){

        mPlayerrocknroll2.pause();
        startButtonrocknroll2.setEnabled(true);
        pauseButtonrocknroll2.setEnabled(false);
        stopButtonrocknroll2.setEnabled(true);
    }
    public void pauserocknroll3(View view){

        mPlayerrocknroll3.pause();
        startButtonrocknroll3.setEnabled(true);
        pauseButtonrocknroll3.setEnabled(false);
        stopButtonrocknroll3.setEnabled(true);
    }
    public void stoprocknroll2(View view){
        stopPlayrocknroll2();
    }
    public void stoprocknroll3(View view){
        stopPlayrocknroll3();
    }
}