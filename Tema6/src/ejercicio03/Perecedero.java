package ejercicio03;

/**
 * La clase Perecedero representa un producto perecedero con nombre, precio y
 * días a caducar.
 */
public class Perecedero extends Productos {

	// Atributo para almacenar los días a caducar del producto perecedero
	private int diasACaducar;

	/**
	 * Constructor para crear un objeto Perecedero con el nombre, precio y días a
	 * caducar especificados.
	 *
	 * @param nombre       El nombre del producto.
	 * @param precio       El precio del producto.
	 * @param diasACaducar Los días a caducar del producto.
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio); // Llama al constructor de la clase base (Productos) con el nombre y precio
								// especificados.
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * Obtiene los días a caducar del producto perecedero.
	 *
	 * @return Los días a caducar del producto.
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Establece los días a caducar del producto perecedero.
	 *
	 * @param diasACaducar Los nuevos días a caducar del producto.
	 */
	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * Calcula el precio total de una cantidad de productos perecederos teniendo en
	 * cuenta los días a caducar.
	 *
	 * @param cantidad La cantidad de productos a calcular.
	 * @return El precio total de la cantidad de productos perecederos.
	 */
	@Override
	public double calcular(int cantidad) {
		// Obtener el precio total de la superclase Productos
		double precioFinal = super.calcular(cantidad);

		// Reducir el precio final según los días a caducar del producto
		if (diasACaducar == 1) {
			precioFinal /= 4; // Reducir el precio final dividiéndolo entre 4.
		} else if (diasACaducar == 2) {
			precioFinal /= 3; // Reducir el precio final dividiéndolo entre 3.
		} else if (diasACaducar == 3) {
			precioFinal /= 2; // Reducir el precio final a la mitad.
		}

		return precioFinal;
	}

	/**
	 * Devuelve una representación en forma de cadena de caracteres del producto
	 * perecedero.
	 *
	 * @return Una cadena que representa los detalles del producto perecedero con
	 *         los días a caducar.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Días a caducar: " + diasACaducar;
	}
}
