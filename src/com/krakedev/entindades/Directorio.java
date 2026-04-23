package com.krakedev.entindades;

import java.util.ArrayList;

public class Directorio {
	
	ArrayList<Contacto> contactos;


	public Directorio() {
		contactos = new ArrayList<Contacto>();
	}
	

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public void agregarContacto (Contacto contacto) {
		
		contactos.add(contacto);
	}
	
	public int obtenerCantidadContactos() {
		return contactos.size();
	}
	
	public Contacto obtenerContacto(int indice) {
		return contactos.get(indice);
	}
	
	public void imprimirContacto() {
		for(int i = 0; i<contactos.size();i++) {
			Contacto contactoRecuperado = contactos.get(i);
			System.out.println("El nombre del contacto es: " +  contactoRecuperado.getNombre());
		}
	}
	
}
