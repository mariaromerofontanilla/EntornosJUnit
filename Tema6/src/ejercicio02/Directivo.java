package ejercicio02;

/**
 * La clase Directivo es una subclase de Empleado que representa a un empleado
 * de nivel directivo. Es un tipo específico de empleado que tiene
 * responsabilidades y autoridad sobre otros empleados.
 */
public class Directivo extends Empleado {

	/**
	 * Constructor para crear un objeto Directivo con el nombre especificado.
	 *
	 * @param nombre El nombre del directivo.
	 */
	public Directivo(String nombre) {
		super(nombre); // Llama al constructor de la clase base (Empleado) con el nombre especificado.
	}

	/**
	 * Sobrescribe el método toString para agregar información adicional sobre el
	 * nivel del empleado.
	 *
	 * @return Una cadena que representa los detalles del directivo.
	 */
	@Override
	public String toString() {
		String cadena = super.toString(); // Obtiene la representación de cadena de la clase base (Empleado).

		cadena += " --> Directivo"; // Agrega información sobre el nivel del empleado.

		return cadena; // Devuelve la cadena completa que representa los detalles del directivo.
	}
}
