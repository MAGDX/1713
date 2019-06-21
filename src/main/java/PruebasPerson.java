import com.ipartek.formacion.Employee;
import com.ipartek.formacion.Person;

public class PruebasPerson {

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p);

		Person p2 = new Person("Pepe", 23, 'h');
		System.out.println(p2);

		Employee e = new Employee();
		System.out.println(e);

		Employee e2 = new Employee("Manolito", 44, 'h', 1.200f);
		System.out.println(e2);

		// Crear 10 Youtubers Famosos
		Employee y1 = new Employee("Ryan ToysReview", 8, 'h', 22000000);
		Employee y2 = new Employee("Jake Logan", 21, 'h', 21600000);
		Employee y3 = new Employee("Dude Perfect", 0, 'h', 20000000);
		Employee y4 = new Employee("DanTDM", 27, 'h', 18500000);
		Employee y5 = new Employee("Jeffree Star", 33, 'h', 18000000);
		Employee y6 = new Employee("Markiplier", 29, 'h', 17500000);
		Employee y7 = new Employee("Vanoss Gaming", 26, 'h', 17000000);
		Employee y8 = new Employee("Jacksepticeye", 28, 'h', 16000000);
		Employee y9 = new Employee("PewDiePie", 29, 'h', 15500000);
		Employee y10 = new Employee("Logan Paul", 23, 'h', 14500000);

		// Inicializar Array de 10 posiciones
		Employee[] youtubers = new Employee[10];

		// Rellenar el array
		youtubers[0] = y1;
		youtubers[1] = y2;
		youtubers[2] = y3;
		youtubers[3] = y4;
		youtubers[4] = y5;
		youtubers[5] = y6;
		youtubers[6] = y7;
		youtubers[7] = y8;
		youtubers[8] = y9;
		youtubers[9] = y10;

		// Mostramos la lista de youtubers
		System.out.println("\nLista de youtubers:");
		
		//For standard
		for (int i = 0; i < youtubers.length; i++) {
			System.out.println((i + 1) + ": " + youtubers[i]);
		}
		
		//For Each
		for(Employee emp : youtubers)
		{
			System.out.println(emp);
		}
	}
}