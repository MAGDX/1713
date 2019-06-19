package com.ipartek.formacion;

import java.util.ArrayList;

import java.util.Collections;

public class Aula {
	// Parametros
	private ArrayList<Alumno> alumnos;

	// Constructores
	public Aula() {
		this.alumnos = new ArrayList<Alumno>();
		this.alumnos = rellenar();
	}

	public static void main(String[] args) {
		Aula a = new Aula();
		
		// Generar numero aleatorio 0 - clase.length
		int num = (int) (Math.random() * a.getTamano());
		
		a.mostrarRandom(num);
	}

	public void mostrarRandom(int num) {
		// Declarar Array con nombre alumnos
		ArrayList<Alumno> alumnos = getAlumnos();

		// Mostrar voluntario para leer
		for (int i = 0; i < alumnos.size(); i++) {
			if (num != i) {
				System.out.println(i + 1 + ": " + alumnos.get(i).getNombre());
			} else {
				System.out.println("Y EL AFORTUNADO ES... " + alumnos.get(i).getNombre());
			}
		}
	}

	public void mostrarAlumnos() {
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(i + 1 + ": " + alumnos.get(i).getNombre());
		}
	}
	
	public void mostrarAlumnosOrdenados() {
		Collections.sort(alumnos);
		
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(i + 1 + ": " + alumnos.get(i).getNombre() + " " + alumnos.get(i).getRepeticiones());
		}
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public ArrayList<Alumno> rellenar() {
		alumnos.add(new Alumno("Andoni"));
		alumnos.add(new Alumno("Arkaitz"));
		alumnos.add(new Alumno("Eder S"));
		alumnos.add(new Alumno("Veronica"));
		alumnos.add(new Alumno("Asier"));
		alumnos.add(new Alumno("Jon A"));
		alumnos.add(new Alumno("Jose Luis"));
		alumnos.add(new Alumno("Eder I"));
		alumnos.add(new Alumno("Manuel"));
		alumnos.add(new Alumno("Aritz"));
		alumnos.add(new Alumno("Mournir"));
		alumnos.add(new Alumno("Gaizka"));
		alumnos.add(new Alumno("Borja"));
		alumnos.add(new Alumno("Jon C"));
		alumnos.add(new Alumno("Ander"));
		return alumnos;
	}

	public void borrarAlumno(int i) {
		this.alumnos.remove(i);
	}

	public void anadirAlumno(String nombre) {
		this.alumnos.add(new Alumno(nombre));
	}
	public int getTamano() {
		return this.alumnos.size();
	}
}