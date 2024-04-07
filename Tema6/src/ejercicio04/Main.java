package ejercicio04;

/**
 * Clase que contiene el método main para probar las clases Electrodomestico,
 * Lavadora y Television.
 */
public class Main {

	/**
	 * Método principal que prueba las clases Electrodomestico, Lavadora y
	 * Television.
	 * 
	 * @param args Argumentos de la línea de comandos (no utilizados en este caso).
	 */
	public static void main(String[] args) {
		// Crear una instancia de Electrodomestico
		Electrodomestico electrodomestico = new Electrodomestico(150, Electrodomestico.NombreColor.AZUL,
				Electrodomestico.ConsumoEnergetico.B, 10);

		// Imprimir el precio final del electrodomestico
		System.out.println("Precio final del electrodoméstico: " + electrodomestico.precioFinal());

		// Crear una instancia de Lavadora
		Lavadora lavadora = new Lavadora(7, 300, Electrodomestico.NombreColor.NEGRO,
				Electrodomestico.ConsumoEnergetico.A, 50);

		// Imprimir el precio final de la lavadora
		System.out.println("Precio final de la lavadora: " + lavadora.precioFinal());

		// Crear una instancia de Televisión
		Television television = new Television(50, true, 600, Electrodomestico.NombreColor.ROJO,
				Electrodomestico.ConsumoEnergetico.A, 30);

		// Imprimir el precio final de la televisión
		System.out.println("Precio final de la televisión: " + television.precioFinal());
	}
}
