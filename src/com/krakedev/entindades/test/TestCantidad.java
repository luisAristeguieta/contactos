package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestCantidad {

	public static void main(String[] args) {
		
		// Crea diferentes contactos en este caso con nombres y se agregan a lista de directorio: 
		Contacto contacto0 = new Contacto();
		contacto0.setNombre("Luis");
		Contacto contacto1 = new Contacto();
		contacto1.setNombre("Maria");
		Contacto contacto2 = new Contacto();
		contacto2.setNombre("Junior");
		
		Directorio directorio = new Directorio();
		directorio.agregarContacto(contacto0);
		directorio.agregarContacto(contacto1);
		directorio.agregarContacto(contacto2);
		
		System.out.println("La cantidad de contacto es: " + directorio.obtenerCantidadContactos());
		
		
		

	}

}
