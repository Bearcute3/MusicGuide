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

public class jazz extends AppCompatActivity {
    MediaPlayer mPlayerarmstrong, mPlayerparker, mPlayergoodman, mPlayermiles;
    Button startButtonarmstrong, pauseButtonarmstrong, stopButtonarmstrong, startButtonparker, pauseButtonparker, stopButtonparker, startButtongoodman, pauseButtongoodman, stopButtongoodman, startButtonmiles, pauseButtonmiles, stopButtonmiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_jazz);

        final TextView jazz6 = (TextView) findViewById(R.id.jazz6);
        jazz6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView jazz7= (TextView) findViewById(R.id.jazz7);
        jazz7.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView jazz8 = (TextView) findViewById(R.id.jazz8);
        jazz8.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
        final TextView jazz9 = (TextView) findViewById(R.id.jazz9);
        jazz9.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));


        mPlayerarmstrong= MediaPlayer.create(this, R.raw.armstrong);
        mPlayerarmstrong.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayarmstrong();
            }
        });
        mPlayerparker= MediaPlayer.create(this, R.raw.charlieparker);
        mPlayerparker.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayparker();
            }
        });
        mPlayergoodman= MediaPlayer.create(this, R.raw.goodman);
        mPlayergoodman.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaygoodman();
            }
        });
        mPlayermiles= MediaPlayer.create(this, R.raw.miles);
        mPlayermiles.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlaymiles();
            }
        });


        startButtonarmstrong = (Button) findViewById(R.id.startbuttonarmstrong);
        pauseButtonarmstrong = (Button) findViewById(R.id.pausebuttonarmstrong);
        stopButtonarmstrong = (Button) findViewById(R.id.stopbuttonarmstrong);
        startButtonparker = (Button) findViewById(R.id.startbuttonparker);
        pauseButtonparker = (Button) findViewById(R.id.pausebuttonparker);
        stopButtonparker = (Button) findViewById(R.id.stopbuttonparker);
        startButtongoodman= (Button) findViewById(R.id.startbuttongoodman);
        pauseButtongoodman = (Button) findViewById(R.id.pausebuttongoodman);
        stopButtongoodman = (Button) findViewById(R.id.stopbuttongoodman);
        startButtonmiles= (Button) findViewById(R.id.startbuttonmiles);
        pauseButtonmiles = (Button) findViewById(R.id.pausebuttonmiles);
        stopButtonmiles = (Button) findViewById(R.id.stopbuttonmiles);

        pauseButtonarmstrong.setEnabled(false);
        stopButtonarmstrong.setEnabled(false);
        pauseButtonparker.setEnabled(false);
        stopButtongoodman.setEnabled(false);
        pauseButtongoodman.setEnabled(false);
        stopButtonparker.setEnabled(false);
        pauseButtonmiles.setEnabled(false);
        stopButtonmiles.setEnabled(false);

    }
    private void stopPlayarmstrong(){
        mPlayerarmstrong.stop();
        pauseButtonarmstrong.setEnabled(false);
        stopButtonarmstrong.setEnabled(false);
        try {
            mPlayerarmstrong.prepare();
            mPlayerarmstrong.seekTo(0);
            startButtonarmstrong.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void playarmstrong(View view){

        mPlayerarmstrong.start();
        startButtonarmstrong.setEnabled(false);
        pauseButtonarmstrong.setEnabled(true);
        stopButtonarmstrong.setEnabled(true);
    }
    public void pausearmstrong(View view){

        mPlayerarmstrong.pause();
        startButtonarmstrong.setEnabled(true);
        pauseButtonarmstrong.setEnabled(false);
        stopButtonarmstrong.setEnabled(true);
    }
    public void stoparmstrong(View view){
        stopPlayarmstrong();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if ((mPlayerarmstrong.isPlaying())||(mPlayerparker.isPlaying())||(mPlayergoodman.isPlaying())||(mPlayermiles.isPlaying())) {
            stopPlayarmstrong();
            stopPlaymiles();
            stopPlaygoodman();
            stopPlaygoodman();
        }
    }
    private void stopPlayparker(){
        mPlayerparker.stop();
        pauseButtonparker.setEnabled(false);
        stopButtonparker.setEnabled(false);
        try {
            mPlayerparker.prepare();
            mPlayerparker.seekTo(0);
            startButtonparker.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlaygoodman(){
        mPlayergoodman.stop();
        pauseButtongoodman.setEnabled(false);
        stopButtongoodman.setEnabled(false);
        try {
            mPlayergoodman.prepare();
            mPlayergoodman.seekTo(0);
            startButtongoodman.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void playparker(View view){

        mPlayerparker.start();
        startButtonparker.setEnabled(false);
        pauseButtonparker.setEnabled(true);
        stopButtonparker.setEnabled(true);
    }
    public void playgoodman(View view){

        mPlayergoodman.start();
        startButtongoodman.setEnabled(false);
        pauseButtongoodman.setEnabled(true);
        stopButtongoodman.setEnabled(true);
    }
    public void pauseparker(View view){

        mPlayerparker.pause();
        startButtonparker.setEnabled(true);
        pauseButtonparker.setEnabled(false);
        stopButtonparker.setEnabled(true);
    }
    public void pausegoodman(View view){

        mPlayergoodman.pause();
        startButtongoodman.setEnabled(true);
        pauseButtongoodman.setEnabled(false);
        stopButtongoodman.setEnabled(true);
    }
    public void stopparker(View view){
        stopPlayparker();
    }
    public void stopgoodman(View view){
        stopPlaygoodman();
    }
    public void stopmiles(View view){
        stopPlaymiles();
    }

    public void pausemiles(View view){

        mPlayermiles.pause();
        startButtonmiles.setEnabled(true);
        pauseButtonmiles.setEnabled(false);
        stopButtonmiles.setEnabled(true);
    }
    public void playmiles(View view){

        mPlayermiles.start();
        startButtonmiles.setEnabled(false);
        pauseButtonmiles.setEnabled(true);
        stopButtonmiles.setEnabled(true);
    }
    private void stopPlaymiles(){
        mPlayermiles.stop();
        pauseButtonmiles.setEnabled(false);
        stopButtonmiles.setEnabled(false);
        try {
            mPlayermiles.prepare();
            mPlayermiles.seekTo(0);
            startButtonmiles.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
