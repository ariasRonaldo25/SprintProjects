package com.api.rest.restFile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.dao.PersonaDao;
import com.api.rest.modelo.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {
	
	//inyeccion de dependencia.
	@Autowired
	private PersonaDao personaDao;

	
	//trabajando con los metodos http solicitud al servidor
	
	// Get, POST, PUT , DELETE -> 200 (CORRECTO), 500(ERROR DE LOGICA) , 404(ERROR SEMANTICO RUTAS)
	
	//metodo post
	@PostMapping("/insertar")
	public void insertar(@RequestBody Persona persona) { //localhost:8080/personas/insertar
		
		 personaDao.save(persona);
		
	}
	
	// metodo get
	@GetMapping("/listar")
	public List<Persona> listar(){//localhost:8080/personas/listar
		
		return personaDao.findAll();
		
	}
	
	//metodo put
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona persona) { //localhost:8080/personas/actualizar
		
		 personaDao.save(persona);
		
	}
	
	
	//metodo delete
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable ("id") Integer id) {//localhost:8080/personas/eliminar
		
		personaDao.deleteById(id);
	}
	

	
	
}
