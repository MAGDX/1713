package com.ipartek.formacion;

public class Cerdo implements Ordenable {

	// Parametros
	private int kilos;
	private String nombre;

	// Constructores
	public Cerdo(int kilos, String nombre) {
		this.kilos = kilos;
		this.nombre = nombre;
	}

	// Getters y Setters
	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodos
	@Override
	public int getValor() {
		return this.kilos;
	}
}