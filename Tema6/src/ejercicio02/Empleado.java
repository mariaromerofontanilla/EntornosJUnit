package ejercicio02;

/**
 * La clase Empleado representa a un empleado genérico con un nombre.
 */
public class Empleado {

	// Atributo para almacenar el nombre del empleado (privado para el
	// encapsulamiento)
	private String nombre = "";

	/**
	 * Constructor para crear un objeto Empleado con el nombre especificado.
	 *
	 * @param nombre El nombre del empleado.
	 */
	public Empleado(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Establece el nombre del empleado.
	 *
	 * @param nombre El nuevo nombre del empleado.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Obtiene el nombre del empleado.
	 *
	 * @return El nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve una representación en forma de cadena de caracteres del empleado.
	 *
	 * @return Una cadena que representa los detalles del empleado.
	 */
	@Override
	public String toString() {
		return "Empleado --> " + nombre;
	}
}
