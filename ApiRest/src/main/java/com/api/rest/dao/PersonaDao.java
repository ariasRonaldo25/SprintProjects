package com.api.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.modelo.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer> {
	
	
	

}
