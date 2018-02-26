package com.test.musicguide_1;


import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Genres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_genres);

        final Button button_rock = (Button)findViewById(R.id.button_rock);
        button_rock.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_jazz = (Button)findViewById(R.id.button_jazz);
        button_jazz.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_pop = (Button)findViewById(R.id.button_pop);
        button_pop.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_metal = (Button)findViewById(R.id.button_metal);
        button_metal.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_classic = (Button)findViewById(R.id.button_classic);
        button_classic.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_bluze = (Button)findViewById(R.id.button_bluze);
        button_bluze.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_disco = (Button)findViewById(R.id.button_disco);
        button_disco.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_electricmusic = (Button)findViewById(R.id.button_electricmusic);
        button_electricmusic.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_postrock = (Button)findViewById(R.id.button_postrock);
        button_postrock.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_rap = (Button)findViewById(R.id.button_rap);
        button_rap.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_ritmnbluze = (Button)findViewById(R.id.button_ritmnbluze);
        button_ritmnbluze.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_rocknroll = (Button)findViewById(R.id.button_rocknroll);
        button_rocknroll.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));

        final Button button_underground = (Button)findViewById(R.id.button_underground);
        button_underground.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ofont.ru_Molot.ttf"));
    }
    public void onClickRock(View v) {
        Intent intent = new Intent(Genres.this,rock.class);
        startActivity(intent);
    }

    public void onClickJazz(View v) {
        Intent intent = new Intent(Genres.this,jazz.class);
        startActivity(intent);
    }

    public void onClickPop(View v) {
        Intent intent = new Intent(Genres.this,pop.class);
        startActivity(intent);
    }

    public void onClickClassic(View v) {
        Intent intent = new Intent(Genres.this,classic.class);
        startActivity(intent);
    }

    public void onClickBluze(View v) {
        Intent intent = new Intent(Genres.this,bluze.class);
        startActivity(intent);
    }

    public void onClickMetal(View v) {
        Intent intent = new Intent(Genres.this,metal.class);
        startActivity(intent);
    }
    public void onClickDisco(View v) {
        Intent intent = new Intent(Genres.this,disco.class);
        startActivity(intent);
    }
    public void onClickElectricmusic(View v) {
        Intent intent = new Intent(Genres.this,electricmusic.class);
        startActivity(intent);
    }
    public void onClickPostrock(View v) {
        Intent intent = new Intent(Genres.this,postrock.class);
        startActivity(intent);
    }
    public void onClickRap(View v) {
        Intent intent = new Intent(Genres.this,rap.class);
        startActivity(intent);
    }
    public void onClickRitmnbluze(View v) {
        Intent intent = new Intent(Genres.this,ritmnbluze.class);
        startActivity(intent);
    }
    public void onClickRocknroll(View v) {
        Intent intent = new Intent(Genres.this,rocknroll.class);
        startActivity(intent);
    }
    public void onClickUnderground(View v) {
        Intent intent = new Intent(Genres.this,underground.class);
        startActivity(intent);
    }
}