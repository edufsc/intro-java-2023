
public class Rectangulo {

	// atributo base y atributo altura de tipo decimal
	private double base;
	private double altura;

	// constructor por defecto
	public Rectangulo() {
	}

	// constructor al que le indiquemos base y altura
	public Rectangulo(double base, double altura) {
		// inicializar los atributos base y altura
		this.base = base;
		this.altura = altura;
	}

	// métodos consultores
	public double getBase() {
		return this.base;
	}

	public double getAltura() {
		return this.altura;
	}

	// métodos modificadores
	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// método para calcular el area (base x altura)
	// ej. calcularArea()
	// debe retornar un valor
	public double calcularArea() {
		return this.base * this.altura;
	}

	// calcularPerimetro() (suma de los lados)
	public double calcularPerimetro() {
		return 2 * this.base + 2 * this.altura;
	}

	// hacerCuadrado(double lado)
	public void hacerCuadrado(double lado) {
		this.base = lado;
		this.altura = lado;
	}

	// dibujar() imprimir el rectángulo con *
	public void dibujar() {
		for (int i = 0; i < this.altura; i++) {
			for (int j = 0; j < this.base; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

	// para convertir objetos de esta clase a su representación en texto
	// es un método que ya existe, lo sobreescribimos
	public String toString() {
		String textoRectangulo = "Base: " + this.base + " Altura: " + this.altura;
		return textoRectangulo;
	}
	
	public boolean equals(Object o) {
		// convertir "o" a tipo Rectángulo
		Rectangulo rectangulo = (Rectangulo) o;
		boolean mismaAltura = this.altura == rectangulo.altura;
		boolean mismaBase = this.base == rectangulo.base;
		return mismaAltura && mismaBase;
	}
	
	

}
