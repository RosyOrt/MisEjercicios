package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	long id;
	
	
	@Column(name = "nombre")
	String nombre;
	
	@NotEmpty(message = "debe teclear apellido")
	@Column(name = "apellidos")
	String apellidos;
	
	
	@Column(name = "edad")
	@Min(value = 18, message = "Debe tener al menos 18 años cumplidos")
	@Max(value = 50, message = "Debe tener menos de 50 años cumplidos")
	int edad;
	
	public Persona() {}
	

	public Persona(String nombre, String appelidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = appelidos;
		this.edad = edad;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAppelidos() {
		return apellidos;
	}
	public void setAppelidos(String appelidos) {
		this.apellidos = appelidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", appelidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	

}
