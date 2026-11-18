package com.ipartek.formacion.oop.pojos;

import java.time.LocalDate;

public record Persona(Long id, String nombre, String apellidos, LocalDate fechaNacimiento) {

}
