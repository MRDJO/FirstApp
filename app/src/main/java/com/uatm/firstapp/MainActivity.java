package com.uatm.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    * Declaration des variables à manipuler en java
    * */
    TextView zoneDeText;

    Button btnChanger;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_accueil_gasa);

        /*
        * faire la liaison entre les variables de l'xml et du java
        * */
        zoneDeText = findViewById(R.id.zone_text);
        btnChanger = findViewById(R.id.btn_change);


        btnChanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoneDeText.setText("bonsoir");
            }
        });

    }
}