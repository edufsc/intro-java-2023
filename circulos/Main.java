package circulos;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(2.2);
		
		double areaCirculo = circulo.calcularArea();
		
		System.out.println(areaCirculo);
		
		System.out.println(circulo);

	}

}
