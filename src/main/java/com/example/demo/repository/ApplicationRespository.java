package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;



@Repository
public class ApplicationRespository {
	
	private static ArrayList<Persona> miArray = new ArrayList<Persona>();
	
	static{
		System.out.println("poblando base de datos");
		miArray.add(new Persona("Rosa Isela", "Ortiz Napoles", 20));
		miArray.add(new Persona("Gael", "Ortiz ", 20));
		miArray.add(new Persona("Irving ", "Ortiz ", 20));
	}
	
	
	public Persona getPersona(long id) {
					
		return  miArray.get((int)id);
		//return new Persona("Rosa Isela", "Ortiz Napoles", 20);
	}
	
	
	
	public Persona insertarPersona(Persona persona) {
				
		miArray.add(persona);
			
		return persona;
	}

}
