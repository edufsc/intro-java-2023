package circulos;

public class Circulo {

	// crear atributos
	private double radio;

	// m�todos constructores
	public Circulo() {
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	// getters y setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// calcular area
	public double calcularArea() {
		return 3.14 * this.radio * this.radio;
	}

	public String toString() {
		return "C�rculo con radio " + this.radio;
	}

}
