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

public class underground extends AppCompatActivity {
    MediaPlayer mPlayerunderground1, mPlayerunderground2, mPlayerunderground3;
    Button startButtonunderground1, pauseButtonunderground1, stopButtonunderground1, startButtonunderground2, pauseButtonunderground2, stopButtonunderground2, startButtonunderground3, pauseButtonunderground3, stopButtonunderground3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_underground2);

        final TextView underground1 = (TextView) findViewById(R.id.underground1);
        underground1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView underground2= (TextView) findViewById(R.id.underground2);
        underground2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView underground3 = (TextView) findViewById(R.id.underground3);
        underground3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerunderground1= MediaPlayer.create(this, R.raw.underground1);
        mPlayerunderground1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayunderground1();
            }
        });
        mPlayerunderground2= MediaPlayer.create(this, R.raw.underground2);
        mPlayerunderground2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayunderground2();
            }
        });
        mPlayerunderground3= MediaPlayer.create(this, R.raw.underground3);
        mPlayerunderground3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayunderground3();
            }
        });


        startButtonunderground1 = (Button) findViewById(R.id.startbuttonunderground1);
        pauseButtonunderground1 = (Button) findViewById(R.id.pausebuttonunderground1);
        stopButtonunderground1 = (Button) findViewById(R.id.stopbuttonunderground1);
        startButtonunderground2 = (Button) findViewById(R.id.startbuttonunderground2);
        pauseButtonunderground2 = (Button) findViewById(R.id.pausebuttonunderground2);
        stopButtonunderground2 = (Button) findViewById(R.id.stopbuttonunderground2);
        startButtonunderground3 = (Button) findViewById(R.id.startbuttonunderground3);
        pauseButtonunderground3 = (Button) findViewById(R.id.pausebuttonunderground3);
        stopButtonunderground3 = (Button) findViewById(R.id.stopbuttonunderground3);

        pauseButtonunderground1.setEnabled(false);
        stopButtonunderground1.setEnabled(false);
        pauseButtonunderground2.setEnabled(false);
        stopButtonunderground2.setEnabled(false);
        pauseButtonunderground3.setEnabled(false);
        stopButtonunderground3.setEnabled(false);

    }
    private void stopPlayunderground1(){
        mPlayerunderground1.stop();
        pauseButtonunderground1.setEnabled(false);
        stopButtonunderground1.setEnabled(false);
        try {
            mPlayerunderground1.prepare();
            mPlayerunderground1.seekTo(0);
            startButtonunderground1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playunderground1(View view){

        mPlayerunderground1.start();
        startButtonunderground1.setEnabled(false);
        pauseButtonunderground1.setEnabled(true);
        stopButtonunderground1.setEnabled(true);
    }
    public void pauseunderground1(View view){

        mPlayerunderground1.pause();
        startButtonunderground1.setEnabled(true);
        pauseButtonunderground1.setEnabled(false);
        stopButtonunderground1.setEnabled(true);
    }
    public void stopunderground1(View view){
        stopPlayunderground1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerunderground1.isPlaying())||(mPlayerunderground2.isPlaying())||(mPlayerunderground3.isPlaying())) {
            stopPlayunderground1();
            stopPlayunderground2();
            stopPlayunderground3();
        }
    }
    private void stopPlayunderground2(){
        mPlayerunderground2.stop();
        pauseButtonunderground2.setEnabled(false);
        stopButtonunderground2.setEnabled(false);
        try {
            mPlayerunderground2.prepare();
            mPlayerunderground2.seekTo(0);
            startButtonunderground2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayunderground3(){
        mPlayerunderground3.stop();
        pauseButtonunderground3.setEnabled(false);
        stopButtonunderground3.setEnabled(false);
        try {
            mPlayerunderground3.prepare();
            mPlayerunderground3.seekTo(0);
            startButtonunderground3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playunderground2(View view){

        mPlayerunderground2.start();
        startButtonunderground2.setEnabled(false);
        pauseButtonunderground2.setEnabled(true);
        stopButtonunderground2.setEnabled(true);
    }
    public void playunderground3(View view){

        mPlayerunderground3.start();
        startButtonunderground3.setEnabled(false);
        pauseButtonunderground3.setEnabled(true);
        stopButtonunderground3.setEnabled(true);
    }
    public void pauseunderground2(View view){

        mPlayerunderground2.pause();
        startButtonunderground2.setEnabled(true);
        pauseButtonunderground2.setEnabled(false);
        stopButtonunderground2.setEnabled(true);
    }
    public void pauseunderground3(View view){

        mPlayerunderground3.pause();
        startButtonunderground3.setEnabled(true);
        pauseButtonunderground3.setEnabled(false);
        stopButtonunderground3.setEnabled(true);
    }
    public void stopunderground2(View view){
        stopPlayunderground2();
    }
    public void stopunderground3(View view){
        stopPlayunderground3();
    }
}