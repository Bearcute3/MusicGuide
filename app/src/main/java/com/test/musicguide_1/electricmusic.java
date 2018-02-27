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

public class electricmusic extends AppCompatActivity {
    MediaPlayer mPlayerelectricmusic1, mPlayerelectricmusic2, mPlayerelectricmusic3;
    Button startButtonelectricmusic1, pauseButtonelectricmusic1, stopButtonelectricmusic1, startButtonelectricmusic2, pauseButtonelectricmusic2, stopButtonelectricmusic2, startButtonelectricmusic3, pauseButtonelectricmusic3, stopButtonelectricmusic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_electricmusic);

        final TextView electricmusic1 = (TextView) findViewById(R.id.electricmusic1);
        electricmusic1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView electricmusic2= (TextView) findViewById(R.id.electricmusic2);
        electricmusic2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView electricmusic3 = (TextView) findViewById(R.id.electricmusic3);
        electricmusic3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerelectricmusic1= MediaPlayer.create(this, R.raw.electricmusic1);
        mPlayerelectricmusic1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayelectricmusic1();
            }
        });
        mPlayerelectricmusic2= MediaPlayer.create(this, R.raw.electricmusic2);
        mPlayerelectricmusic2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayelectricmusic2();
            }
        });
        mPlayerelectricmusic3= MediaPlayer.create(this, R.raw.electricmusic3);
        mPlayerelectricmusic3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayelectricmusic3();
            }
        });


        startButtonelectricmusic1 = (Button) findViewById(R.id.startbuttonelectricmusic1);
        pauseButtonelectricmusic1 = (Button) findViewById(R.id.pausebuttonelectricmusic1);
        stopButtonelectricmusic1 = (Button) findViewById(R.id.stopbuttonelectricmusic1);
        startButtonelectricmusic2 = (Button) findViewById(R.id.startbuttonelectricmusic2);
        pauseButtonelectricmusic2 = (Button) findViewById(R.id.pausebuttonelectricmusic2);
        stopButtonelectricmusic2 = (Button) findViewById(R.id.stopbuttonelectricmusic2);
        startButtonelectricmusic3 = (Button) findViewById(R.id.startbuttonelectricmusic3);
        pauseButtonelectricmusic3 = (Button) findViewById(R.id.pausebuttonelectricmusic3);
        stopButtonelectricmusic3 = (Button) findViewById(R.id.stopbuttonelectricmusic3);

        pauseButtonelectricmusic1.setEnabled(false);
        stopButtonelectricmusic1.setEnabled(false);
        pauseButtonelectricmusic2.setEnabled(false);
        stopButtonelectricmusic2.setEnabled(false);
        pauseButtonelectricmusic3.setEnabled(false);
        stopButtonelectricmusic3.setEnabled(false);

    }
    private void stopPlayelectricmusic1(){
        mPlayerelectricmusic1.stop();
        pauseButtonelectricmusic1.setEnabled(false);
        stopButtonelectricmusic1.setEnabled(false);
        try {
            mPlayerelectricmusic1.prepare();
            mPlayerelectricmusic1.seekTo(0);
            startButtonelectricmusic1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playelectricmusic1(View view){

        mPlayerelectricmusic1.start();
        startButtonelectricmusic1.setEnabled(false);
        pauseButtonelectricmusic1.setEnabled(true);
        stopButtonelectricmusic1.setEnabled(true);
    }
    public void pauseelectricmusic1(View view){

        mPlayerelectricmusic1.pause();
        startButtonelectricmusic1.setEnabled(true);
        pauseButtonelectricmusic1.setEnabled(false);
        stopButtonelectricmusic1.setEnabled(true);
    }
    public void stopelectricmusic1(View view){
        stopPlayelectricmusic1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerelectricmusic1.isPlaying())||(mPlayerelectricmusic2.isPlaying())||(mPlayerelectricmusic3.isPlaying())) {
            stopPlayelectricmusic1();
            stopPlayelectricmusic2();
            stopPlayelectricmusic3();
        }
    }
    private void stopPlayelectricmusic2(){
        mPlayerelectricmusic2.stop();
        pauseButtonelectricmusic2.setEnabled(false);
        stopButtonelectricmusic2.setEnabled(false);
        try {
            mPlayerelectricmusic2.prepare();
            mPlayerelectricmusic2.seekTo(0);
            startButtonelectricmusic2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayelectricmusic3(){
        mPlayerelectricmusic3.stop();
        pauseButtonelectricmusic3.setEnabled(false);
        stopButtonelectricmusic3.setEnabled(false);
        try {
            mPlayerelectricmusic3.prepare();
            mPlayerelectricmusic3.seekTo(0);
            startButtonelectricmusic3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playelectricmusic2(View view){

        mPlayerelectricmusic2.start();
        startButtonelectricmusic2.setEnabled(false);
        pauseButtonelectricmusic2.setEnabled(true);
        stopButtonelectricmusic2.setEnabled(true);
    }
    public void playelectricmusic3(View view){

        mPlayerelectricmusic3.start();
        startButtonelectricmusic3.setEnabled(false);
        pauseButtonelectricmusic3.setEnabled(true);
        stopButtonelectricmusic3.setEnabled(true);
    }
    public void pauseelectricmusic2(View view){

        mPlayerelectricmusic2.pause();
        startButtonelectricmusic2.setEnabled(true);
        pauseButtonelectricmusic2.setEnabled(false);
        stopButtonelectricmusic2.setEnabled(true);
    }
    public void pauseelectricmusic3(View view){

        mPlayerelectricmusic3.pause();
        startButtonelectricmusic3.setEnabled(true);
        pauseButtonelectricmusic3.setEnabled(false);
        stopButtonelectricmusic3.setEnabled(true);
    }
    public void stopelectricmusic2(View view){
        stopPlayelectricmusic2();
    }
    public void stopelectricmusic3(View view){
        stopPlayelectricmusic3();
    }
}