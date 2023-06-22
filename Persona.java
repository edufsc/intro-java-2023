
public class Persona {

	// atributos o propiedades de clase
	private int edad;
	private String nombre;
	private String domicilio;

	// método constructor
	public Persona() {
		this.edad = 0;
		this.nombre = "Sin nombre";
	}

	// podemos tener métodos con el mismo nombre y distintos parámetros
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public void saludar() {
		System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años");
	}

	// método consultor de edad
	public int getEdad() {
		return edad;
	}

	// método consultor de nombre
	public String getNombre() {
		return this.nombre;
	}

	// método modificador de edad (void porque no tiene return)
	public void setEdad(int nuevadEdad) {
		this.edad = nuevadEdad;
	}

	// método modificador de nombre
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
