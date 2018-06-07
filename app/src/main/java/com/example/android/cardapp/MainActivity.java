package com.example.android.cardapp;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    ViewPager viewpager;
    CustomPagerAdapter customPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewPager);

        customPagerAdapter = new CustomPagerAdapter(MainActivity.this);
        Log.d("Entering Main","HIEEEEE");
        viewpager.setAdapter(customPagerAdapter);
Log.d("Exiting Main","Byeeeee");


    }
}
