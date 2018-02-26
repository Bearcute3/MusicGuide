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

public class bluze extends AppCompatActivity {
    MediaPlayer mPlayerbluze1, mPlayerbluze2, mPlayerbluze3;
    Button startButtonbluze1, pauseButtonbluze1, stopButtonbluze1, startButtonbluze2, pauseButtonbluze2, stopButtonbluze2, startButtonbluze3, pauseButtonbluze3, stopButtonbluze3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_bluze);

        final TextView bluze1 = (TextView) findViewById(R.id.bluze1);
        bluze1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView bluze2= (TextView) findViewById(R.id.bluze2);
        bluze2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView bluze3 = (TextView) findViewById(R.id.bluze3);
        bluze3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        mPlayerbluze1= MediaPlayer.create(this, R.raw.bluze1);
        mPlayerbluze1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaybluze1();
            }
        });
        mPlayerbluze2= MediaPlayer.create(this, R.raw.bluze2);
        mPlayerbluze2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaybluze2();
            }
        });
        mPlayerbluze3= MediaPlayer.create(this, R.raw.bluze3);
        mPlayerbluze3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaybluze3();
            }
        });


        startButtonbluze1 = (Button) findViewById(R.id.startbuttonbluze1);
        pauseButtonbluze1 = (Button) findViewById(R.id.pausebuttonbluze1);
        stopButtonbluze1 = (Button) findViewById(R.id.stopbuttonbluze1);
        startButtonbluze2 = (Button) findViewById(R.id.startbuttonbluze2);
        pauseButtonbluze2 = (Button) findViewById(R.id.pausebuttonbluze2);
        stopButtonbluze2 = (Button) findViewById(R.id.stopbuttonbluze2);
        startButtonbluze3 = (Button) findViewById(R.id.startbuttonbluze3);
        pauseButtonbluze3 = (Button) findViewById(R.id.pausebuttonbluze3);
        stopButtonbluze3 = (Button) findViewById(R.id.stopbuttonbluze3);

        pauseButtonbluze1.setEnabled(false);
        stopButtonbluze1.setEnabled(false);
        pauseButtonbluze2.setEnabled(false);
        stopButtonbluze2.setEnabled(false);
        pauseButtonbluze3.setEnabled(false);
        stopButtonbluze3.setEnabled(false);

    }
    private void stopPlaybluze1(){
        mPlayerbluze1.stop();
        pauseButtonbluze1.setEnabled(false);
        stopButtonbluze1.setEnabled(false);
        try {
            mPlayerbluze1.prepare();
            mPlayerbluze1.seekTo(0);
            startButtonbluze1.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playbluze1(View view){

        mPlayerbluze1.start();
        startButtonbluze1.setEnabled(false);
        pauseButtonbluze1.setEnabled(true);
        stopButtonbluze1.setEnabled(true);
    }
    public void pausebluze1(View view){

        mPlayerbluze1.pause();
        startButtonbluze1.setEnabled(true);
        pauseButtonbluze1.setEnabled(false);
        stopButtonbluze1.setEnabled(true);
    }
    public void stopbluze1(View view){
        stopPlaybluze1();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerbluze1.isPlaying())||(mPlayerbluze2.isPlaying())||(mPlayerbluze3.isPlaying())) {
            stopPlaybluze1();
            stopPlaybluze2();
            stopPlaybluze3();
        }
    }
    private void stopPlaybluze2(){
        mPlayerbluze2.stop();
        pauseButtonbluze2.setEnabled(false);
        stopButtonbluze2.setEnabled(false);
        try {
            mPlayerbluze2.prepare();
            mPlayerbluze2.seekTo(0);
            startButtonbluze2.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlaybluze3(){
        mPlayerbluze3.stop();
        pauseButtonbluze3.setEnabled(false);
        stopButtonbluze3.setEnabled(false);
        try {
            mPlayerbluze3.prepare();
            mPlayerbluze3.seekTo(0);
            startButtonbluze3.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playbluze2(View view){

        mPlayerbluze2.start();
        startButtonbluze2.setEnabled(false);
        pauseButtonbluze2.setEnabled(true);
        stopButtonbluze2.setEnabled(true);
    }
    public void playbluze3(View view){

        mPlayerbluze3.start();
        startButtonbluze3.setEnabled(false);
        pauseButtonbluze3.setEnabled(true);
        stopButtonbluze3.setEnabled(true);
    }
    public void pausebluze2(View view){

        mPlayerbluze2.pause();
        startButtonbluze2.setEnabled(true);
        pauseButtonbluze2.setEnabled(false);
        stopButtonbluze2.setEnabled(true);
    }
    public void pausebluze3(View view){

        mPlayerbluze3.pause();
        startButtonbluze3.setEnabled(true);
        pauseButtonbluze3.setEnabled(false);
        stopButtonbluze3.setEnabled(true);
    }
    public void stopbluze2(View view){
        stopPlaybluze2();
    }
    public void stopbluze3(View view){
        stopPlaybluze3();
    }
}