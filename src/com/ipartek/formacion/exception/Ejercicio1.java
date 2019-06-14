package com.ipartek.formacion.exception;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Comienza programa");

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte un numero del 0 al 9: ");

		try {

			String s = sc.nextLine(); // usar siempre esto y no nextInt, nextChar
			int n = Integer.parseInt(s);

			System.out.println("Su numero es " + n);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("No has insertado un numero, que te den!!!");

		} finally {
			sc.close();
		}

		System.out.println("Finaliza programa");
	}
}