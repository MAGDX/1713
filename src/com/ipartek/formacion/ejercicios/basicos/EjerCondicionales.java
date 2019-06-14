package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerCondicionales {

	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Ejercicio 1");
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Inserte un numero: ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		// Ejercicio 2
		System.out.println("\nEjercicio 2");
		// int n;
		System.out.print("Inserte un numero: ");
		n = sc.nextInt();
		if (n % 10 == 0) {
			System.out.println("Es multiplo de 10.");
		} else {
			System.out.println("No es multiplo de 10.");
		}

		// Ejercicio 3
		System.out.println("\nEjercicio 3");
		char c;
		System.out.print("Inserte un caracter: ");
		c = sc.next().charAt(0);

		if (Character.isUpperCase(c)) {
			System.out.println("Es una letra mayúscula.");
		} else {
			System.out.println("No es una letra mayúscula.");
		}

		// Ejercicio 4
		System.out.println("\nEjercicio 4");
		char c1;
		char c2;
		System.out.print("Inserte un caracter: ");
		c1 = sc.next().charAt(0);
		System.out.print("Inserte otro caracter: ");
		c2 = sc.next().charAt(0);
		if (c1 == c2) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("No son iguales.");
		}

		// Ejercicio 5
		System.out.println("\nEjercicio 5");
		// char c1;
		// char c2;
		System.out.print("Inserte un caracter: ");
		c1 = sc.next().charAt(0);
		System.out.print("Inserte otro caracter: ");
		c2 = sc.next().charAt(0);
		if (Character.isUpperCase(c1)) {
			if (Character.isUpperCase(c2)) {
				System.out.println("Las dos son letras mayusculas.");
			} else {
				System.out.println("El primero es una mayuscula, el segundo no.");
			}
		} else {
			if (Character.isUpperCase(c2)) {
				System.out.println("El segundo es una mayuscula, el primero no.");
			} else {
				System.out.println("Las dos son letras minusculas.");
			}
		}

		// Ejercicio 6
		System.out.println("\nEjercicio 6");
		// char c;
		System.out.print("Inserte un caracter: ");
		c = sc.next().charAt(0);

		if (Character.isDigit(c)) {
			System.out.println("Es un numero.");
		} else {
			System.out.println("No es un numero.");
		}

		// Ejercicio 7
		System.out.println("\nEjercicio 7");
		double dividendo;
		double divisor;

		System.out.print("Inserte el dividendo: ");
		dividendo = sc.nextDouble();
		System.out.print("Inserte el divisor: ");
		divisor = sc.nextDouble();

		if (divisor != 0) {
			System.out.println(dividendo + " / " + divisor + " = " + dividendo / divisor);
		} else {
			System.out.println("No se puede dividir por cero");
		}

		// Ejercicio 8
		System.out.println("\nEjercicio 8");
		int n1;
		int n2;
		int n3;

		System.out.print("Introduzca primer numero: ");
		n1 = sc.nextInt();
		System.out.print("Introduzca segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Introduzca tercer numero: ");
		n3 = sc.nextInt();

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("El mayor es: " + n1);
			} else {
				System.out.println("El mayor es: " + n3);
			}
		} else if (n2 > n3) {
			System.out.println("El mayor es: " + n2);
		} else {
			System.out.println("El mayor es: " + n3);
		}

		// Ejercicio 9
		System.out.println("\nEjercicio 9");
		int h;
		int m;
		int s;
		System.out.print("Introduzca hora: ");
		h = sc.nextInt();
		System.out.print("Introduzca minutos: ");
		m = sc.nextInt();
		System.out.print("Introduzca segundos: ");
		s = sc.nextInt();
		if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
			System.out.println("Hora correcta");
		} else {
			System.out.println("Hora incorrecta");
		}

		// Ejercicio 10
		System.out.println("\nEjercicio 10");
		int mes;
		System.out.print("Introduzca numero de mes: ");
		mes = sc.nextInt();
		if (mes < 1 || mes > 12) {
			System.out.println("Mes incorrecto");
		} else {
			switch (mes) {
			case 1:
				System.out.print("Enero");
				break;
			case 2:
				System.out.print("Febrero");
				break;
			case 3:
				System.out.print("Marzo");
				break;
			case 4:
				System.out.print("Abril");
				break;
			case 5:
				System.out.print("Mayo");
				break;
			case 6:
				System.out.print("Junio");
				break;
			case 7:
				System.out.print("Julio");
				break;
			case 8:
				System.out.print("Agosto");
				break;
			case 9:
				System.out.print("Septiembre");
				break;
			case 10:
				System.out.print("Octubre");
				break;
			case 11:
				System.out.print("Noviembre");
				break;
			case 12:
				System.out.print("Diciembre");
				break;
			}

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				System.out.println(" tiene 30 días");
			} else if (mes == 2) {
				System.out.println(" tiene 28 días");
			} else {
				System.out.println(" tiene 31 días");
			}
		}

		sc.close();
	}
}