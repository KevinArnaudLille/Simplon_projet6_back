package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Conseiller;

@Repository
public interface ConseillerRepository extends CrudRepository<Conseiller, Long> {
	@Query(value = "SELECT * FROM Conseillers c WHERE c.identifiant = :tempIdentifiant AND c.mot_de_passe= :tempMDP", nativeQuery = true)
	public Optional<Conseiller> getConseillerWithIdAndPassword(String tempIdentifiant, String tempMDP);
}