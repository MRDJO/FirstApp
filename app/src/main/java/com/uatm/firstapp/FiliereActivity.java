package com.uatm.firstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FiliereActivity extends AppCompatActivity {

    private RecyclerView rv;

    ArrayList <Filiere> FiliereList = new ArrayList <>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filiere);
        initView();

        FiliereList.add(new Filiere("Génie Electrique","l’équipe pédagogique de l’UATM s’attèle à former les meilleurs ingénieurs, entrepreneurs, comptables, agronomes et juristes, comme le démontrent nos résultats aux examens/concours nationaux et internationaux. Par ailleurs l’excellent taux d’insertion de nos diplômés dans la vie professionnelle constitue aussi un motif de fierté pour nous. Beaucoup reconnaissent d’ailleurs cet état de fait et distinguent l’UATM pour ses performances.",R.mipmap.pngtree));
        FiliereList.add(new Filiere("Agronomie","Les truc de plantes, l’équipe pédagogique de l’UATM s’attèle à former les meilleurs ingénieurs, entrepreneurs, comptables, agronomes et juristes, comme le démontrent nos résultats aux examens/concours nationaux et internationaux. Par ailleurs l’excellent taux d’insertion de nos diplômés dans la vie professionnelle constitue aussi un motif de fierté pour nous.",R.mipmap.leao));
        FiliereList.add(new Filiere("Biotechnique","Des truc de disséquer des animaux,  l’équipe pédagogique de l’UATM s’attèle à former les meilleurs ingénieurs, entrepreneurs, comptables, agronomes et juristes, comme le démontrent nos résultats aux examens/concours nationaux et internationaux.",R.mipmap.god));
        FiliereList.add(new Filiere("Gestion","Les bails des comptables, l’équipe pédagogique de l’UATM s’attèle à former les meilleurs ingénieurs, entrepreneurs, comptables, agronomes et juristes, comme le démontrent nos résultats aux examens/concours nationaux et internationaux. ",R.mipmap.benzema));

        rv.setLayoutManager(new LinearLayoutManager(FiliereActivity.this,LinearLayoutManager.VERTICAL,false));
        rv.setAdapter(new RvAdapter(FiliereList,FiliereActivity.this));

    }

    private void initView() {
        rv = (RecyclerView) findViewById(R.id.rv);
    }
}