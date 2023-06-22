
public class Persona {

	// atributos o propiedades de clase
	private int edad;
	private String nombre;
	private String domicilio;

	// m�todo constructor
	public Persona() {
		this.edad = 0;
		this.nombre = "Sin nombre";
	}

	// podemos tener m�todos con el mismo nombre y distintos par�metros
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public void saludar() {
		System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " a�os");
	}

	// m�todo consultor de edad
	public int getEdad() {
		return edad;
	}

	// m�todo consultor de nombre
	public String getNombre() {
		return this.nombre;
	}

	// m�todo modificador de edad (void porque no tiene return)
	public void setEdad(int nuevadEdad) {
		this.edad = nuevadEdad;
	}

	// m�todo modificador de nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
}
