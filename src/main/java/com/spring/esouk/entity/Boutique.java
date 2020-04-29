package com.spring.esouk.entity;


import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="boutique")
public class Boutique {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "date_creation")
    private Date date;
    @OneToMany
    @JoinColumn(name = "produitmettre")
    private List<Produitmettre> produitmettre;
    @OneToOne
    @JoinColumn(name = "agriculteur")
    private Agriculteur agr;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public List<Produitmettre> getProduitmettre() {
        return produitmettre;
    }

    public void setProduitmettre(List<Produitmettre> produitmettre) {
        this.produitmettre = produitmettre;
    }

    public Agriculteur getAgr() {
        return agr;
    }

    public void setAgr(Agriculteur agr) {
        this.agr = agr;
    }

    public Boutique() {
    }
}
