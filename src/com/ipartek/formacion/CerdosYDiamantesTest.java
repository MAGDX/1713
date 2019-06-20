package com.ipartek.formacion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class CerdosYDiamantesTest {

	@Test
	public void test() {
		ArrayList<Ordenable> lista = new ArrayList<Ordenable>();

		int contD = 0;
		Cerdo c1 = new Cerdo(110, "Alfredo");
		Diamante d1 = new Diamante(16, "Rojo");
		Cerdo c2 = new Cerdo(5, "Eustaquio");
		Diamante d2 = new Diamante(1, "Azul");
		Cerdo c3 = new Cerdo(6, "Godofredo");
		Diamante d3 = new Diamante(9, "Verde");
		Cerdo c4 = new Cerdo(2, "Wolframio");
		Diamante d4 = new Diamante(160, "Negro");
		Cerdo c5 = new Cerdo(201, "Marciano");
		Diamante d5 = new Diamante(96, "Gris");
		Cerdo c6 = new Cerdo(-5, "Gerundino");
		Diamante d6 = new Diamante(-71, "Amarillo");
		Cerdo c7 = new Cerdo(64, "Brave");
		Diamante d7 = new Diamante(37, "Naranja");
		Cerdo c8 = new Cerdo(91, "Peggy");
		Diamante d8 = new Diamante(16, "Morado");
		Cerdo c9 = new Cerdo(32, "Tiberio");
		Diamante d9 = new Diamante(15, "Rosa");
		Cerdo c10 = new Cerdo(19, "Felipez");
		Diamante d10 = new Diamante(6, "Fucsia");

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

		for (Ordenable elemento : lista) {
			if (elemento instanceof Diamante) {
				Diamante diamante = (Diamante) elemento;
				contD++;
				System.out.println("Diamante " + contD + " tiene " + diamante.getValor() + " quilates.");
			}
			if (elemento instanceof Cerdo) {
				Cerdo cerdo = (Cerdo) elemento;
				System.out.println("El cerdo " + cerdo.getNombre() + " pesa " + cerdo.getValor() + " kilos.");
			}
		}
		
		Collections.sort(lista, new ComparadorCerdosDiamantes());
		
		assertEquals(-71, lista.get(0).getValor());
		assertEquals(-5, lista.get(1).getValor());
		assertEquals(1, lista.get(2).getValor());
		assertEquals(2, lista.get(3).getValor());
		assertEquals(5, lista.get(4).getValor());
		assertEquals(6, lista.get(5).getValor());
		assertEquals(6, lista.get(6).getValor());
		assertEquals(9, lista.get(7).getValor());
		assertEquals(15, lista.get(8).getValor());
		assertEquals(16, lista.get(9).getValor());
		assertEquals(16, lista.get(10).getValor());
		assertEquals(19, lista.get(11).getValor());
		assertEquals(32, lista.get(12).getValor());
		assertEquals(37, lista.get(13).getValor());
		assertEquals(64, lista.get(14).getValor());
		assertEquals(91, lista.get(15).getValor());
		assertEquals(96, lista.get(16).getValor());
		assertEquals(110, lista.get(17).getValor());
		assertEquals(160, lista.get(18).getValor());
		assertEquals(201, lista.get(19).getValor());
	}
}