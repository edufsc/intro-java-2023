package productos;

import java.util.Scanner;

public class CajaRegistradora {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion = -1;

		String nombreProducto = "";
		double precioProducto = -1;

		do {
			System.out.println("1. Manzanas - 0.20€ \n2. Peras - 0.30€\n3. Piñas  - 1.20€");
			System.out.print("Selecciona un producto: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				nombreProducto = "Manzana";
				precioProducto = 0.2;
				break;
			case 2:
				nombreProducto = "Pera";
				precioProducto = 0.3;
				break;
			case 3:
				nombreProducto = "Piña";
				precioProducto = 1.2;
				break;
			case 0:
				System.out.println("Hasta pronto!");
				break;
			default:
				opcion = -1;
				break;
			}

			// si el producto no existe
			if (opcion == -1) {
				System.out.println("El producto no existe...");
			} else if (opcion != 0) {
				System.out.print("Introduce la cantidad: ");
				int cantidad = teclado.nextInt();

				Producto producto = new Producto(nombreProducto, precioProducto, cantidad);
				System.out.println("\n" + producto + "\n");

				// calcular total después de pedir el descuento
				System.out.print("¿Qué descuento quieres aplicar? ");
				double porcentajeDescuento = teclado.nextDouble();

				double totalProducto = producto.calcularTotal(porcentajeDescuento);
				System.out.println("\n" + producto);

				if (porcentajeDescuento > 0) {
					System.out.println("-" + porcentajeDescuento + "%");
				}

				System.out.println("Total a pagar: " + totalProducto + "€\n");

			}

		} while (opcion != 0);

	}

}
