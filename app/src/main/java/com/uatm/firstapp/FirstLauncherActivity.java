package com.uatm.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class FirstLauncherActivity extends AppCompatActivity {

    private ImageView imageIcon;

    private final int SPLASH_SCREEN_TIMOUT = 3000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_launcher);
        initView();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),TpActivity.class);
                startActivity(intent);
                finish();
            }
        };

        new Handler().postDelayed(runnable,SPLASH_SCREEN_TIMOUT);

    }

    private void initView() {
        imageIcon = (ImageView) findViewById(R.id.image_icon);
    }
}