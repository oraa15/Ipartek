package com.ipartek.formacion.oop.presentacion.consola;

import static com.ipartek.formacion.bibliotecas.consola.Consola.*;

import java.time.LocalDate;

import com.ipartek.formacion.oop.accesodatos.PersonaDao;
import com.ipartek.formacion.oop.pojos.Persona;

public class PersonaConsola {

	private static final int SALIR = 0;

	public static void main(String[] args) {
		int opcion;

		do {
			mostrarMenu();
			
			opcion = rInt("Selecciona una opción");

			procesarOpcion(opcion);
		} while (opcion != SALIR);
	}

	private static void mostrarMenu() {
		pl("""
	
				MENU
				====
				1. Listado
				2. Obtener por id
	
				3. Alta
				4. Modificación
				5. Baja
	
				0. Salir
	
				""");
	}

	private static void procesarOpcion(int opcion) {
		switch (opcion) {
		case 1 -> listado();
		case 3 -> alta();
		case 0 -> salir();
		default -> pl("Error en la opción");
		}
	}

	private static void listado() {
		pl("Listado");
		
		for(Persona persona: PersonaDao.obtenerTodos()) {
			pl(persona);
		}
	}

	private static void alta() {
		pl("Alta");
		
		String nombre = rString("Nombre");
		String apellidos = rString("Apellidos");
		LocalDate fechaNacimiento = rLocalDate("Fecha de nacimiento");
		
		Persona persona = new Persona(null, nombre, apellidos, fechaNacimiento);
		
		pl(PersonaDao.insertar(persona));
	}

	private static void salir() {
		pl("Gracias por usar esta aplicación");
	}
}
