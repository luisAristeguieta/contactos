package com.krakedev.entindades.test;

import com.krakedev.entindades.Contacto;

public class TestContacto {

	public static void main(String[] args) {
		
		Contacto contacto = new Contacto();
		
		System.out.println("Nombre: " + contacto.getNombre());
		System.out.println("Apellido: " + contacto.getApellido());
		System.out.println("Edad: " + contacto.getEdad());
		System.out.println("Numero Celular: " + contacto.getCelular());
		System.out.println("" + contacto.getpeso());
	}

}
