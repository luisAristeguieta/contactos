package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestRecuperarNumero {

	public static void main(String[] args) {
		// Tiene como objetivo probar el metodo recuperarNumero(), ya se debe tener un directorio con contacto y sus numeros
		Contacto contacto0 = new Contacto();
		contacto0.setNombre("Luis");
		contacto0.setCelular("0958917822");
		Contacto contacto1 = new Contacto();
		contacto1.setNombre("Maria");
		contacto0.setCelular("0958917511");
		Contacto contacto2 = new Contacto();
		contacto2.setNombre("Junior");
		contacto0.setCelular("0998910912");
		
		Directorio directorio = new Directorio();
		directorio.agregarContacto(contacto0);
		directorio.agregarContacto(contacto1);
		directorio.agregarContacto(contacto2);
		
		System.out.println("El numero de contacto es: " + directorio.recuperarNumero(0));
	}

}
