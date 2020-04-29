package com.spring.esouk.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="souk")
public class Souk {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="nom")
	private String Nom;
	@Column(name="date")
	private Date date;
	@Column(name="duree")
	private Time duree;
	@Column(name="description")
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getDuree() {
		return duree;
	}
	public void setDuree(Time duree) {
		this.duree = duree;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Souk()
	{
}
}