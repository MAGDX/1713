import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicherosEjemplos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * String ficheroNombrePersonas =
		 * "C:\\1713\\eclipse-workspace\\1713\\alumnos.txt"; DAOAlumnoArrayList dao =
		 * DAOAlumnoArrayList.getInstance(); dao.inicializarLista(); ObjectOutputStream
		 * oos = new ObjectOutputStream(new FileOutputStream(ficheroNombrePersonas));
		 * for (Alumno a : dao.getAll()) { oos.writeObject(a); } // oos.flush(); //
		 * Limpiamos el buffer para que no desborde // oos.reset(); oos.close();
		 * 
		 * // TODO leer objketo del fichero // @see
		 * http://www.chuidiang.org/java/ficheros/ObjetosFichero.php
		 * 
		 * ObjectInputStream ois = new ObjectInputStream(new
		 * FileInputStream(ficheroNombrePersonas)); // Se lee el primer objeto Object
		 * aux;
		 * 
		 * // Mientras haya objetos while ((aux = ois.readObject()) != null) { if (aux
		 * instanceof Alumno) { System.out.println(aux); // Se escribe en pantalla el
		 * objeto } }
		 * 
		 * ois.close();
		 */

		String lineaSimulada = "1;Manolo;12;verdes;mucho";

		String[] campos = lineaSimulada.split(";");
		System.out.println(campos);

		System.out.println("Fichero guardado");

		System.out.println("Ejercicio ficheros");

		Scanner sc = new Scanner(System.in);
		String ficheroNombre = "C:\\1713\\eclipse-workspace\\1713\\ejemplo.txt";

		System.out.println("Escribe algo: ");
		String linea1 = sc.nextLine();
		System.out.println("Escribe otra linea: ");
		String linea2 = sc.nextLine();

		sc.close();

		FileWriter fw = new FileWriter(ficheroNombre);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write(linea1);
		bf.newLine();
		bf.write(linea2);

		bf.close();

		BufferedReader br = new BufferedReader(new FileReader(ficheroNombre));

		String linea;
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}

		br.close();

		System.out.println("Terminamos de leer");

	}
}