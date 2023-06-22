package input;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		int numeroCorrecto = 42; // N�mero que se debe adivinar
		Scanner scanner = new Scanner(System.in);
		int numeroIngresado = -1;

		System.out.println("�Adivina el n�mero!");
		do {
			System.out.print("Ingresa un n�mero: ");
			numeroIngresado = scanner.nextInt();
			if (numeroIngresado == numeroCorrecto) {
				System.out.println("�Felicidades! Adivinaste el n�mero correcto.");
			} else {
				System.out.println("Lo siento, el n�mero ingresado no es correcto.");
			}
		} while (numeroIngresado != numeroCorrecto);

		scanner.close();

	}

}
