//package com.example.demo.model;
//
//import javax.persistence.*;
//
//public class CompteEpargne {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
//	@Column(name = "title")
//	private Double taux_interet;
//	@Column(name = "plafond")
//	private Double plafond;
//	@OneToOne(mappedBy = "compteEpargne")
//	private Compte compte;
//}