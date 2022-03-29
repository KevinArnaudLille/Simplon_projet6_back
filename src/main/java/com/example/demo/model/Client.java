package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clients")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "courriel")
	private String courriel;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "telephone")
	private String telephone;
	
	@OneToOne
	private Conseiller conseiller;
	
	@OneToMany(targetEntity = Compte.class)
	private List compteList;

	public Client() {}
	
	public Client(long id, String nom, String prenom, String courriel, String adresse, String telephone,
			Conseiller conseiller, List compteList) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.courriel = courriel;
		this.adresse = adresse;
		this.telephone = telephone;
		this.conseiller = conseiller;
		this.compteList = compteList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public List getCompteList() {
		return compteList;
	}

	public void setCompteList(List compteList) {
		this.compteList = compteList;
	}
}