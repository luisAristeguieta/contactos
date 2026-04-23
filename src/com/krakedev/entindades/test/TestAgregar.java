package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestAgregar {

	public static void main(String[] args) {
		
		// Este test se usa para probar el metodo  que permite crear un contacto, configurar su nombre y agregarlo a la lista de directorio.
		Contacto contacto = new Contacto();
		contacto.setNombre("Ana");
		
		Directorio directorio = new Directorio();
		
		directorio.agregarContacto(contacto);
		
		//System.out.println(directorio.getContactos().size());

	}

}
