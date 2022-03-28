package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Conseiller;

@Repository
public interface ConseillerRepository extends CrudRepository<Conseiller, Long> {
}