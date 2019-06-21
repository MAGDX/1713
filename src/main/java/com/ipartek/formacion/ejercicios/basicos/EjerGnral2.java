package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class EjerGnral2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int aux;
		int cifras = 0;
		
		System.out.println("Inserte un numero: ");
		n = sc.nextInt();
		aux = n;
		
		do{
			if(aux/10!=0) {
				aux = aux/10;
				cifras++;
			}
		}while((aux/10)!=0);
		
		System.out.println("El numero " + n + " tiene " + (cifras+1) + " cifras.");
		sc.close();
	}
}