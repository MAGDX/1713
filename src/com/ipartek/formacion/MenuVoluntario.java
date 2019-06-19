package com.ipartek.formacion;

import java.util.Scanner;

public class MenuVoluntario {
	private static final int OPCION_LISTAR = 1;
	private static final int OPCION_CREAR = 2;
	private static final int OPCION_BORRAR = 3;
	private static final int OPCION_BUSCAR = 4;
	private static final int OPCION_SALIR = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		int ban = -1;
		Aula a = new Aula();
		while (op != 5) {
			System.out.println("\nMENU:");
			System.out.println("1) Listar Alumnos en Ranking");
			System.out.println("2) Crear Alumno");
			System.out.println("3) Eliminar Alumno");
			System.out.println("4) Buscar Voluntario");
			System.out.println("5) Salir");
			op = Integer.parseInt(sc.nextLine());

			switch (op) {
			case OPCION_LISTAR:
				System.out.println("Ranking");
				a.mostrarAlumnosOrdenados();
				break;
			case OPCION_CREAR:
				System.out.println("Inserte el nombre del alumno: ");
				a.anadirAlumno(sc.nextLine());
				break;
			case OPCION_BORRAR:
				a.mostrarAlumnos();
				System.out.println("¿Que Alumno desea eliminar?");
				a.borrarAlumno((Integer.parseInt(sc.nextLine()) - 1));
				break;
			case OPCION_BUSCAR:
				int aux;
				do {
					aux = (int) (Math.random() * a.getTamano());
					if (aux != ban) {
						ban = aux;
						aux = -1;
						a.getAlumnos().get(ban).sumarRepeticion();
						a.mostrarRandom(ban);
					}
				} while (aux == ban);
				break;
			case OPCION_SALIR:
				break;
			default:
				System.out.println("Numero incorrecto. Rango 1-5");
				break;
			}
		}
		System.out.println("Adios!");
		sc.close();
	}
}