package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerGnral6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int suma = 0;

		System.out.println("Inserte un numero: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (n % i == 0) {
				suma = suma + i;
			}
		}
		
		if (suma==n) {
			System.out.println("El numero " + n + " es perfecto.");
		}
		else {
			System.out.println("El numero " + n + " no es perfecto.");
		}
		sc.close();
	}
}