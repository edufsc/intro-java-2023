package cuentas;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Vamos a registrar una cuenta bancaria...\n");
		System.out.print("Introduce el número de cuenta: ");
		String numeroCuenta = teclado.nextLine();

		System.out.print("Introduce el saldo inicial: ");
		double saldo = teclado.nextDouble();

		cuenta.setNumeroCuenta(numeroCuenta);
		cuenta.setSaldo(saldo);

		System.out.println(cuenta + "\n");

		int opcion = -1;

		do {
			System.out.println("\n1. Ver saldo\n2. Hacer ingreso\n0. Salir\n");
			System.out.print("Opción: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\n" + cuenta);
				break;
			case 2:
				System.out.print("\nIntroduce el saldo a ingresar: ");
				double ingreso = teclado.nextDouble();
				cuenta.ingresar(ingreso);
				break;
			case 0:
				System.out.println("\nHasta pronto!");
				break;
			default:
				System.out.println("Opción desconocida. Prueba de nuevo...\n");
				break;
			}
		} while (opcion != 0);

	}

}
