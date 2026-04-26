package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestBuscarContacto {

	public static void main(String[] args) {
		// Test diseñado para probar el metodo buscarContactoConCelular de buscar un contacto en la lista por el numero de telefono, 
		// le pasas el numero y te devuelve el contacto para este caso el atributo del nombre
		
		Contacto contacto0 = new Contacto();
		contacto0.setNombre("Luis");
		contacto0.setCelular("0958917822");
		Contacto contacto1 = new Contacto();
		contacto1.setNombre("Maria");
		contacto1.setCelular("0958917511");
		Contacto contacto2 = new Contacto();
		contacto2.setNombre("Junior");
		contacto2.setCelular("0998910912");
		
		Directorio directorio = new Directorio();
		directorio.agregarContacto(contacto0);
		directorio.agregarContacto(contacto1);
		directorio.agregarContacto(contacto2);
		
		Contacto contactoRecuperado = directorio.buscarContactoConCelular("0958917511");
		
		if (contactoRecuperado!= null) {
			System.out.println("El numero consultado pertenece a: " + contactoRecuperado.getNombre());
		} else {
			System.out.println("No existe contacto con el numero solictado");
		}

	}

}
