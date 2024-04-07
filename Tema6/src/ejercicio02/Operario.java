package ejercicio02;

/**
 * La clase Operario es una subclase de Empleado que representa a un empleado de
 * nivel operario.
 */
public class Operario extends Empleado {

	/**
	 * Constructor para crear un objeto Operario con el nombre especificado.
	 *
	 * @param nombre El nombre del operario.
	 */
	public Operario(String nombre) {
		super(nombre); // Llama al constructor de la clase base (Empleado) con el nombre especificado.
	}

	/**
	 * Sobrescribe el método toString para agregar información adicional sobre el
	 * nivel del empleado.
	 *
	 * @return Una cadena que representa los detalles del operario.
	 */
	@Override
	public String toString() {
		String cadena = super.toString(); // Obtiene la representación de cadena de la clase base (Empleado).

		cadena += " --> Operario"; // Agrega información sobre el nivel del empleado.

		return cadena; // Devuelve la cadena completa que representa los detalles del operario.
	}
}
