package com.uatm.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsFiliereActivity extends AppCompatActivity {

    private ImageView imgDetail;
    private TextView idNomDetail;
    private TextView idDescriptionDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_filiere);

        Filiere filier = (Filiere) getIntent().getSerializableExtra("filiere");
        initView();

        imgDetail.setImageResource(filier.getImage_link());
        idNomDetail.setText(filier.getNom());
        idDescriptionDetail.setText(filier.getDescription());

    }

    private void initView() {
        imgDetail = (ImageView) findViewById(R.id.img_detail);
        idNomDetail = (TextView) findViewById(R.id.id_nom_detail);
        idDescriptionDetail = (TextView) findViewById(R.id.id_description_detail);
    }
}