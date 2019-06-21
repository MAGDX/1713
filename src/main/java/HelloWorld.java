import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person();
		p1.setNombre("Eustaquio");
		System.out.println(p1.saludar());

		Perro c1 = new Perro();
		c1.setEdad(-8);
		c1.setNombre("Zuri");
		c1.setRaza("Pastor vasco");
		c1.setVacunado(true);
		System.out.println(c1.toString());

		Perro c2 = new Perro();
		c2.setEdad(6);
		c2.setNombre("Ody");
		c2.setRaza("Yorkshire");
		c2.setVacunado(true);
		System.out.println(c2.toString());

		Perro c3 = new Perro();
		c3.setEdad(0);
		c3.setNombre("Nala");
		c3.setRaza("Comun");
		c3.setVacunado(false);
		System.out.println(c3.toString());

		PerroPresa pp1 = new PerroPresa();
		pp1.setNombre("Dut");
		pp1.atacar();
	}

}