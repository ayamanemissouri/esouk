package com.spring.esouk.entity;

import javax.persistence.*;

@Entity
@Table(name="agriculteur")
public class Agriculteur {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="type")
    private String type;
    @Column(name="adresse")
    private String adresse;
    @Column(name="motdepasse")
    private String motdepasse;
    @Column(name="photo")
    private String photo;
    @OneToOne
    @JoinColumn(name="boutique")
    private Boutique boutique;
    @Column(name = "cin")
    private String cin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boutique getBoutique() {
        return boutique;
    }

    public void setBoutique(Boutique boutique) {
        this.boutique = boutique;
    }

    public Agriculteur() {
    }
}
