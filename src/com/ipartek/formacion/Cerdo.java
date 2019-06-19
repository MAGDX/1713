package com.ipartek.formacion;

public class Cerdo implements Ordenable {
	// Parametros
	int kilos;
	String nombre;

	// Constructores
	public Cerdo(int kilos, String nombre) {
		this.kilos = kilos;
		this.nombre = nombre;
	}

	// Metodos
	@Override
	public int getValor() {
		return this.kilos;
	}
}