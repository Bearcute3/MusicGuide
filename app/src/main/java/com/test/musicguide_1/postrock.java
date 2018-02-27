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

public class postrock extends AppCompatActivity {
    MediaPlayer mPlayerpostrock1, mPlayerpostrock2, mPlayerpostrock3;
    Button startButtonpostrock1, pauseButtonpostrock1, stopButtonpostrock1, startButtonpostrock2, pauseButtonpostrock2, stopButtonpostrock2, startButtonpostrock3, pauseButtonpostrock3, stopButtonpostrock3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_postrock);

        final TextView postrock1 = (TextView) findViewById(R.id.postrock1);
        postrock1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView postrock2= (TextView) findViewById(R.id.postrock2);
        postrock2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView postrock3 = (TextView) findViewById(R.id.postrock3);
        postrock3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView postrock4 = (TextView) findViewById(R.id.postrock4);
        postrock4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerpostrock1= MediaPlayer.create(this, R.raw.postrock1);
        mPlayerpostrock1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaypostrock1();
            }
        });
        mPlayerpostrock2= MediaPlayer.create(this, R.raw.postrock2);
        mPlayerpostrock2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaypostrock2();
            }
        });
        mPlayerpostrock3= MediaPlayer.create(this, R.raw.postrock3);
        mPlayerpostrock3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaypostrock3();
            }
        });


        startButtonpostrock1 = (Button) findViewById(R.id.startbuttonpostrock1);
        pauseButtonpostrock1 = (Button) findViewById(R.id.pausebuttonpostrock1);
        stopButtonpostrock1 = (Button) findViewById(R.id.stopbuttonpostrock1);
        startButtonpostrock2 = (Button) findViewById(R.id.startbuttonpostrock2);
        pauseButtonpostrock2 = (Button) findViewById(R.id.pausebuttonpostrock2);
        stopButtonpostrock2 = (Button) findViewById(R.id.stopbuttonpostrock2);
        startButtonpostrock3 = (Button) findViewById(R.id.startbuttonpostrock3);
        pauseButtonpostrock3 = (Button) findViewById(R.id.pausebuttonpostrock3);
        stopButtonpostrock3 = (Button) findViewById(R.id.stopbuttonpostrock3);

        pauseButtonpostrock1.setEnabled(false);
        stopButtonpostrock1.setEnabled(false);
        pauseButtonpostrock2.setEnabled(false);
        stopButtonpostrock2.setEnabled(false);
        pauseButtonpostrock3.setEnabled(false);
        stopButtonpostrock3.setEnabled(false);

    }
    private void stopPlaypostrock1(){
        mPlayerpostrock1.stop();
        pauseButtonpostrock1.setEnabled(false);
        stopButtonpostrock1.setEnabled(false);
        try {
            mPlayerpostrock1.prepare();
            mPlayerpostrock1.seekTo(0);
            startButtonpostrock1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playpostrock1(View view){

        mPlayerpostrock1.start();
        startButtonpostrock1.setEnabled(false);
        pauseButtonpostrock1.setEnabled(true);
        stopButtonpostrock1.setEnabled(true);
    }
    public void pausepostrock1(View view){

        mPlayerpostrock1.pause();
        startButtonpostrock1.setEnabled(true);
        pauseButtonpostrock1.setEnabled(false);
        stopButtonpostrock1.setEnabled(true);
    }
    public void stoppostrock1(View view){
        stopPlaypostrock1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerpostrock1.isPlaying())||(mPlayerpostrock2.isPlaying())||(mPlayerpostrock3.isPlaying())) {
            stopPlaypostrock1();
            stopPlaypostrock2();
            stopPlaypostrock3();
        }
    }
    private void stopPlaypostrock2(){
        mPlayerpostrock2.stop();
        pauseButtonpostrock2.setEnabled(false);
        stopButtonpostrock2.setEnabled(false);
        try {
            mPlayerpostrock2.prepare();
            mPlayerpostrock2.seekTo(0);
            startButtonpostrock2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlaypostrock3(){
        mPlayerpostrock3.stop();
        pauseButtonpostrock3.setEnabled(false);
        stopButtonpostrock3.setEnabled(false);
        try {
            mPlayerpostrock3.prepare();
            mPlayerpostrock3.seekTo(0);
            startButtonpostrock3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playpostrock2(View view){

        mPlayerpostrock2.start();
        startButtonpostrock2.setEnabled(false);
        pauseButtonpostrock2.setEnabled(true);
        stopButtonpostrock2.setEnabled(true);
    }
    public void playpostrock3(View view){

        mPlayerpostrock3.start();
        startButtonpostrock3.setEnabled(false);
        pauseButtonpostrock3.setEnabled(true);
        stopButtonpostrock3.setEnabled(true);
    }
    public void pausepostrock2(View view){

        mPlayerpostrock2.pause();
        startButtonpostrock2.setEnabled(true);
        pauseButtonpostrock2.setEnabled(false);
        stopButtonpostrock2.setEnabled(true);
    }
    public void pausepostrock3(View view){

        mPlayerpostrock3.pause();
        startButtonpostrock3.setEnabled(true);
        pauseButtonpostrock3.setEnabled(false);
        stopButtonpostrock3.setEnabled(true);
    }
    public void stoppostrock2(View view){
        stopPlaypostrock2();
    }
    public void stoppostrock3(View view){
        stopPlaypostrock3();
    }
}