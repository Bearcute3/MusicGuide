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

public class ritmnbluze extends AppCompatActivity {
    MediaPlayer mPlayerritmnbluze1, mPlayerritmnbluze2, mPlayerritmnbluze3;
    Button startButtonritmnbluze1, pauseButtonritmnbluze1, stopButtonritmnbluze1, startButtonritmnbluze2, pauseButtonritmnbluze2, stopButtonritmnbluze2, startButtonritmnbluze3, pauseButtonritmnbluze3, stopButtonritmnbluze3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_ritmnbluze);

        final TextView ritmnbluze1 = (TextView) findViewById(R.id.ritmnbluze1);
        ritmnbluze1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView ritmnbluze2= (TextView) findViewById(R.id.ritmnbluze2);
        ritmnbluze2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView ritmnbluze3 = (TextView) findViewById(R.id.ritmnbluze3);
        ritmnbluze3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerritmnbluze1= MediaPlayer.create(this, R.raw.ritmnbluze1);
        mPlayerritmnbluze1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayritmnbluze1();
            }
        });
        mPlayerritmnbluze2= MediaPlayer.create(this, R.raw.ritmnbluze2);
        mPlayerritmnbluze2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayritmnbluze2();
            }
        });
        mPlayerritmnbluze3= MediaPlayer.create(this, R.raw.ritmnbluze3);
        mPlayerritmnbluze3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayritmnbluze3();
            }
        });


        startButtonritmnbluze1 = (Button) findViewById(R.id.startbuttonritmnbluze1);
        pauseButtonritmnbluze1 = (Button) findViewById(R.id.pausebuttonritmnbluze1);
        stopButtonritmnbluze1 = (Button) findViewById(R.id.stopbuttonritmnbluze1);
        startButtonritmnbluze2 = (Button) findViewById(R.id.startbuttonritmnbluze2);
        pauseButtonritmnbluze2 = (Button) findViewById(R.id.pausebuttonritmnbluze2);
        stopButtonritmnbluze2 = (Button) findViewById(R.id.stopbuttonritmnbluze2);
        startButtonritmnbluze3 = (Button) findViewById(R.id.startbuttonritmnbluze3);
        pauseButtonritmnbluze3 = (Button) findViewById(R.id.pausebuttonritmnbluze3);
        stopButtonritmnbluze3 = (Button) findViewById(R.id.stopbuttonritmnbluze3);

        pauseButtonritmnbluze1.setEnabled(false);
        stopButtonritmnbluze1.setEnabled(false);
        pauseButtonritmnbluze2.setEnabled(false);
        stopButtonritmnbluze2.setEnabled(false);
        pauseButtonritmnbluze3.setEnabled(false);
        stopButtonritmnbluze3.setEnabled(false);

    }
    private void stopPlayritmnbluze1(){
        mPlayerritmnbluze1.stop();
        pauseButtonritmnbluze1.setEnabled(false);
        stopButtonritmnbluze1.setEnabled(false);
        try {
            mPlayerritmnbluze1.prepare();
            mPlayerritmnbluze1.seekTo(0);
            startButtonritmnbluze1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playritmnbluze1(View view){

        mPlayerritmnbluze1.start();
        startButtonritmnbluze1.setEnabled(false);
        pauseButtonritmnbluze1.setEnabled(true);
        stopButtonritmnbluze1.setEnabled(true);
    }
    public void pauseritmnbluze1(View view){

        mPlayerritmnbluze1.pause();
        startButtonritmnbluze1.setEnabled(true);
        pauseButtonritmnbluze1.setEnabled(false);
        stopButtonritmnbluze1.setEnabled(true);
    }
    public void stopritmnbluze1(View view){
        stopPlayritmnbluze1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerritmnbluze1.isPlaying())||(mPlayerritmnbluze2.isPlaying())||(mPlayerritmnbluze3.isPlaying())) {
            stopPlayritmnbluze1();
            stopPlayritmnbluze2();
            stopPlayritmnbluze3();
        }
    }
    private void stopPlayritmnbluze2(){
        mPlayerritmnbluze2.stop();
        pauseButtonritmnbluze2.setEnabled(false);
        stopButtonritmnbluze2.setEnabled(false);
        try {
            mPlayerritmnbluze2.prepare();
            mPlayerritmnbluze2.seekTo(0);
            startButtonritmnbluze2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayritmnbluze3(){
        mPlayerritmnbluze3.stop();
        pauseButtonritmnbluze3.setEnabled(false);
        stopButtonritmnbluze3.setEnabled(false);
        try {
            mPlayerritmnbluze3.prepare();
            mPlayerritmnbluze3.seekTo(0);
            startButtonritmnbluze3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playritmnbluze2(View view){

        mPlayerritmnbluze2.start();
        startButtonritmnbluze2.setEnabled(false);
        pauseButtonritmnbluze2.setEnabled(true);
        stopButtonritmnbluze2.setEnabled(true);
    }
    public void playritmnbluze3(View view){

        mPlayerritmnbluze3.start();
        startButtonritmnbluze3.setEnabled(false);
        pauseButtonritmnbluze3.setEnabled(true);
        stopButtonritmnbluze3.setEnabled(true);
    }
    public void pauseritmnbluze2(View view){

        mPlayerritmnbluze2.pause();
        startButtonritmnbluze2.setEnabled(true);
        pauseButtonritmnbluze2.setEnabled(false);
        stopButtonritmnbluze2.setEnabled(true);
    }
    public void pauseritmnbluze3(View view){

        mPlayerritmnbluze3.pause();
        startButtonritmnbluze3.setEnabled(true);
        pauseButtonritmnbluze3.setEnabled(false);
        stopButtonritmnbluze3.setEnabled(true);
    }
    public void stopritmnbluze2(View view){
        stopPlayritmnbluze2();
    }
    public void stopritmnbluze3(View view){
        stopPlayritmnbluze3();
    }
}