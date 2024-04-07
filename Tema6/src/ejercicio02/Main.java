package ejercicio02;

/**
 * Clase principal que contiene el método main para demostrar la jerarquía de
 * empleados.
 */
public class Main {

	/**
	 * Método principal que crea instancias de diferentes tipos de empleados y los
	 * imprime.
	 *
	 * @param args Argumentos de la línea de comandos (no utilizados en este
	 * programa).
	 */
	public static void main(String[] args) {

		// Creación de instancias de diferentes tipos de empleados
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");

		// Impresión de los detalles de cada empleado
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}
}
