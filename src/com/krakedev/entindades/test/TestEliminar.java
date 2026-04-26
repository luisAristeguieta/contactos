package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestEliminar {

	public static void main(String[] args) {
		// El siguiente test tiene como finalidad poder validar el método eliminarContacto con el numero de telefono
		// de la misma forma se agregan contacto a la lista directorio y se verifica la cantidad de la lista antes y despues de aplicar el método
		
		// Para realizar las pruebas deben existir un directorio con algunos contactos nuevo y repetir otro
		
		Contacto contacto0 = new Contacto();
		contacto0.setNombre("Luis");
		contacto0.setCelular("0958917822");
		Contacto contacto1 = new Contacto();
		contacto1.setNombre("Maria");
		contacto1.setCelular("0958917511");
		Contacto contacto2 = new Contacto();
		contacto2.setNombre("Junior");
		contacto2.setCelular("0958978214"); // Para este numero de telefono del contacto se eliminará el numero de contacto1
		
		Directorio directorio = new Directorio();
		directorio.agregarContacto(contacto0);
		directorio.agregarContacto(contacto1);
		directorio.agregarContacto(contacto2); // 
		
		System.out.println("Cantidad de contactos antes de aplicar método : " + directorio.obtenerCantidadContactos());
		
		boolean resultadoEliminar = directorio.eliminarContacto("0958978214");
		System.out.println("Se eliminó el contacto? " + resultadoEliminar);
		System.out.println("El total de contacto despues de elimnar un contacto: " + directorio.obtenerCantidadContactos());

	}

}
