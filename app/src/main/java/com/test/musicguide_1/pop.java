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

public class pop extends AppCompatActivity {
    MediaPlayer mPlayerpop1, mPlayerpop2, mPlayerpop3;
    Button startButtonpop1, pauseButtonpop1, stopButtonpop1, startButtonpop2, pauseButtonpop2, stopButtonpop2, startButtonpop3, pauseButtonpop3, stopButtonpop3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_pop);

        final TextView pop1 = (TextView) findViewById(R.id.pop1);
        pop1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView pop2= (TextView) findViewById(R.id.pop2);
        pop2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView pop3 = (TextView) findViewById(R.id.pop3);
        pop3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerpop1= MediaPlayer.create(this, R.raw.pop1);
        mPlayerpop1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaypop1();
            }
        });
        mPlayerpop2= MediaPlayer.create(this, R.raw.pop2);
        mPlayerpop2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaypop2();
            }
        });
        mPlayerpop3= MediaPlayer.create(this, R.raw.pop3);
        mPlayerpop3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaypop3();
            }
        });


        startButtonpop1 = (Button) findViewById(R.id.startbuttonpop1);
        pauseButtonpop1 = (Button) findViewById(R.id.pausebuttonpop1);
        stopButtonpop1 = (Button) findViewById(R.id.stopbuttonpop1);
        startButtonpop2 = (Button) findViewById(R.id.startbuttonpop2);
        pauseButtonpop2 = (Button) findViewById(R.id.pausebuttonpop2);
        stopButtonpop2 = (Button) findViewById(R.id.stopbuttonpop2);
        startButtonpop3 = (Button) findViewById(R.id.startbuttonpop3);
        pauseButtonpop3 = (Button) findViewById(R.id.pausebuttonpop3);
        stopButtonpop3 = (Button) findViewById(R.id.stopbuttonpop3);

        pauseButtonpop1.setEnabled(false);
        stopButtonpop1.setEnabled(false);
        pauseButtonpop2.setEnabled(false);
        stopButtonpop2.setEnabled(false);
        pauseButtonpop3.setEnabled(false);
        stopButtonpop3.setEnabled(false);

    }
    private void stopPlaypop1(){
        mPlayerpop1.stop();
        pauseButtonpop1.setEnabled(false);
        stopButtonpop1.setEnabled(false);
        try {
            mPlayerpop1.prepare();
            mPlayerpop1.seekTo(0);
            startButtonpop1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playpop1(View view){

        mPlayerpop1.start();
        startButtonpop1.setEnabled(false);
        pauseButtonpop1.setEnabled(true);
        stopButtonpop1.setEnabled(true);
    }
    public void pausepop1(View view){

        mPlayerpop1.pause();
        startButtonpop1.setEnabled(true);
        pauseButtonpop1.setEnabled(false);
        stopButtonpop1.setEnabled(true);
    }
    public void stoppop1(View view){
        stopPlaypop1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerpop1.isPlaying())||(mPlayerpop2.isPlaying())||(mPlayerpop3.isPlaying())) {
            stopPlaypop1();
            stopPlaypop2();
            stopPlaypop3();
        }
    }
    private void stopPlaypop2(){
        mPlayerpop2.stop();
        pauseButtonpop2.setEnabled(false);
        stopButtonpop2.setEnabled(false);
        try {
            mPlayerpop2.prepare();
            mPlayerpop2.seekTo(0);
            startButtonpop2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlaypop3(){
        mPlayerpop3.stop();
        pauseButtonpop3.setEnabled(false);
        stopButtonpop3.setEnabled(false);
        try {
            mPlayerpop3.prepare();
            mPlayerpop3.seekTo(0);
            startButtonpop3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playpop2(View view){

        mPlayerpop2.start();
        startButtonpop2.setEnabled(false);
        pauseButtonpop2.setEnabled(true);
        stopButtonpop2.setEnabled(true);
    }
    public void playpop3(View view){

        mPlayerpop3.start();
        startButtonpop3.setEnabled(false);
        pauseButtonpop3.setEnabled(true);
        stopButtonpop3.setEnabled(true);
    }
    public void pausepop2(View view){

        mPlayerpop2.pause();
        startButtonpop2.setEnabled(true);
        pauseButtonpop2.setEnabled(false);
        stopButtonpop2.setEnabled(true);
    }
    public void pausepop3(View view){

        mPlayerpop3.pause();
        startButtonpop3.setEnabled(true);
        pauseButtonpop3.setEnabled(false);
        stopButtonpop3.setEnabled(true);
    }
    public void stoppop2(View view){
        stopPlaypop2();
    }
    public void stoppop3(View view){
        stopPlaypop3();
    }
}