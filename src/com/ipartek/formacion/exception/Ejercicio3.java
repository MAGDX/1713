package com.ipartek.formacion.exception;

import java.util.Scanner;

import com.ipartek.formacion.Perro;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = -1;
		String raza = "";
		boolean vacunado = false;

		try {
			System.out.println("Inserte nombre del perro: ");
			nombre = sc.nextLine();

			System.out.println("Inserte edad del perro: ");
			edad = Integer.parseInt(sc.nextLine());

			System.out.println("Inserte raza del perro: ");
			raza = sc.nextLine();

			System.out.println("¿Esta vacunado?(s/n) ");
			if (sc.nextLine().equalsIgnoreCase("s")) {
				vacunado = true;
			}
			
		} catch (Exception e) {
			
		}
		
		Perro p = new Perro(nombre, edad, raza, vacunado);
	}
}