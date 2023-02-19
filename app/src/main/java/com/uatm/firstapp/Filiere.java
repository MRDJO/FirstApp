package com.uatm.firstapp;

import java.io.Serializable;

public class Filiere implements Serializable {

    String nom ;
    String description ;
    int image_link;

    public Filiere(String nom, String description, int image_link) {
        this.nom = nom;
        this.description = description;
        this.image_link = image_link;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getImage_link() {
        return image_link;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage_link(int image_link) {
        this.image_link = image_link;
    }
}

