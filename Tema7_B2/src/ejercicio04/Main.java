package ejercicio04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Esto es una clase Disco. Dentro hay que crear 10 objetos de tipo Disco.
		Disco[] arrayDiscos = new Disco[10];
		Disco d = new Disco();
		int opc, contador;

		// Con el for recorremos el array y creamos un objeto por cada posición.
		for (int i = 0; i < arrayDiscos.length; i++) {

			arrayDiscos[i] = new Disco();

		}

		// System.out.println(Arrays.toString(arrayDiscos));

		do {

			System.out.println("Introduzca una opción:");
			opc = sc.nextInt();

			switch (opc) {

			case 1 -> d.listado(arrayDiscos);

			case 2 -> {
				contador = d.posicionLibre(arrayDiscos);

				if (contador >= 0) {
					d.nuevoDisco(arrayDiscos, contador);
				} else {
					System.out.println("No hay discos libres.");

				}
			}

			case 3 -> d.modificarDisco(arrayDiscos);

			case 4 -> d.borrar(arrayDiscos);

			case 5 -> {

				System.out.println("SALIENDO...");
				break;
			}

			default -> System.out.println("Ha introducido un valor no válido.");

			}
		} while (opc != 5);

	}

}
