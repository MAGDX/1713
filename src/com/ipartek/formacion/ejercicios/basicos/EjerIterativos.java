package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerIterativos {

	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Ejercicio 1");
		int i = 1;
		while (i <= 100) {
			System.out.println(i++);
		}

		// Ejercicio 2
		System.out.println("\nEjercicio 2");
		i = 1;
		do {
			System.out.println(i++);
		} while (i <= 100);

		// Ejercicio 3
		System.out.println("\nEjercicio 3");
		for (i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		// Ejercicio 4
		System.out.println("\nEjercicio 4");
		i = 100;
		while (i >= 1) {
			System.out.println(i--);
		}

		// Ejercicio 5
		System.out.println("\nEjercicio 5");
		i = 100;
		do {
			System.out.println(i--);
		} while (i >= 1);

		// Ejercicio 6
		System.out.println("\nEjercicio 6");
		for (i = 100; i >= 1; i--) {
			System.out.println(i);
		}

		// Ejercicio 7
		System.out.println("\nEjercicio 7");
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un numero mayor que 1: ");
		int n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.println(i);
		}

		sc = new Scanner(System.in);
		System.out.println("Inserte un numero mayor que 1: ");
		n = sc.nextInt();
		i = 1;
		while (i <= n) {
			System.out.println(i++);
		}

		sc = new Scanner(System.in);
		System.out.println("Inserte un numero mayor que 1: ");
		n = sc.nextInt();
		i = 1;
		do {
			System.out.println(i++);
		} while (i <= n);

		// Ejercicio 8
		System.out.println("\nEjercicio 8");
		sc = new Scanner(System.in);
		System.out.println("Inserte un numero mayor que 1: ");
		for (i = sc.nextInt(); i >= 1; i--) {
			System.out.println(i);
		}

		sc = new Scanner(System.in);
		System.out.println("Inserte un numero mayor que 1: ");
		i = sc.nextInt();
		while (i >= 1) {
			System.out.println(i--);
		}

		sc = new Scanner(System.in);
		System.out.println("Inserte un numero mayor que 1: ");
		i = sc.nextInt();
		do {
			System.out.println(i--);
		} while (i >= 1);

		// Ejercicio 9
		System.out.println("\nEjercicio 9");
		int n1, n2, menor, mayor;

		do {
			System.out.print("Introduce un número entero: ");
			n1 = sc.nextInt();
			System.out.print("Introduce otro número entero distinto del anterior: ");
			n2 = sc.nextInt();
			if (n1 == n2) {
				System.out.println("Debes introducir dos números distintos");
			}
		} while (n1 == n2);

		if (n1 > n2) {
			mayor = n1;
			menor = n2;
		} else {
			mayor = n2;
			menor = n1;
		}

		System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
		for (i = menor; i <= mayor; i++) {
			System.out.println(i);
		}

		// Ejercicio 10
		System.out.println("\nEjercicio 10");
		sc = new Scanner(System.in);
		int a;
		int b;

		do {
			System.out.print("Introduce un número entero: ");
			a = sc.nextInt();
			System.out.print("Introduce otro número entero mayor que el anterior: ");
			b = sc.nextInt();
			if (a >= b) {
				System.out.println("El segundo número debe ser mayor que el primero");
			}
		} while (a >= b);
		System.out.println("\nNúmeros pares desde " + a + " hasta " + b + " : ");
		for (i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Ejercicio 11
		System.out.println("\nEjercicio 11");
		sc = new Scanner(System.in);
		int m;

		do {
			System.out.print("Introduce un número entero positivo: ");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Debe introducir un número positivo");
			}
		} while (n <= 0);
		do {
			System.out.print("Introduce otro número entero positivo mayor que " + n + ": ");
			m = sc.nextInt();
			if (m <= 0) {
				System.out.println("Debe introducir un número positivo");
			} else if (n >= m) {
				System.out.println("Debe introducir un número mayor que " + n);
			}
		} while (m <= 0 || n >= m);

		// Mostrar los múltiplos de N desde 1 hasta M
		System.out.println("\nMúltiplos de  " + n + " desde 1 hasta " + m + " : ");
		for (i = 1; i <= m; i++) {
			if (i % n == 0) {
				System.out.println(i);
			}
		}

		// Ejercicio 12
		System.out.println("\nEjercicio 12");
		sc = new Scanner(System.in);
		System.out.print("Introduce un número (0 para acabar): ");
		n = sc.nextInt();
		while (n != 0) {

			if (n > 0) {
				System.out.print("Positivo");
			} else {
				System.out.print("Negativo");
			}
			if (n % 2 == 0) {
				System.out.println(" Par");
			} else {
				System.out.println(" Impar");
			}

			System.out.print("Introduce un número (0 para acabar): ");
			n = sc.nextInt();
		}

		sc = new Scanner(System.in);
		do {
			System.out.print("Introduce un número (0 para salir): ");
			n = sc.nextInt();
			if (n != 0) {
				if (n > 0) {
					System.out.print("Positivo");
				} else {
					System.out.print("Negativo");
				}
				if (n % 2 == 0) {
					System.out.println(" Par");
				} else {
					System.out.println(" Impar");
				}
			}
		} while (n != 0);

		sc = new Scanner(System.in);
		String res;
		do {
			System.out.print("Introduce un número (0 para salir): ");
			n = sc.nextInt();
			if (n != 0) {
				if (n > 0) {
					System.out.print("Positivo");
				} else {
					System.out.print("Negativo");
				}
				if (n % 2 == 0) {
					System.out.println(" Par");
				} else {
					System.out.println(" Impar");
				}
				System.out.println("Desea introducir mas numeros? (S/N)");
				res = sc.nextLine();
				if (res.equalsIgnoreCase("n")) {
					n = 0;
				}
			}
		} while (n != 0);

		// Ejercicio 13
		System.out.println("\nEjercicio 13");
		sc = new Scanner(System.in);
		int millas;
		double km;
		do {

			System.out.print("Introduce millas (0 para finalizar): ");
			millas = sc.nextInt();

			if (millas != 0) {
				km = millas * 1.6093;
				System.out.printf("%d millas equivalen a %.2f KM %n", millas, km);
			}

		} while (millas != 0);
	}
}