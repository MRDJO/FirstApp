package com.uatm.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TpActivity extends AppCompatActivity {

    LinearLayout layRandom;
    LinearLayout layGasa;
    LinearLayout layChanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);

        layRandom = findViewById(R.id.lay_random);
        layGasa = findViewById(R.id.lay_gasaApp);
        layChanger = findViewById(R.id.lay_btnChanger);

        layRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TpActivity.this,JeuActivity.class));
            }
        });

        layChanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TpActivity.this,MainActivity.class));
            }
        });

        layGasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TpActivity.this,AccueilGasa.class));
            }
        });


    }
}