package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestAgregar {

	public static void main(String[] args) {
		
		Contacto contacto = new Contacto();
		contacto.setNombre("Ana");
		
		Directorio directorio = new Directorio();
		
		directorio.agregarContacto(contacto);

	}

}
