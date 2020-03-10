package ejemploColeccion;

public class Libro {

	public Libro(String titulo, String autor, int ISBN) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		
	}

	private String titulo;
	private String autor;
	private int ISBN;


	public String getDatos() {
		return "El título del libro es " + titulo + ". El autor es " + autor + ". Y el ISB es: " + ISBN ;
	}
	
	public boolean equals (Object obj) {
		
		if(obj instanceof Libro) {
			
			Libro otro = (Libro) obj;
			
			if(this.ISBN==otro.ISBN) {
				return true;
			} else {
				return false;
			}
			
		}
		else {
			return false;
		}
	}
	

}
