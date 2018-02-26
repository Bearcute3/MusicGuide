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

public class disco extends AppCompatActivity {
    MediaPlayer mPlayerdisco1, mPlayerdisco2, mPlayerdisco3;
    Button startButtondisco1, pauseButtondisco1, stopButtondisco1, startButtondisco2, pauseButtondisco2, stopButtondisco2, startButtondisco3, pauseButtondisco3, stopButtondisco3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_disco);

        final TextView disco1 = (TextView) findViewById(R.id.disco1);
        disco1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView disco2= (TextView) findViewById(R.id.disco2);
        disco2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView disco3 = (TextView) findViewById(R.id.disco3);
        disco3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerdisco1= MediaPlayer.create(this, R.raw.disco1);
        mPlayerdisco1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaydisco1();
            }
        });
        mPlayerdisco2= MediaPlayer.create(this, R.raw.disco2);
        mPlayerdisco2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaydisco2();
            }
        });
        mPlayerdisco3= MediaPlayer.create(this, R.raw.disco3);
        mPlayerdisco3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaydisco3();
            }
        });


        startButtondisco1 = (Button) findViewById(R.id.startbuttondisco1);
        pauseButtondisco1 = (Button) findViewById(R.id.pausebuttondisco1);
        stopButtondisco1 = (Button) findViewById(R.id.stopbuttondisco1);
        startButtondisco2 = (Button) findViewById(R.id.startbuttondisco2);
        pauseButtondisco2 = (Button) findViewById(R.id.pausebuttondisco2);
        stopButtondisco2 = (Button) findViewById(R.id.stopbuttondisco2);
        startButtondisco3 = (Button) findViewById(R.id.startbuttondisco3);
        pauseButtondisco3 = (Button) findViewById(R.id.pausebuttondisco3);
        stopButtondisco3 = (Button) findViewById(R.id.stopbuttondisco3);

        pauseButtondisco1.setEnabled(false);
        stopButtondisco1.setEnabled(false);
        pauseButtondisco2.setEnabled(false);
        stopButtondisco2.setEnabled(false);
        pauseButtondisco3.setEnabled(false);
        stopButtondisco3.setEnabled(false);

    }
    private void stopPlaydisco1(){
        mPlayerdisco1.stop();
        pauseButtondisco1.setEnabled(false);
        stopButtondisco1.setEnabled(false);
        try {
            mPlayerdisco1.prepare();
            mPlayerdisco1.seekTo(0);
            startButtondisco1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playdisco1(View view){

        mPlayerdisco1.start();
        startButtondisco1.setEnabled(false);
        pauseButtondisco1.setEnabled(true);
        stopButtondisco1.setEnabled(true);
    }
    public void pausedisco1(View view){

        mPlayerdisco1.pause();
        startButtondisco1.setEnabled(true);
        pauseButtondisco1.setEnabled(false);
        stopButtondisco1.setEnabled(true);
    }
    public void stopdisco1(View view){
        stopPlaydisco1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerdisco1.isPlaying())||(mPlayerdisco2.isPlaying())||(mPlayerdisco3.isPlaying())) {
            stopPlaydisco1();
            stopPlaydisco2();
            stopPlaydisco3();
        }
    }
    private void stopPlaydisco2(){
        mPlayerdisco2.stop();
        pauseButtondisco2.setEnabled(false);
        stopButtondisco2.setEnabled(false);
        try {
            mPlayerdisco2.prepare();
            mPlayerdisco2.seekTo(0);
            startButtondisco2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlaydisco3(){
        mPlayerdisco3.stop();
        pauseButtondisco3.setEnabled(false);
        stopButtondisco3.setEnabled(false);
        try {
            mPlayerdisco3.prepare();
            mPlayerdisco3.seekTo(0);
            startButtondisco3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playdisco2(View view){

        mPlayerdisco2.start();
        startButtondisco2.setEnabled(false);
        pauseButtondisco2.setEnabled(true);
        stopButtondisco2.setEnabled(true);
    }
    public void playdisco3(View view){

        mPlayerdisco3.start();
        startButtondisco3.setEnabled(false);
        pauseButtondisco3.setEnabled(true);
        stopButtondisco3.setEnabled(true);
    }
    public void pausedisco2(View view){

        mPlayerdisco2.pause();
        startButtondisco2.setEnabled(true);
        pauseButtondisco2.setEnabled(false);
        stopButtondisco2.setEnabled(true);
    }
    public void pausedisco3(View view){

        mPlayerdisco3.pause();
        startButtondisco3.setEnabled(true);
        pauseButtondisco3.setEnabled(false);
        stopButtondisco3.setEnabled(true);
    }
    public void stopdisco2(View view){
        stopPlaydisco2();
    }
    public void stopdisco3(View view){
        stopPlaydisco3();
    }
}