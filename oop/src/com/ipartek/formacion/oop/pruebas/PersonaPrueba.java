package com.ipartek.formacion.oop.pruebas;

import java.time.LocalDate;

import com.ipartek.formacion.oop.pojos.Persona;

public class PersonaPrueba {
	public static void main(String[] args) {
		Persona persona = new Persona(1L, "Javier","Lete", LocalDate.of(2000, 1, 2));
		Persona persona2 = new Persona(1L, "Javier","Lete", LocalDate.of(2000, 1, 2));
		
		System.out.println(persona);
		System.out.println(persona.equals(persona2));
	}

}
