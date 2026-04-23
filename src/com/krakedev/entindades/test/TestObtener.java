package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestObtener {

	public static void main(String[] args) {
		// Con este test se quiere probar el metodo obtenerContacto, teniendo un directorio con contacto se procede a acceder a el nombre de un contacto.
		
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
		
		// Se invocaria la funcion que retorna el contacto y se accede al nombre del contacto recuperado:
		
		System.out.println("El nombre del contacto es: " + directorio.obtenerContacto(0).getNombre());
		

	}

}
