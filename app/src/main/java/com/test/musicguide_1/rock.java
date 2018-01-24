package com.test.musicguide_1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class rock extends AppCompatActivity {
    MediaPlayer mPlayer,mPlayer1;
    Button startButton, pauseButton, stopButton, startButton1, pauseButton1, stopButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_rock);
        mPlayer= MediaPlayer.create(this, R.raw.legendsneverdie);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlay();
            }
        });

        mPlayer1=MediaPlayer.create(this, R.raw.legendsneverdie);
        mPlayer1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlay1();
            }
        });



        startButton = (Button) findViewById(R.id.start);
        pauseButton = (Button) findViewById(R.id.pause);
        stopButton = (Button) findViewById(R.id.stop);
        startButton1 = (Button) findViewById(R.id.start1);
        pauseButton1 = (Button) findViewById(R.id.pause1);
        stopButton1 = (Button) findViewById(R.id.stop1);

        pauseButton.setEnabled(false);
        stopButton.setEnabled(false);
        pauseButton1.setEnabled(false);
        stopButton1.setEnabled(false);
    }
    private void stopPlay(){
        mPlayer.stop();
        pauseButton.setEnabled(false);
        stopButton.setEnabled(false);
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
            startButton.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void play(View view){

        mPlayer.start();
        startButton.setEnabled(false);
        pauseButton.setEnabled(true);
        stopButton.setEnabled(true);
    }
    public void pause(View view){

        mPlayer.pause();
        startButton.setEnabled(true);
        pauseButton.setEnabled(false);
        stopButton.setEnabled(true);
    }
    public void stop(View view){
        stopPlay();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayer.isPlaying())||(mPlayer1.isPlaying())) {
            stopPlay();
            stopPlay1();
        }
    }
    private void stopPlay1(){
        mPlayer1.stop();
        pauseButton1.setEnabled(false);
        stopButton1.setEnabled(false);
        try {
            mPlayer1.prepare();
            mPlayer1.seekTo(0);
            startButton1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void play1(View view){

        mPlayer1.start();
        startButton1.setEnabled(false);
        pauseButton1.setEnabled(true);
        stopButton1.setEnabled(true);
    }

    public void pause1(View view){

        mPlayer1.pause();
        startButton1.setEnabled(true);
        pauseButton1.setEnabled(false);
        stopButton1.setEnabled(true);
    }
    public void stop1(View view){
        stopPlay1();
    }

}


