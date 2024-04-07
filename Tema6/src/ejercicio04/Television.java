package ejercicio04;

/**
 * La clase Television representa un tipo de electrodoméstico que es una
 * televisión. Hereda de la clase Electrodomestico.
 */
public class Television extends Electrodomestico {

	// Atributos específicos para la televisión
	private int resolucion = 20;
	private boolean sintonizadorTDT = false;

	// Constructores

	/**
	 * Constructor por defecto que inicializa una televisión con valores
	 * predeterminados.
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor que inicializa una televisión con precio base y peso.
	 * 
	 * @param precioBase Precio base de la televisión.
	 * @param peso       Peso de la televisión.
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor que inicializa una televisión con resolución, sintonizador TDT,
	 * precio base, color, consumo energético y peso.
	 * 
	 * @param resolucion      Resolución de la televisión.
	 * @param sintonizadorTDT Indica si la televisión tiene sintonizador TDT.
	 * @param precioBase      Precio base de la televisión.
	 * @param color           Color de la televisión.
	 * @param consumo         Consumo energético de la televisión.
	 * @param peso            Peso de la televisión.
	 */
	public Television(int resolucion, boolean sintonizadorTDT, double precioBase, NombreColor color,
			ConsumoEnergetico consumo, double peso) {
		super(precioBase, color, consumo, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Métodos

	/**
	 * Método getter para obtener la resolución de la televisión.
	 * 
	 * @return Resolución de la televisión.
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Método getter para obtener si la televisión tiene sintonizador TDT.
	 * 
	 * @return true si la televisión tiene sintonizador TDT, false en caso
	 *         contrario.
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Sobrescribe el método precioFinal de la clase Electrodomestico para calcular
	 * el precio final de la televisión.
	 * 
	 * @return Precio final de la televisión.
	 */
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		// Incrementa el precio final si la resolución es mayor a 40 pulgadas
		if (resolucion > 40) {
			precioFinal *= 1.30; // Aumenta el precio en un 30%
		}

		// Añade 50 euros al precio final si la televisión tiene sintonizador TDT
		if (sintonizadorTDT) {
			precioFinal += 50;
		}

		return precioFinal;
	}
}
