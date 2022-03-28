package com.example.demo.model;
import java.util.List;

import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
@Data
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
}