package input;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		int numeroCorrecto = 42; // Número que se debe adivinar
		Scanner scanner = new Scanner(System.in);
		int numeroIngresado = -1;

		System.out.println("¡Adivina el número!");
		do {
			System.out.print("Ingresa un número: ");
			numeroIngresado = scanner.nextInt();
			if (numeroIngresado == numeroCorrecto) {
				System.out.println("¡Felicidades! Adivinaste el número correcto.");
			} else {
				System.out.println("Lo siento, el número ingresado no es correcto.");
			}
		} while (numeroIngresado != numeroCorrecto);

		scanner.close();

	}

}
