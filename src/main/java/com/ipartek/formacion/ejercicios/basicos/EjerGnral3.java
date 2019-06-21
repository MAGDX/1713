package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerGnral3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperatura;
		char c;
		do {
			System.out.print("Introduce temperatura en ºC: ");
			temperatura = sc.nextDouble();
			System.out.println("Grados Kelvin ..: " + (temperatura + 273));
			System.out.print("Repetir proceso? (S/N): ");
			c = sc.nextLine().charAt(0);
		} while (c == 'S' || c == 's');
		sc.close();
	}
}