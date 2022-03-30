package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Conseiller;
import com.example.demo.service.ConseillerService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ConseillerController {
	@Autowired
	private ConseillerService conseillerService;
	
	/**
	 * Read - Get all Conseiller
	 */
//	@GetMapping("/conseiller")
//		public Iterable<Conseiller> getConseillers(){
//			return conseillerService.getConseillers();
//	}
	

//	@PostMapping("/conseiller")
	@RequestMapping(value = "/conseiller")
		public Optional<Conseiller> getConseillerWithIdAndPassword(
				@RequestParam("login") String tempIdentifiant,
				@RequestParam("mdp") String tempMDP
				) throws Exception{
//		if(tempIdentifiant != null && tempMDP != null) {
//			conseillerOBJ = conseillerService.getConseillersBy();
//		}
		return conseillerService.getConseillerWithIdAndPassword(tempIdentifiant, tempMDP);
	}
	
	@GetMapping("/conseiller/{id}")
	public Optional<Conseiller> getConseillerID(@PathVariable long id){
		return conseillerService.getConseillerID(id);
	}
	
	
//	@PostMapping("/conseiller")
//	public Conseiller loginConseiller(@RequestBody Conseiller conseiller) throws Exception {
//		String tempIdentifiant = conseiller.getIdentifiant();
//		String tempMDP = conseiller.getMot_de_passe();
//		Conseiller conseillerOBJ = null;
//		if(tempIdentifiant != null && tempMDP != null) {
//			conseillerOBJ = conseillerService.getConseiller(tempIdentifiant, tempMDP);
//		}
//		if(conseillerOBJ == null) {
//			throw new Exception("Bad credentials");
//		}
//		return conseillerOBJ;
//	}
	
}