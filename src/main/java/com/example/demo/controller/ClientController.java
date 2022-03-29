package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/client")
	public Iterable<Client> getClients(){
		return clientService.getClients();
	}

	@GetMapping("/clientOfConseiller/{id}")
	public Iterable<Client> getClientsOfGivenConseiller(@PathVariable String id){
		return clientService.getClientsOfGivenConseiller(id);
	}
}