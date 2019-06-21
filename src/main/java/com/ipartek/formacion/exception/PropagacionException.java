package com.ipartek.formacion.exception;

import com.ipartek.formacion.Perro;

public class PropagacionException {

	public static void main(String[] args) throws Exception  {
		System.out.println("Comienza main");
		metodoA();
		System.out.println("Termina main");
	}

	private static void metodoA() throws Exception {
		System.out.println("Comienza metodoA");
		
		Perro p = new Perro();
		p.setEdad(-1);
		System.out.println(p);
		metodoB();
		System.out.println("Termina metodoA");
	}

	private static void metodoB() {
		System.out.println("Comienza metodoB");

		System.out.println("Termina metodoB");
	}
}