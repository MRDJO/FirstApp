package com.uatm.firstapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class RvAdapter extends RecyclerView.Adapter <RvAdapter.RvViewHolder> {

    ArrayList <Filiere> FilierListe = new ArrayList<>();
    Context context ;

    public RvAdapter(ArrayList<Filiere> FilierListe , Context context ) {
        this.FilierListe = FilierListe;
        this.context = context;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_filiere,parent,false);
        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvNomFiliere.setText(FilierListe.get(position).getNom());
        holder.imgVFiliere.setImageResource(FilierListe.get(position).getImage_link());
        holder.tvDescription.setText(FilierListe.get(position).getDescription());
        holder.layDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,DetailsFiliereActivity.class).putExtra("filiere",FilierListe.get(position)));
            }
        });
    }

    @Override
    public int getItemCount() {
        return FilierListe.size();
    }

    class RvViewHolder extends RecyclerView.ViewHolder{

        TextView tvNomFiliere;
        ImageView imgVFiliere;
        TextView tvDescription;
        LinearLayout layDetail;
        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNomFiliere = itemView.findViewById(R.id.id_tvnom_filiere);
            imgVFiliere = itemView.findViewById(R.id.id_imgv_filiere);
            tvDescription = itemView.findViewById(R.id.id_tvdescription);
            layDetail = itemView.findViewById(R.id.lay_detail);

        }
    }
}
