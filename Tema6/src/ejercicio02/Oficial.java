package ejercicio02;

/**
 * La clase Oficial es una subclase de Operario que representa a un empleado de
 * nivel Oficial.
 */
public class Oficial extends Operario {

	/**
	 * Constructor para crear un objeto Oficial con el nombre especificado.
	 *
	 * @param nombre El nombre del oficial.
	 */
	public Oficial(String nombre) {
		super(nombre); // Llama al constructor de la clase base (Operario) con el nombre especificado.
	}

	/**
	 * Sobrescribe el método toString para agregar información adicional sobre el
	 * nivel del empleado.
	 *
	 * @return Una cadena que representa los detalles del oficial.
	 */
	@Override
	public String toString() {
		String cadena = super.toString(); // Obtiene la representación de cadena de la clase base (Operario).

		cadena += " --> Oficial"; // Agrega información sobre el nivel del empleado.

		return cadena; // Devuelve la cadena completa que representa los detalles del oficial.
	}
}
