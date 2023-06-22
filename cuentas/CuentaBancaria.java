package cuentas;

public class CuentaBancaria {

	private String numeroCuenta;
	private double saldo;
	private String pin;

	public CuentaBancaria() {
		this.pin = "0000";
	}

	public CuentaBancaria(String numero, double saldo) {
		this.numeroCuenta = numero;
		this.saldo = saldo;
		this.pin = "0000";
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void ingresar(double dinero) {
		this.saldo += dinero;
	}

	public void sacar(double dinero) {
		this.saldo -= dinero;
	}

	public String toString() {
		return "#" + this.numeroCuenta + " Saldo: " + this.saldo + "€";
	}

	public boolean equals(Object o) {
		// convertir a CuentaBancaria
		CuentaBancaria aComparar = (CuentaBancaria) o;
		// hacer comparaciones
		boolean cuentaIgual = this.numeroCuenta == aComparar.numeroCuenta;
		boolean saldoIgual = this.saldo == aComparar.saldo;
		// retornar la suma de las comparaciones
		return cuentaIgual && saldoIgual;
	}

}
