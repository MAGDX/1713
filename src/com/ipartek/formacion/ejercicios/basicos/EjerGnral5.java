package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerGnral5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int cont = 0;

		while (n >= 0) {
			System.out.println("Inserte un numero: ");
			n = sc.nextInt();
			if(n%10==2) {
				cont++;
			}
		}
		System.out.println(cont + " numeros de los introducidos terminaban en 2.");
		sc.close();
	}
}