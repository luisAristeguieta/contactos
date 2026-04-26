package com.krakedev.entindades.test;

import java.util.ArrayList;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestBuscarPorCoincidencia {

	public static void main(String[] args) {
		// Comprueba los contactos que en su nombre contenga la subCadena que se le pasa
		// como parametros

		// Para realizar las pruebas deben existir un directorio con algunos contactos
		// nuevo y repetir otro

		Contacto contacto0 = new Contacto();
		contacto0.setNombre("Luis");
		contacto0.setCelular("0958917822");
		Contacto contacto1 = new Contacto();
		contacto1.setNombre("Maria");
		contacto1.setCelular("0958917511");
		Contacto contacto2 = new Contacto();
		contacto2.setNombre("Mafer");
		contacto2.setCelular("0958978214");

		Directorio directorio = new Directorio();
		directorio.agregarContacto(contacto0);
		directorio.agregarContacto(contacto1);
		directorio.agregarContacto(contacto2);

		// Para mostrar que se imprima todos los contacto se realiza un bucle tipo for:

		String subCadena = "Lu";
		ArrayList<Contacto> contactosEncontrados = directorio.buscarContactoCoincidencias(subCadena);

		for (int i = 0; i < contactosEncontrados.size(); i++) {
			Contacto contactoRecuperado = contactosEncontrados.get(i);
			System.out.println("El nombre de contacto es: " + contactoRecuperado.getNombre() + " y el número es: "
					+ contactoRecuperado.getCelular());
		}

	}

}
