package com.example.demo.service;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.ConseillerRepository;

import lombok.Data;
import lombok.extern.slf4j.*;

@Slf4j
@Data
@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Optional<Client> getClient(final Long id){
		return clientRepository.findById(id);
	}
	
	public Iterable<Client> getClients(){
		return clientRepository.findAll();
	}
	
	public Client saveClient(Client client) {
		Client savedClient = clientRepository.save(client);
		return savedClient;
	}
	
	public Iterable<Client> getClientsOfGivenConseiller(String id){
		return clientRepository.getClientsOfGivenConseiller(id);
	}
}