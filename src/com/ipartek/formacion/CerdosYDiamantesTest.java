package com.ipartek.formacion;

import java.util.ArrayList;

import org.junit.Test;

public class CerdosYDiamantesTest {

	@Test
	public void test() {
		ArrayList<Ordenable> lista = new ArrayList<Ordenable>();
		
		int contD = 0;
		Cerdo c1 = new Cerdo(110, "Alfredo");
		Diamante d1 = new Diamante(16);
		Cerdo c2 = new Cerdo(5, "Eustaquio");
		Diamante d2 = new Diamante(1);
		Cerdo c3 = new Cerdo(6, "Godofredo");
		Diamante d3 = new Diamante(9);
		Cerdo c4 = new Cerdo(2, "Wolframio");
		Diamante d4 = new Diamante(160);
		Cerdo c5 = new Cerdo(201, "");
		Diamante d5 = new Diamante(96);
		Cerdo c6 = new Cerdo(-5, "");
		Diamante d6 = new Diamante(-71);
		Cerdo c7 = new Cerdo(64, "");
		Diamante d7 = new Diamante(37);
		Cerdo c8 = new Cerdo(91, "");
		Diamante d8 = new Diamante(16);
		Cerdo c9 = new Cerdo(32, "");
		Diamante d9 = new Diamante(15);
		Cerdo c10 = new Cerdo(19, "");
		Diamante d10 = new Diamante(6);

		lista.add(c1);
		lista.add(d1);
		lista.add(c2);
		lista.add(d2);
		lista.add(c3);
		lista.add(d3);
		lista.add(c4);
		lista.add(d4);
		lista.add(c5);
		lista.add(d5);
		lista.add(c6);
		lista.add(d6);
		lista.add(c7);
		lista.add(d7);
		lista.add(c8);
		lista.add(d8);
		lista.add(c9);
		lista.add(d9);
		lista.add(c10);
		lista.add(d10);
		// lista.add(new Alumno("pepe"));
		// lista.add(new Integer(8));

		for (Ordenable elemento : lista) {
			if (elemento instanceof Diamante) {
				Diamante diamante = (Diamante) elemento;
				contD++;
				System.out.println("Diamante " + contD + " tiene " + diamante.getValor() + " quilates.");
			}
			if (elemento instanceof Cerdo) {
				Cerdo cerdo = (Cerdo) elemento;
			}
		}
	}
}