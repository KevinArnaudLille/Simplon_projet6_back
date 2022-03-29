package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

	@Query(value = "SELECT * FROM Clients c WHERE c.conseiller_id = :id", nativeQuery = true)
	public List<Client> getClientsOfGivenConseiller(String id);
}