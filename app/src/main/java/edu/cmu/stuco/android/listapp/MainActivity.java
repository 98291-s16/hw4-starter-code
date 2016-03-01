package edu.cmu.stuco.android.listapp;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Field;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
    private Drawable getRandomDrawable() {
        TypedArray imgs = getResources().obtainTypedArray(R.array.images);
        Random rand = new Random();
        int rndInt = rand.nextInt(imgs.length());
        int resID = imgs.getResourceId(rndInt, 0);

        return ContextCompat.getDrawable(this, resID);
    }
}
