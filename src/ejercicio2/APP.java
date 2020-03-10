package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class APP {

	public static void main(String[] args) {
		
		
		List<Caja<String>> caja1 = new ArrayList<>();
		List<Caja<Integer>> caja2 = new ArrayList<>();
		
		Almacen<String> almacen1; 
		Almacen<Integer> almacen2;
		

		caja1.add(new Caja<String>("Caja nº 1 del almacen"));
		caja1.add(new Caja<String>("Caja nº 2 del almacen"));
		
		almacen1 = new Almacen<String>(caja1);
		
		caja2.add(new Caja<Integer>(10));
		caja2.add(new Caja<Integer>(20));
		caja2.add(new Caja<Integer>(30));
		caja2.add(new Caja<Integer>(40));
		
		almacen2 = new Almacen<Integer>(caja2);
		
		System.out.println(almacen1.primerContenido());
		System.out.println(almacen1.ultimoContenido());		
		System.out.println(almacen2.primerContenido());
		System.out.println(almacen2.ultimoContenido());
	}

}
