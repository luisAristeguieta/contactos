package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestFor {

	public static void main(String[] args) {
		// Test creado para el metodo imprimir que contiene un for que imprime el nombre del contacto y ver el debug como se accede a cada contacto: 
		
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
		
		directorio.imprimirContacto();

	}

}
