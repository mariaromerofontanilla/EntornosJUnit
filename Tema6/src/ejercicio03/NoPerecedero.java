package ejercicio03;

/**
 * La clase NoPerecedero representa un producto no perecedero con nombre, precio
 * y tipo.
 */
public class NoPerecedero extends Productos {
	// Atributo para almacenar el tipo del producto no perecedero
	private String tipo;

	/**
	 * Constructor para crear un objeto NoPerecedero con el nombre, precio y tipo
	 * especificados.
	 *
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 * @param tipo   El tipo del producto.
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio); // Llama al constructor de la clase base (Productos) con el nombre y precio
								// especificados.
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Obtiene el tipo del producto no perecedero.
	 *
	 * @return El tipo del producto.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo del producto no perecedero.
	 *
	 * @param tipo El nuevo tipo del producto.
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Devuelve una representación en forma de cadena de caracteres del producto no
	 * perecedero.
	 *
	 * @return Una cadena que representa los detalles del producto no perecedero con
	 *         el tipo.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Tipo: " + tipo;
	}
}
