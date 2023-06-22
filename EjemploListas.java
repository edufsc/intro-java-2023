import java.util.ArrayList;
import java.util.List;

public class EjemploListas {

	public static void main(String[] args) {

		// crear lista de Strings
		List<String> listaTextos = new ArrayList<>();

		// a�adir elementos
		listaTextos.add("Un texto");
		listaTextos.add("Otro texto");

		// cantidad de elementos en la lista
		int cantidad = listaTextos.size();

		// recuperar el primer elemento
		String primerElemento = listaTextos.get(0);

		// eliminar el segundo elemento
		String elementoEliminado = listaTextos.remove(1);

		System.out.println(listaTextos);

		// comprobar si est� vac�a
		boolean estaVacia = listaTextos.isEmpty();

		List<Integer> listaNumeros = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			listaNumeros.add(i);
		}

		// al ser una lista de objetos, podemos a�adir "null"
		listaNumeros.add(null);

		System.out.println(listaNumeros);

		// recorrer todos los elementos
		// y ejecutar una funci�n para cada uno
		listaNumeros.forEach(numero -> {
			System.out.println(numero);
		});

		listaNumeros.clear();

		// rellenamos la lista con 10 n�meros aleatorios
		for (int i = 0; i < 10; i++) {
			listaNumeros.add((int) (Math.random() * 10 + 1));
		}

		System.out.println(listaNumeros);

		// buscar un n�mero en la lista
		int numeroObjetivo = 7;
		int encontrado = 0;
		listaNumeros.forEach(numero -> {
			if (numero == numeroObjetivo) {
				System.out.println("Encontrado");
			}
		});

		// buscar y reemplazar numeroObjetivo por nuevoNumero
		int nuevoNumero = 4;
		for (int i = 0; i < listaNumeros.size(); i++) {
			Integer numero = listaNumeros.get(i);
			if (numero == numeroObjetivo) {
				
			}
		}

		System.out.println(listaNumeros);

	}

}
