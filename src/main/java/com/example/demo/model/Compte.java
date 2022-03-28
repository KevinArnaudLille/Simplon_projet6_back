package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn()
@Table(name = "Comptes")
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "numero")
	private Integer numero;
	@Column(name = "solde")
	private Double solde;
	@Column(name = "actif")
	private boolean actif;
	@Column(name = "proprietaire_tutelle")
	private String proprietaire_tutelle;
	@Column(name = "date_ouverture")
	private Date date_ouverture;
	
	@OneToOne
	private Client client;
	
//	@JoinColumn(name = "compteEpargne_id", referencedColumnName = "id")
//	private CompteEpargne compteEpargne;
}
