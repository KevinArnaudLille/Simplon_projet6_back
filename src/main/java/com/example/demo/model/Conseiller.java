package com.example.demo.model;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Conseillers")
public class Conseiller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "identifiant")
	private String identifiant;
	@Column(name = "mot_de_passe")
	private String mot_de_passe;
	
	@OneToMany(targetEntity = Conseiller.class)
	private List clientList;

	public Conseiller() {}
	
	public Conseiller(long id, String nom, String prenom, String identifiant, String mot_de_passe, List clientList) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
		this.mot_de_passe = mot_de_passe;
		this.clientList = clientList;
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

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	public List getClientList() {
		return clientList;
	}

	public void setClientList(List clientList) {
		this.clientList = clientList;
	}
	
	
}