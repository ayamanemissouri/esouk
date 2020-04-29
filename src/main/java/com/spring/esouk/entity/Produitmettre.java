package com.spring.esouk.entity;

import javax.persistence.*;

@Entity
@Table(name="produitmettre")
public class Produitmettre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="description")
    private  String description;

    @Column(name="nom")
    private String nom;

    @Column(name="quantite")
    private int qte;
    @Column(name="prix")
    private int prix;
    @ManyToOne
    @JoinColumn(name = "boutique")
    private Boutique boutique;

    @OneToOne
    @JoinColumn(name="produit")
    private Produit produit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Boutique getBoutique() {
        return boutique;
    }

    public void setBoutique(Boutique boutique) {
        this.boutique = boutique;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Produitmettre() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Produitmettre{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", nom='" + nom + '\'' +
                ", qte=" + qte +
                ", prix=" + prix +
                ", boutique=" + boutique +
                ", produit=" + produit +
                '}';
    }
}
