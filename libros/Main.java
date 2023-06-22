package libros;

public class Main {

	public static void main(String[] args) {
		
		Libro miLibro = new Libro("El señor de los anillos", "Tolkien", 1941);
		Libro vacio = new Libro();
		vacio.setAutor("JK Rowlin");
		
		miLibro.obtenerInformacion();
		vacio.obtenerInformacion();
		
	}

}
