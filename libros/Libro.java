package libros;

public class Libro {

	// clase con atributos
	private String titulo;
	private String autor;
	private int publicacion;

	Libro() {

	}

	// Constructor que inicialice los atributos
	Libro(String titulo, String autor, int publicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.publicacion = publicacion;
	}

	// m�todos consultores y modificadores (getters y setters)
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}

	// m�todo obtenerInformacion() que muestre toda la info del libro
	public void obtenerInformacion() {
		System.out.println(this.toString());
	}

	public String toString() {
		return "T�tulo: " + this.titulo + "\nAutor: " + this.autor + "\nA�o: " + this.publicacion;
	}
}
