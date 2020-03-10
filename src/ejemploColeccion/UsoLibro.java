package ejemploColeccion;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("Rosas negras en Kosovo", "Jesus Cortes", 25);
		
		Libro libro2 = new Libro("Rosas negras en Kosovo", "Jesus Cortes", 25);
		
	
		if(libro1.equals(libro2)) {
			
			System.out.println("Es el mismo libro");
			
		} else {
			System.out.println("No es el mismo libro");
		}
		
	}

}
