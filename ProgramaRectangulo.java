
public class ProgramaRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(10, 5);

		System.out.println("Base: " + r1.getBase() + " Altura: " + r1.getAltura());

		Rectangulo r2 = new Rectangulo();

		System.out.println("Base: " + r2.getBase() + " Altura: " + r2.getAltura());

//		r1.dibujar();

		Rectangulo r3 = new Rectangulo(20, 10);
		r3.dibujar();
		
		r3.hacerCuadrado(10);
		
		r3.dibujar();
		
		System.out.println(r3);
		
		// esto no sirve para objetos, solo tipos primitivos (int, double, boolean...)
		if(r2==r3) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}
		
		// para comparar objetos usamos equals
		if(r2.equals(r3)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}

	}

}
