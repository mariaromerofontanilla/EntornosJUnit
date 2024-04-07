package ejercicio03;

/**
 * La clase Productos representa un producto con un nombre y un precio.
 */
public class Productos {

	// Atributos para almacenar el nombre y el precio del producto
	private String nombre = "";
	private double precio;

	/**
	 * Constructor para crear un objeto Producto con el nombre y precio
	 * especificados.
	 *
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 */
	public Productos(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Obtiene el nombre del producto.
	 *
	 * @return El nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del producto.
	 *
	 * @param nombre El nuevo nombre del producto.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Obtiene el precio del producto.
	 *
	 * @return El precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del producto.
	 *
	 * @param precio El nuevo precio del producto.
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Calcula el precio total de una cantidad determinada del producto.
	 *
	 * @param cantidad La cantidad de producto.
	 * @return El precio total calculado.
	 */
	public double calcular(int cantidad) {
		if (cantidad > 0) {
			return precio * cantidad;
		}
		return 0; // Si la cantidad es menor o igual a cero, el precio total es cero.
	}

	/**
	 * Devuelve una representación en forma de cadena de caracteres del producto.
	 *
	 * @return Una cadena que representa los detalles del producto.
	 */
	@Override
	public String toString() {
		return "Nombre del producto: " + this.nombre + " Precio: " + this.precio;
	}
}
