package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class AppVoluntariosDAO {
	// Parametros
	private static final int OPCION_LISTAR = 1;
	private static final int OPCION_CREAR = 2;
	private static final int OPCION_BORRAR = 3;
	private static final int OPCION_BUSCAR = 4;
	private static final int OPCION_SALIR = 5;
	private static DAOAlumnoArrayList dao;
	private static Scanner sc;
	private static String ban = "";
	private static int ultimoId;

	// Main
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int op = 0;
		ban = "";
		dao = new DAOAlumnoArrayList();
		inicializarLista();
		while (op != 5) {
			op = pintarMenu();

			switch (op) {
			case OPCION_LISTAR:
				mostrarAlumnosOrdenados((ArrayList<Alumno>) dao.getAll());
				break;
			case OPCION_CREAR:
				anadirAlumno();
				break;
			case OPCION_BORRAR:
				borrarAlumno();
				break;
			case OPCION_BUSCAR:
				mostrarRandom();
				break;
			case OPCION_SALIR:
				break;
			default:
				System.out.println("Entrada no valida. Vuelva a intentarlo... Rango 1-5");
				break;
			}
		}
		System.out.println("Adios!");
		sc.close();
	}

	// Metodos
	public static void inicializarLista() {
		dao.insert(new Alumno(dao.getAll().size(), "Andoni"));
		dao.insert(new Alumno(dao.getAll().size(), "Arkaitz"));
		dao.insert(new Alumno(dao.getAll().size(), "Eder S"));
		dao.insert(new Alumno(dao.getAll().size(), "Veronica"));
		dao.insert(new Alumno(dao.getAll().size(), "Asier"));
		dao.insert(new Alumno(dao.getAll().size(), "Jon A"));
		dao.insert(new Alumno(dao.getAll().size(), "Jose Luis"));
		dao.insert(new Alumno(dao.getAll().size(), "Eder I"));
		dao.insert(new Alumno(dao.getAll().size(), "Manuel"));
		dao.insert(new Alumno(dao.getAll().size(), "Aritz"));
		dao.insert(new Alumno(dao.getAll().size(), "Mournir"));
		dao.insert(new Alumno(dao.getAll().size(), "Gaizka"));
		dao.insert(new Alumno(dao.getAll().size(), "Borja"));
		dao.insert(new Alumno(dao.getAll().size(), "Jon C"));
		dao.insert(new Alumno(dao.getAll().size(), "Ander"));
		ultimoId = dao.getAll().size();
	}

	public static int pintarMenu() {
		int op;

		System.out.println("\nMENU:");
		System.out.println("1) Listar Alumnos en Ranking");
		System.out.println("2) Crear Alumno");
		System.out.println("3) Eliminar Alumno");
		System.out.println("4) Buscar Voluntario");
		System.out.println("5) Salir");
		try {
			op = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Valor incorrecto. Rango 1-5.");
			op = pintarMenu();
		}
		return op;
	}

	public static void mostrarAlumnosOrdenados(ArrayList<Alumno> lista) {
		Collections.sort(lista);

		System.out.println("Ranking");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + 1 + ": " + lista.get(i).getNombre() + " " + lista.get(i).getRepeticiones());
		}
	}

	public static void anadirAlumno() {
		try {
			System.out.println("Inserte el nombre del alumno: ");
			dao.insert(new Alumno(ultimoId, sc.nextLine()));
			ultimoId++;
		} catch (Exception e) {
			System.out.println("Dato no valido.");
			anadirAlumno();
		}
	}

	public static void borrarAlumno() {
		mostrarAlumnos();
		System.out.println("¿Que Alumno desea eliminar?");
		try {
			int pos = Integer.parseInt(sc.nextLine());
			Alumno aEliminar = dao.getAll().get(pos - 1);
			dao.delete(aEliminar.getId());
		} catch (Exception e) {
			borrarAlumno();
		}
	}

	public static void mostrarAlumnos() {
		for (int i = 0; i < dao.getAll().size(); i++) {
			System.out.println(i + 1 + ": " + dao.getAll().get(i).getNombre());
		}
	}

	public static void mostrarRandom() {
		int aux;
		do {
			aux = (int) (Math.random() * dao.getAll().size());
			if (!dao.getAll().get(aux).getNombre().equalsIgnoreCase(ban)) {
				dao.getAll().get(aux).sumarRepeticion();

				for (int i = 0; i < dao.getAll().size(); i++) {
					if (aux != i) {
						System.out.println(i + 1 + ": " + dao.getAll().get(i).getNombre());
					} else {
						System.out.println("Y EL AFORTUNADO ES... " + dao.getAll().get(i).getNombre());
					}
				}
			}
		} while (dao.getAll().get(aux).getNombre().equalsIgnoreCase(ban));
		ban = dao.getAll().get(aux).getNombre();
	}
}