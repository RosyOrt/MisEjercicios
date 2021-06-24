package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ApplicationRespository;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.model.Persona;

@Service
public class ApplicationService {
	
	@Autowired
	PersonaRepository repo;
	
	@Autowired
	ApplicationRespository repository;
	
	public Persona getPersona(long id) {
						
		return repo.findById(id).get();
	}
	
	
	public String getsuma() {
		 int res = 2+2;
		 String result = "El resultado de la suma es: " + res;
		 return result;
	}

	public Persona insPersona(Persona per) {
		
		return repo.save(per);
	}
}
