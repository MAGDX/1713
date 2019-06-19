package com.ipartek.formacion;

public class Diamante implements Ordenable {
	// Parametros
	int quilates;

	// Constructores
	public Diamante(int quilates) {
		this.quilates = quilates;
	}

	// Metodos
	@Override
	public int getValor() {
		return this.quilates;
	}
}