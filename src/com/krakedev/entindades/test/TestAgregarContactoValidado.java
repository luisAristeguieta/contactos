package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestAgregarContactoValidado {

	public static void main(String[] args) {
		// El siguiente test tiene como finalidad poder validar el método agregarContacto que fue modificado, modificacion que se 
		// hizo para validar primero que con el numero de teléfono se verifique que existe o no.
		
		// Para realizar las pruebas deben existir un directorio con algunos contactos nuevo y repetir otro
		
		Contacto contacto0 = new Contacto();
		contacto0.setNombre("Luis");
		contacto0.setCelular("0958917822");
		Contacto contacto1 = new Contacto();
		contacto1.setNombre("Maria");
		contacto1.setCelular("0958917511");
		Contacto contacto2 = new Contacto();
		contacto2.setNombre("Junior");
		contacto2.setCelular("0958917511"); // Para este numero de telefono del contacto se duplica el numero de contacto1
		
		Directorio directorio = new Directorio();
		boolean resultadoContacto0 = directorio.agregarContacto(contacto0);
		boolean resultadoContacto1 = directorio.agregarContacto(contacto1);
		boolean resultadoContacto2 = directorio.agregarContacto(contacto2); // Este contacto tiene el mismo numero resultara false que significa no agregado.
		
		// Imprime resultados en boolean: 
		
		System.out.println("Contacto 0 agregado: " + resultadoContacto0);
		System.out.println("Contacto 1 agregado: " + resultadoContacto1);
		System.out.println("Contacto 2 agregado: " + resultadoContacto2);
		
		System.out.println("El total de contacto agregados fueron: " + directorio.obtenerCantidadContactos());
		
		
	}

}
