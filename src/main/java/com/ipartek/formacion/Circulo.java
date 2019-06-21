package com.ipartek.formacion;

public class Circulo extends ObjetoGrafico {
	//Parametros
	int radio;
	
	//Constructores
	public Circulo() {
		this.radio = 0;
	}
	
	//Metodos
	@Override
	public void dibujar() {
		
	}

	@Override
	public int area() {
		return (int)(Math.PI*Math.pow(radio, 2));
	}
}