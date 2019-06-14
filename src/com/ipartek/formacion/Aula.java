package com.ipartek.formacion;

public class Aula {

	public static void main(String[] args) {
		// Declarar Array con nombre alumnos
		String[] clase = { "Andoni", "Arkaitz", "Eder S", "Veronica", "Asier", "Jon A", "Jose Luis",
				"Eder I", "Manuel", "Aritz", "Mournir", "Gaizka", "Borja", "Jon C", "Iker"};

		int num = (int) (Math.random() * clase.length);

		for (int i = 0; i < clase.length; i++) {
			if (num != i) {
				System.out.println(i + " " + clase[i]);
			} else {
				System.out.println("Y EL AFORTUNADO ES... " + clase[i]);
			}
		}

		// Generar numero aleatorio 0 - clase.length

		// Mostrar voluntario para leer
	}

}