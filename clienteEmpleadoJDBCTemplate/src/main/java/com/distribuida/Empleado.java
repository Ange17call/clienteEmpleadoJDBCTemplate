package com.distribuida;

import java.io.Serializable;

public class Empleado implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private int id;
	
	private String nombre;
	
	private int edad;

	public Empleado(){
		
	}
	
	public Empleado(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", Nombre=" + nombre + ", Edad=" + edad+ "]";
	}
	
}

