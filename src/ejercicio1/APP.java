package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;

public class APP {

	public static void main(String[] args) {

		Collection<Caja<String>> caja1 = new ArrayList<Caja<String>>();
		Collection<Caja<Integer>> caja2 = new ArrayList<Caja<Integer>>();
		
		String concat = "";
		int suma = 1;
		

		for (int i = 1; i < 6; i++) {
			caja1.add(new Caja<String>("Caja nº " + i + " "));
		}
		

		for (Caja<String> s : caja1) {
			System.out.println(s.getElemento1());
			concat += s.getElemento1(); 
		}
		

		System.out.println(concat + " ");

		for (int i = 0; i < 5; i++) {
			caja2.add(new Caja<Integer>((int)i));
		}

		for (Caja<Integer> l : caja2) {
			System.out.println(l.getElemento1());
			suma += l.getElemento1();
		}
		System.out.println(suma);
	}
	
	}

	



