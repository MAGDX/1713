package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerGnral4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Inserte un numero: ");
		n = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		sc.close();
	}
}