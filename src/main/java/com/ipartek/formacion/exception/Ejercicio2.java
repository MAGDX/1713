package com.ipartek.formacion.exception;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("Comienza programa");

		int n1 = -1;
		int n2 = -1;
		Scanner sc = new Scanner(System.in);

		while (n1 < 0 || n1 > 9 || n2 < 0 || n2 > 9) {
			try {
				if (n1 < 0 || n1 > 9) {
					System.out.println("Inserte primer numero del 0 al 9: ");
					n1 = Integer.parseInt(sc.nextLine());
				}
				if (n2 < 0 || n2 > 9) {
					System.out.println("Inserte segundo numero del 0 al 9: ");
					n2 = Integer.parseInt(sc.nextLine());
				}
				System.out.println("El primer numero es " + n1);
				System.out.println("El segundo numero es " + n2);
				System.out.println("La suma es " + (n1 + n2));
			} catch (Exception e) {
				System.out.println("No has insertado un numero, vuelve a intentarlo...");
			}
		}

		sc.close();

		System.out.println("Finaliza programa");
	}
}