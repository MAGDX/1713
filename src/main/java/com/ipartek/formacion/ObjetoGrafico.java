package com.ipartek.formacion;

public abstract class ObjetoGrafico {
	// Parametros
	int centro[];

	// Constructores
	public ObjetoGrafico() {
		this.centro = new int[] { 0, 0 };
	}

	// Metodos
	public void mover(int x, int y) {
		System.out.println("Movemos el objeto a su nueva posicion");
		centro[0] = x;
		centro[1] = y;
	}

	public abstract void dibujar(); // prototipo

	public abstract int area(); // prototipo
}