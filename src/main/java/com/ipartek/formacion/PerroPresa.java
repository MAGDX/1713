package com.ipartek.formacion;

public class PerroPresa extends Perro {
	
	// Atributos
	int ataque;

	// Constructores
	public PerroPresa() {}
	
	public PerroPresa(String pNombre, int pEdad, String pRaza, boolean pVacunado, int pAtaque) {
		super(pNombre, pEdad, pRaza, pVacunado);
		this.ataque = pAtaque;
	}

	// Getters y Setters
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public void atacar()
	{
		System.out.println("GRRRRRRRRRR QUE TE MUERDO!!!!");
	}
}