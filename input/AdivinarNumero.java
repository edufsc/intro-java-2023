package input;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {

		// para leer por teclado
		Scanner teclado = new Scanner(System.in);

		int numeroObjetivo = (int) (Math.random() * 10 + 1);

		int numeroUsuario = -1;

		do {

			System.out.print("Introduce un número: ");
			numeroUsuario = teclado.nextInt();

			if (numeroObjetivo != numeroUsuario) {
				System.out.println("Inténtalo otra vez...");
			} else {
				System.out.println("Acertaste!!");
			}

		} while (numeroObjetivo != numeroUsuario);
		
		// al terminar cerramos el scanner
		teclado.close();
	}

}
