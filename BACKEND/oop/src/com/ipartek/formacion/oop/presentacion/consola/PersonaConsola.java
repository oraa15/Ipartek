package com.ipartek.formacion.oop.presentacion.consola;

import java.util.Scanner;

public class PersonaConsola {
	public static void main(String[] args) {
		String nombre = IO.readln("Dime tu nombre: ");
		
		IO.println("Hola " + nombre);
		
		System.out.println("Hola");
		Scanner sc = new Scanner(System.in);
		
		int entero = Integer.parseInt(sc.nextLine());
		System.out.println(entero);
		
		String texto = sc.nextLine();
		System.out.println(texto);
		
		sc.close();
	}
}
