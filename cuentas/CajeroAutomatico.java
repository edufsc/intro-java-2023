package cuentas;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria();

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número de cuenta: ");
		String numeroCuenta = teclado.nextLine();

		System.out.print("Introduce el saldo inicial: ");
		double saldo = teclado.nextDouble();

		cuenta.setNumeroCuenta(numeroCuenta);
		cuenta.setSaldo(saldo);

		// al imprimir un objeto se utiliza toString de forma implícita
		System.out.println(cuenta);

		int opcion = -1;

		do {
			System.out.println("\n1. Ver saldo\n2. Hacer ingreso\n3. Sacar dinero\n0. Salir\n");
			System.out.print("Opción: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(cuenta);
				break;
			case 2:
				System.out.print("Introduce tu PIN: ");
				String pin = teclado.next();
				// para comparar objetos (como Strings) se utiliza equals
				if (pin.equals(cuenta.getPin())) {
					System.out.print("Introduce el importe a ingresar: ");
					double ingreso = teclado.nextDouble();
					cuenta.ingresar(ingreso);
					System.out.println("Se ha realizado un ingreso de " + ingreso + "€");
				} else {
					System.out.println("PIN INCORRECTO");
				}

				break;
			case 3:
				System.out.print("Introduce tu PIN: ");
				pin = teclado.next();
				if (pin.equals(cuenta.getPin())) {
					System.out.print("Introduce el importe a retirar: ");
					double dinero = teclado.nextDouble();
					cuenta.sacar(dinero);
					System.out.println("Se han retirado " + dinero + "€");
				} else {
					System.out.println("PIN INCORRECTO");
				}
				break;
			case 0:
				System.out.println("\n¡Hasta la próxima!");
				break;
			default:
				System.out.println("Opción desconocida...");
			}

		} while (opcion != 0);

		// es recomendable cerrar el Scanner cuando no vamos a utilizarlo
		teclado.close();

	}

}
