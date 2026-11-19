package com.ipartek.formacion.bibliotecas.consola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Consola {
	private static final Scanner SC = new Scanner(System.in);

	public static String formatoFecha = "dd/MM/yyyy";

	private static DateTimeFormatter getFormateadorFecha() {
		return DateTimeFormatter.ofPattern(formatoFecha);
	}

	public static void pl(Object mensaje) {
		System.out.println(mensaje);
	}

	public static void pl(LocalDate localDate) {
		pl(localDate.format(getFormateadorFecha()));
	}

	public static void p(Object mensaje) {
		System.out.print(mensaje);
	}

	public static String rString(String mensaje) {
		p(mensaje + ": ");
		return SC.nextLine();
	}

	public static int rInt(String mensaje) {
		Integer entero = null;

		boolean repetir = true;

		do {
			String texto = rString(mensaje);

			try {
				entero = Integer.parseInt(texto);

				repetir = false;
			} catch (NumberFormatException e) {
				pl("Error en el formato del número");
			}
		} while (repetir);

		return entero;
	}

	public static LocalDate rLocalDate(String mensaje) {
		LocalDate localDate = null;
		
		boolean repetir = true;
		
		do {
			String texto = rString(String.format("%s (%s)", mensaje, formatoFecha));
			try {
				localDate = LocalDate.parse(texto, getFormateadorFecha());
				
				repetir = false;
			} catch (DateTimeParseException e) {
				pl("Error en la fecha");
			} 
		} while (repetir );
		
		return localDate;
	}
}
