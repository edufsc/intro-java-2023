package input;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		// inicializar un nuevo Scanner con la entrada standard
		Scanner teclado = new Scanner(System.in);

//		System.out.print("Introduce un número entero: ");

		// leer el siguiente entero que se envíe por teclado
//		int numero = teclado.nextInt();
//
//		System.out.println("Has introducido el " + numero);

//		System.out.print("Introduce un número decimal: ");
//		double decimal = teclado.nextDouble();
//
//		System.out.println("Has introducido el " + decimal);

//		System.out.print("¿Cómo te llamas? ");
//		String nombre = teclado.nextLine();
//
//		System.out.println("Hola, " + nombre);
		
		System.out.print("¿Quieres cerrar sesión? ");
		char respuesta = teclado.next().charAt(0);
		
		System.out.println("Respuesta: " + respuesta);

	}

}
