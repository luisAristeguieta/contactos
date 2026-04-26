package com.krakedev.entindades.test.JUnit;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.entindades.Contacto;
import com.krakedev.entindades.Directorio;

public class TestDirectorio {
	/* Utilizado con IA donde se prueba los casos para el metodo agregarContacto comprueba con contacto nuevos y existente
	explicado de forma detallada con el promp utlizado */
	
	 private Directorio directorio;

	    @BeforeEach
	    public void setUp() {
	        directorio = new Directorio();
	    }

	    @Test
	    public void testAgregarContacto_nuevoContacto_retornaTrue() {
	        // Se prueba: agregar un contacto que NO existe previamente
	        // Resultado esperado: retorna true y se agrega a la lista

	        Contacto c = new Contacto();
	        c.setNombre("Aldrin");
	        c.setCelular("0999999999");

	        boolean resultado = directorio.agregarContacto(c);

	        assertTrue(resultado);
	        assertEquals(1, directorio.obtenerCantidadContactos());
	    }

	    @Test
	    public void testAgregarContacto_contactoDuplicado_retornaFalse() {
	        // Se prueba: agregar un contacto con un celular que YA existe
	        // Resultado esperado: retorna false y NO se agrega duplicado

	        Contacto c1 = new Contacto();
	        c1.setNombre("Juan");
	        c1.setCelular("0988888888");

	        Contacto c2 = new Contacto();
	        c2.setNombre("Pedro");
	        c2.setCelular("0988888888"); // mismo celular

	        directorio.agregarContacto(c1);
	        boolean resultado = directorio.agregarContacto(c2);

	        assertFalse(resultado);
	        assertEquals(1, directorio.obtenerCantidadContactos());
	    }

	    @Test
	    public void testAgregarContacto_variosContactosSinDuplicados() {
	        // Se prueba: agregar múltiples contactos con celulares distintos
	        // Resultado esperado: todos se agregan correctamente

	        Contacto c1 = new Contacto();
	        c1.setNombre("Ana");
	        c1.setCelular("0911111111");

	        Contacto c2 = new Contacto();
	        c2.setNombre("Luis");
	        c2.setCelular("0922222222");

	        Contacto c3 = new Contacto();
	        c3.setNombre("Maria");
	        c3.setCelular("0933333333");

	        assertTrue(directorio.agregarContacto(c1));
	        assertTrue(directorio.agregarContacto(c2));
	        assertTrue(directorio.agregarContacto(c3));

	        assertEquals(3, directorio.obtenerCantidadContactos());
	    }

	    @Test
	    public void testBuscarContactoConCelular_existente() {
	        // Se prueba: buscar un contacto que existe por celular
	        // Resultado esperado: retorna un objeto distinto de null

	        Contacto c = new Contacto();
	        c.setNombre("Carlos");
	        c.setCelular("0944444444");

	        directorio.agregarContacto(c);

	        Contacto encontrado = directorio.buscarContactoConCelular("0944444444");

	        assertNotNull(encontrado);
	        assertEquals("Carlos", encontrado.getNombre());
	    }

	    @Test
	    public void testBuscarContactoConCelular_noExistente() {
	        // Se prueba: buscar un celular que no existe
	        // Resultado esperado: retorna null

	        Contacto encontrado = directorio.buscarContactoConCelular("0000000000");

	        assertNull(encontrado);
	    }

	    @Test
	    public void testAgregarContacto_verificaNoDuplicadosYTamano() {
	        // Se prueba: intentar agregar duplicados y verificar tamaño final
	        // Resultado esperado: solo se agrega una vez

	        Contacto c1 = new Contacto();
	        c1.setNombre("Sofia");
	        c1.setCelular("0955555555");

	        Contacto c2 = new Contacto();
	        c2.setNombre("Sofia Copy");
	        c2.setCelular("0955555555");

	        assertTrue(directorio.agregarContacto(c1));
	        assertFalse(directorio.agregarContacto(c2));

	        assertEquals(1, directorio.obtenerCantidadContactos());
	    }
	
}
