package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T> implements ContGenerico<T> {
	
	List<Caja<T>> stock;

	public Almacen(List<Caja<T>> lista) {
		
		if(lista == null || lista.size() == 0) {
			throw new IllegalArgumentException("Escribe al menos un valor");
		}
		
		stock = new ArrayList<Caja<T>>(lista);
		
		
		
	}

	@Override
	public T primerContenido() {
		// TODO Auto-generated method stub
		return stock.get(0).getElemento1();
	}

	@Override
	public T ultimoContenido() {
		return stock.get(stock.size() - 1).getElemento1();
	}

}
