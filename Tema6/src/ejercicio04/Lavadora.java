package ejercicio04;

/**
 * La clase Lavadora representa un tipo de electrodoméstico que es una lavadora.
 * Hereda de la clase Electrodomestico.
 */
public class Lavadora extends Electrodomestico {

	// Atributo específico para la lavadora
	private int carga = 5;

	// Constructores

	/**
	 * Constructor por defecto que inicializa una lavadora con valores
	 * predeterminados.
	 */
	public Lavadora() {

	}

	/**
	 * Constructor que inicializa una lavadora con precio base y peso.
	 * 
	 * @param precioBase Precio base de la lavadora.
	 * @param peso       Peso de la lavadora.
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor que inicializa una lavadora con carga, precio base, color,
	 * consumo energético y peso.
	 * 
	 * @param carga      Carga de la lavadora.
	 * @param precioBase Precio base de la lavadora.
	 * @param color      Color de la lavadora.
	 * @param consumo    Consumo energético de la lavadora.
	 * @param peso       Peso de la lavadora.
	 */
	public Lavadora(int carga, double precioBase, NombreColor color, ConsumoEnergetico consumo, double peso) {
		super(precioBase, color, consumo, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	// Métodos

	/**
	 * Método getter para obtener la carga de la lavadora.
	 * 
	 * @return Carga de la lavadora.
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Sobrescribe el método precioFinal de la clase Electrodomestico para calcular
	 * el precio final de la lavadora.
	 * 
	 * @return Precio final de la lavadora.
	 */
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (carga > 30) {
			precioFinal += 50;
		}

		return precioFinal;
	}
}
