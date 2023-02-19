package com.uatm.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AccueilGasa extends AppCompatActivity {

    LinearLayout laypresentation;
    LinearLayout layFiliere;
    LinearLayout layContact;
    LinearLayout layApropos  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_gasa);

        laypresentation = findViewById(R.id.lay_presentation);
        layApropos = findViewById(R.id.lay_apropos);
        layFiliere = findViewById(R.id.lay_filiere);
        layContact = findViewById(R.id.lay_contact);

        laypresentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AccueilGasa.this,PresentationActivity.class));
            }
        });
        layContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AccueilGasa.this,ContactActivity.class));
            }
        });
        layApropos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AccueilGasa.this,AproposActivity.class));
            }
        });
        layFiliere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AccueilGasa.this,FiliereActivity.class));
            }
        });

    }
}