package com.uatm.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class JeuActivity extends AppCompatActivity {

    TextView tvNbr;
    Button btGenerer;
    ImageView ImgRsrc;
    ImageView ImgRsrc2;
    ImageView ImgRsrc3;
    ImageView ImgRsrc4;
    LinearLayout layTouch;

    int Image1 = -1;
    int Image2 = -1;
    int Image3 = -1;
    int Image4 = -1;
    int Image5 = -1;


    String  nomJoueursList [] = {"Cristiano","Leao","Bruno.F","Casemiro","Vini.Jr","Pote","Dossou","Benzema"};

    int  imageJoueur [] = {R.mipmap.cristiano,R.mipmap.leao,R.mipmap.god,R.mipmap.img_gasa,R.mipmap.logoacceuil,R.mipmap.presentation_gasa,R.mipmap.logo,R.mipmap.benzema};


    public void generateImageJoueur(ImageView Ressource){

        int nbr = 0 ;
        do {
            Random random = new Random();
            nbr = random.nextInt(nomJoueursList.length);
        }while( nbr == Image1 || nbr == Image2 || nbr == Image3 || nbr == Image4 || nbr == Image5);

        Ressource.setImageResource(imageJoueur[nbr]);

        if(Ressource == ImgRsrc){
            Image1 = nbr;
        }else if (Ressource == ImgRsrc2){
            Image2 = nbr ;
        }else if (Ressource == ImgRsrc3){
            Image3 = nbr ;
        }else if(Ressource == ImgRsrc4){
            Image4 = nbr ;
        }
        tvNbr.setText(nomJoueursList[nbr]);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);

        tvNbr = findViewById(R.id.tv_nbr);
        btGenerer = findViewById(R.id.bt_generer);


        ImgRsrc = findViewById(R.id.Image_joueur);
        ImgRsrc2 = findViewById(R.id.Image_jouertwo);
        ImgRsrc3 = findViewById(R.id.Image_jouerthree);
        ImgRsrc4 = findViewById(R.id.Image_jouerfour);
        layTouch = findViewById(R.id.lay_touch);

        btGenerer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int indexJoueur = random.nextInt(imageJoueur.length);
               //ImgRsrc.setImageResource(imageJoueur[nbr]);
                NouvellePartie();
            }
        });
        layTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NouvellePartie();
            }
        });

    }

    private void NouvellePartie() {
        generateImageJoueur(ImgRsrc);
        generateImageJoueur(ImgRsrc2);
        generateImageJoueur(ImgRsrc3);
        generateImageJoueur(ImgRsrc4);
    }
}