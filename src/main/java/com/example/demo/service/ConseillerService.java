package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Conseiller;
import com.example.demo.repository.ConseillerRepository;

import lombok.Data;

@Data
@Service
public class ConseillerService {

	@Autowired
	private ConseillerRepository conseillerRepository;
	
	public Optional<Conseiller> getConseiller(final Long id){
		return conseillerRepository.findById(id);
	}
	
	public Optional<Conseiller> getConseillerID(Long id){
		return conseillerRepository.findById(id);
	}
	
	public Iterable<Conseiller> getConseillers(){
		return conseillerRepository.findAll();
	}
	
//	public Iterable<Conseiller> getConseillersBy(){
//		return conseillerRepository.findAll();
//	}
	
	public Optional<Conseiller> getConseillerWithIdAndPassword(String tempIdentifiant, String tempMDP){
		return conseillerRepository.getConseillerWithIdAndPassword(tempIdentifiant, tempMDP);
	}
	
	public Conseiller saveConseiller(Conseiller conseiller) {
		Conseiller savedConseiller = conseillerRepository.save(conseiller);
		return savedConseiller;
	}
}
