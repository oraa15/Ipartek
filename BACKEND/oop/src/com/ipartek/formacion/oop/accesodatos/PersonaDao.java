package com.ipartek.formacion.oop.accesodatos;

import java.util.Collection;
import java.util.TreeMap;

import com.ipartek.formacion.oop.pojos.Persona;

// CRUD (Create Read Update Delete)
// DAO (Data Access Object)
public class PersonaDao {
	private static final TreeMap<Long, Persona> PERSONAS = new TreeMap<>();

	public static Collection<Persona> obtenerTodos() {
		return PERSONAS.values();
	}

	public static Persona obtenerPorId(Long id) {
		return PERSONAS.get(id);
	}

	public static Persona insertar(Persona persona) {
		Long id = PERSONAS.isEmpty() ? 1L : PERSONAS.lastKey() + 1L;

		Persona personaInsertar = new Persona(id, persona.nombre(), persona.apellidos(), persona.fechaNacimiento());

		PERSONAS.put(personaInsertar.id(), personaInsertar);

		return personaInsertar;
	}

	public static Persona modificar(Persona persona) {
		PERSONAS.put(persona.id(), persona);

		return persona;
	}
	
	public static void borrar(Long id) {
		PERSONAS.remove(id);
	}
}
