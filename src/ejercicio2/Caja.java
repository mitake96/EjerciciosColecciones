package ejercicio2;

public class Caja<T>{

	private T elemento1;
	
	public Caja(T elemento1) {
		
		this.elemento1 = elemento1;
		
	}
	
	public void setElemento1(T elemento1) {
		
		this.elemento1 = elemento1;
		
	}
	
	public T getElemento1() {
		
		return elemento1;
	}
		
		

}
