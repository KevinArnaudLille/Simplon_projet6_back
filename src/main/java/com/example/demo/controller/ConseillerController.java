package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Conseiller;
import com.example.demo.service.ConseillerService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ConseillerController {
	@Autowired
	private ConseillerService conseillerService;
	
	/**
	 * Read - Get all Conseiller
	 */
	@GetMapping("/conseiller")
		public Iterable<Conseiller> getConseillers(){
			return conseillerService.getConseillers();
	}
	
}
