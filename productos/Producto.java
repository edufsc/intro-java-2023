package productos;

public class Producto {

	private String nombre;
	private int cantidad;
	private double precio;

	public Producto() {

	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = 0;
	}

	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double calcularDescuento(double porcentaje) {
		return this.precio * (porcentaje / 100);
	}

	public double calcularTotal(double porcentajeDescuento) {
		return this.cantidad * (this.precio - calcularDescuento(porcentajeDescuento));
	}

	public String toString() {
		return "Producto: " + this.nombre +
				"\nPrecio: " + this.precio +
				"�\nCantidad: " + this.cantidad;
	}

}
