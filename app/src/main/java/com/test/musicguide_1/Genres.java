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
}