package productos;

public class Main {

	public static void main(String[] args) {

		Producto manzanas = new Producto("Manzana", 0.2, 5);

		System.out.println(manzanas);

		System.out.println(manzanas.calcularTotal(0) + "€");
		System.out.println(manzanas.calcularTotal(20) + "€");

	}

}
