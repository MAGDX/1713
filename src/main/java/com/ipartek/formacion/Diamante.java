package com.ipartek.formacion;

public class Diamante implements Ordenable {

	// Parametros
	private int quilates;
	private String color;

	// Constructores
	public Diamante(int quilates, String color) {
		super();
		this.quilates = quilates;
		this.color = color;
	}

	// Getters y Setters
	public int getQuilates() {
		return quilates;
	}

	public void setQuilates(int quilates) {
		this.quilates = quilates;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Metodos
	@Override
	public int getValor() {
		return this.quilates;
	}
}