package com.ipartek.formacion.exception;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) {
		System.out.println("------- CREAR VIDEO YOUTUBE -------");
		System.out.println("-----------------------------------");

		Scanner sc = new Scanner(System.in);

		String titulo;
		String codigo;
		boolean repetir = true;
		Youtube video = null;

		while (repetir) {
			System.out.println("Inserte el titulo del video, longitud [2,150]: ");
			titulo = sc.nextLine();

			System.out.println("Inserte el codigo del video, longitud [11]: ");
			codigo = sc.nextLine();

			try {
				video = new Youtube(codigo, titulo);
				repetir = false;
			} catch (Exception e) {
				System.out.println("Error " + e.getMessage());
			}
		}

		System.out.println("Video creado correctamente.");
		System.out.println(video);

		sc.close();
	}
}