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

public class rap extends AppCompatActivity {
    MediaPlayer mPlayerrap1, mPlayerrap2, mPlayerrap3;
    Button startButtonrap1, pauseButtonrap1, stopButtonrap1, startButtonrap2, pauseButtonrap2, stopButtonrap2, startButtonrap3, pauseButtonrap3, stopButtonrap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_rap);

        final TextView rap1 = (TextView) findViewById(R.id.rap1);
        rap1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView rap2= (TextView) findViewById(R.id.rap2);
        rap2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView rap3 = (TextView) findViewById(R.id.rap3);
        rap3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerrap1= MediaPlayer.create(this, R.raw.rap1);
        mPlayerrap1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrap1();
            }
        });
        mPlayerrap2= MediaPlayer.create(this, R.raw.rap2);
        mPlayerrap2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrap2();
            }
        });
        mPlayerrap3= MediaPlayer.create(this, R.raw.rap3);
        mPlayerrap3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayrap3();
            }
        });


        startButtonrap1 = (Button) findViewById(R.id.startbuttonrap1);
        pauseButtonrap1 = (Button) findViewById(R.id.pausebuttonrap1);
        stopButtonrap1 = (Button) findViewById(R.id.stopbuttonrap1);
        startButtonrap2 = (Button) findViewById(R.id.startbuttonrap2);
        pauseButtonrap2 = (Button) findViewById(R.id.pausebuttonrap2);
        stopButtonrap2 = (Button) findViewById(R.id.stopbuttonrap2);
        startButtonrap3 = (Button) findViewById(R.id.startbuttonrap3);
        pauseButtonrap3 = (Button) findViewById(R.id.pausebuttonrap3);
        stopButtonrap3 = (Button) findViewById(R.id.stopbuttonrap3);

        pauseButtonrap1.setEnabled(false);
        stopButtonrap1.setEnabled(false);
        pauseButtonrap2.setEnabled(false);
        stopButtonrap2.setEnabled(false);
        pauseButtonrap3.setEnabled(false);
        stopButtonrap3.setEnabled(false);

    }
    private void stopPlayrap1(){
        mPlayerrap1.stop();
        pauseButtonrap1.setEnabled(false);
        stopButtonrap1.setEnabled(false);
        try {
            mPlayerrap1.prepare();
            mPlayerrap1.seekTo(0);
            startButtonrap1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playrap1(View view){

        mPlayerrap1.start();
        startButtonrap1.setEnabled(false);
        pauseButtonrap1.setEnabled(true);
        stopButtonrap1.setEnabled(true);
    }
    public void pauserap1(View view){

        mPlayerrap1.pause();
        startButtonrap1.setEnabled(true);
        pauseButtonrap1.setEnabled(false);
        stopButtonrap1.setEnabled(true);
    }
    public void stoprap1(View view){
        stopPlayrap1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerrap1.isPlaying())||(mPlayerrap2.isPlaying())||(mPlayerrap3.isPlaying())) {
            stopPlayrap1();
            stopPlayrap2();
            stopPlayrap3();
        }
    }
    private void stopPlayrap2(){
        mPlayerrap2.stop();
        pauseButtonrap2.setEnabled(false);
        stopButtonrap2.setEnabled(false);
        try {
            mPlayerrap2.prepare();
            mPlayerrap2.seekTo(0);
            startButtonrap2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayrap3(){
        mPlayerrap3.stop();
        pauseButtonrap3.setEnabled(false);
        stopButtonrap3.setEnabled(false);
        try {
            mPlayerrap3.prepare();
            mPlayerrap3.seekTo(0);
            startButtonrap3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playrap2(View view){

        mPlayerrap2.start();
        startButtonrap2.setEnabled(false);
        pauseButtonrap2.setEnabled(true);
        stopButtonrap2.setEnabled(true);
    }
    public void playrap3(View view){

        mPlayerrap3.start();
        startButtonrap3.setEnabled(false);
        pauseButtonrap3.setEnabled(true);
        stopButtonrap3.setEnabled(true);
    }
    public void pauserap2(View view){

        mPlayerrap2.pause();
        startButtonrap2.setEnabled(true);
        pauseButtonrap2.setEnabled(false);
        stopButtonrap2.setEnabled(true);
    }
    public void pauserap3(View view){

        mPlayerrap3.pause();
        startButtonrap3.setEnabled(true);
        pauseButtonrap3.setEnabled(false);
        stopButtonrap3.setEnabled(true);
    }
    public void stoprap2(View view){
        stopPlayrap2();
    }
    public void stoprap3(View view){
        stopPlayrap3();
    }
}