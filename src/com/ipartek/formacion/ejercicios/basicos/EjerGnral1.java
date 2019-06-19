package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerGnral1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int aux;

		System.out.println("Inserte un numero: ");
		n1 = sc.nextInt();
		System.out.println("Inserte otro numero: ");
		n2 = sc.nextInt();
		System.out.println("Numero 1: " + n1);
		System.out.println("Numero 2: " + n2);
		System.out.println("Intercambiamos valores de las variables...");
		aux = n1;
		n1 = n2;
		n2 = aux;
		System.out.println("Numero 1 con valor 2: " + n1);
		System.out.println("Numero 2 con valor 1: " + n2);
		sc.close();
	}
}