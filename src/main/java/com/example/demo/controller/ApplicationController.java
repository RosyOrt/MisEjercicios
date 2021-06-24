package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ApplicationService;
import com.example.demo.model.Persona;


@RestController
public class ApplicationController {
	
	@Autowired
	ApplicationService service;
	
	
	
	@GetMapping(path = "/persona/{id}")
	public Persona getPersona(@PathVariable(value = "id") long id) {
		return service.getPersona(id);
	}
	
	@GetMapping(path = "/holaMundo")
	public String helloWorld() {
		return "HelloWorld";
	}
	
	@GetMapping(path = "/suma")
	public String suma() {
		return service.getsuma();
	}
	
	@PostMapping(path = "/persona")
	public Persona insPersona(@RequestBody Persona persona){
		return service.insPersona(persona);
		//return ResponseEntity.created(null).body(persona);
	}
	
	
}
