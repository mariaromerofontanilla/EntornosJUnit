package ejercicio05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Poligono[] poligonos = new Poligono[10]; // Suponiendo que se pueden almacenar hasta 10 polígonos
		int opcion;
		int contadorPoligonos = 0;

		do {
			System.out.println("\nMenú:");
			System.out.println("1. Introducir triángulo.");
			System.out.println("2. Introducir rectángulo.");
			System.out.println("3. Mostrar contenido del array.");
			System.out.println("4. Salir.");
			System.out.print("Elija una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				if (contadorPoligonos < 10) {
					poligonos[contadorPoligonos] = crearTriangulo(scanner);
					contadorPoligonos++;
					System.out.println("Triángulo añadido correctamente.");
				} else {
					System.out.println("Ya has alcanzado el límite de polígonos.");
				}
				break;
			case 2:
				if (contadorPoligonos < 10) {
					poligonos[contadorPoligonos] = crearRectangulo(scanner);
					contadorPoligonos++;
					System.out.println("Rectángulo añadido correctamente.");
				} else {
					System.out.println("Ya has alcanzado el límite de polígonos.");
				}
				break;
			case 3:
				mostrarContenido(poligonos, contadorPoligonos);
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		} while (opcion != 4);
	}

	public static Triangulo crearTriangulo(Scanner scanner) {
		System.out.println("Introduce los lados del triángulo:");
		System.out.print("Lado 1: ");
		double lado1 = scanner.nextDouble();
		System.out.print("Lado 2: ");
		double lado2 = scanner.nextDouble();
		System.out.print("Lado 3: ");
		double lado3 = scanner.nextDouble();
		return new Triangulo(lado1, lado2, lado3);
	}

	public static Rectangulo crearRectangulo(Scanner scanner) {
		System.out.println("Introduce la base y la altura del rectángulo:");
		System.out.print("Base: ");
		double base = scanner.nextDouble();
		System.out.print("Altura: ");
		double altura = scanner.nextDouble();
		return new Rectangulo(base, altura);
	}

	public static void mostrarContenido(Poligono[] poligonos, int contadorPoligonos) {
		if (contadorPoligonos == 0) {
			System.out.println("No hay polígonos para mostrar.");
			return;
		}

		System.out.println("Contenido del array:");
		for (int i = 0; i < contadorPoligonos; i++) {
			System.out.println("Polígono " + (i + 1) + ": " + poligonos[i]);
			System.out.println("Área: " + poligonos[i].area());
		}
	}
}
