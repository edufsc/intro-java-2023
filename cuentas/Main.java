package cuentas;

public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("ES243534534564536", 100);
		
		System.out.println(cuenta);
		
		cuenta.ingresar(45);
		
		System.out.println(cuenta);
		
		CuentaBancaria cuenta2 = new CuentaBancaria("ES24353453445456", 34);
		
		if(cuenta.equals(cuenta2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintas");
		}

	}

}
