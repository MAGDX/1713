package com.ipartek.formacion.utilidades;

public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			// billetes
			500, 200, 100, 50, 20, 10, 5,
			// monedas
			2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };

	/**
	 * Calcula las vueltas optimas para retornar el menor numero de billetes y
	 * monedas
	 * 
	 * @param importe   float costo de la compra
	 * @param entregado float dinero entregado para pagar dicha compra
	 * @return int[] cantidad de billetes y monedas retornadas
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe > entregado o importe < 0 o entregado < 0
	 */

	public static int[] vueltas(float importe, float entregado) throws Exception {

		int[] vueltas;

		if (importe < 0 || entregado < 0 || entregado < importe) {
			throw new Exception("Parametros de entrada no correctos");
		} else {
			vueltas = new int[BILLETES_MONEDAS.length];
			double resto = entregado - importe;
			int i = 0;
			while (resto != 0) {
				vueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
				resto = Math.round((resto % BILLETES_MONEDAS[i]) * 100.0f) / 100.0f;
				i++;
			}
		}
		return vueltas;
	}
}