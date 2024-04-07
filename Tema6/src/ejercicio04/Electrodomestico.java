package ejercicio04;

/**
 * La clase Electrodomestico modela un electrodoméstico genérico con precio,
 * color, consumo energético y peso.
 */
public class Electrodomestico {

	// Atributos
	protected double precioBase = 100.00;
	protected NombreColor color = NombreColor.BLANCO;
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	protected double peso = 5.00;

	// Enumeraciones para consumo energético y colores
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	enum NombreColor {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Constructor que inicializa un electrodoméstico con precio base, color,
	 * consumo energético y peso.
	 * 
	 * @param precioBase        Precio base del electrodoméstico.
	 * @param color             Color del electrodoméstico.
	 * @param consumoEnergetico Consumo energético del electrodoméstico.
	 * @param peso              Peso del electrodoméstico.
	 */
	public Electrodomestico(double precioBase, NombreColor color, ConsumoEnergetico consumoEnergetico, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (color != null && (color.equals(NombreColor.BLANCO) || color.equals(NombreColor.NEGRO)
				|| color.equals(NombreColor.ROJO) || color.equals(NombreColor.AZUL)
				|| color.equals(NombreColor.GRIS))) {
			this.color = color;
		}

		if (consumoEnergetico != null && (consumoEnergetico.equals(ConsumoEnergetico.A)
				|| consumoEnergetico.equals(ConsumoEnergetico.B) || consumoEnergetico.equals(ConsumoEnergetico.C)
				|| consumoEnergetico.equals(ConsumoEnergetico.D) || consumoEnergetico.equals(ConsumoEnergetico.E)
				|| consumoEnergetico.equals(ConsumoEnergetico.F))) {
			this.consumoEnergetico = consumoEnergetico;
		}

		if (peso > 0) {
			this.peso = peso;
		}

	}

	/**
	 * Constructor por defecto que inicializa un electrodoméstico con valores
	 * predeterminados.
	 */
	public Electrodomestico() {
		super();

	}

	/**
	 * Constructor que inicializa un electrodoméstico con precio base y peso.
	 * 
	 * @param precioBase Precio base del electrodoméstico.
	 * @param peso       Peso del electrodoméstico.
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	// Métodos Getters
	public double getPrecioBase() {
		return precioBase;
	}

	public NombreColor getColor() {
		return color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// Método Setter
	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Métodos privados para comprobar el consumo energético y el color

	/**
	 * Comprueba y asigna el consumo energético basado en una letra.
	 * 
	 * @param letra Letra que representa el consumo energético.
	 */
	private void comprobarConsumoEnergetico(char letra) {
		boolean letraValida = false;
		for (ConsumoEnergetico ce : ConsumoEnergetico.values()) {
			if (Character.toUpperCase(letra) == ce.name().charAt(0)) {
				this.consumoEnergetico = ce;
				letraValida = true;
			}
		}
	}

	/**
	 * Comprueba y asigna el color del electrodoméstico.
	 * 
	 * @param color Color del electrodoméstico.
	 */
	private void comprobarColor(String color) {
		for (NombreColor c : NombreColor.values()) {
			if (color.equalsIgnoreCase(c.name())) {
				this.color = NombreColor.valueOf(color);
			}
		}
	}

	/**
	 * Calcula y devuelve el precio final del electrodoméstico.
	 * 
	 * @return Precio final del electrodoméstico.
	 */
	public double precioFinal() {
		double precioFinal = precioBase;

		switch (consumoEnergetico) {
		case A:
			precioFinal += 100;
			break;
		case B:
			precioFinal += 80;
			break;
		case C:
			precioFinal += 60;
			break;
		case D:
			precioFinal += 50;
			break;
		case E:
			precioFinal += 30;
			break;
		case F:
			precioFinal += 10;
			break;
		}

		if (peso >= 0 && peso < 20) {
			precioFinal += 10;
		} else if (peso >= 20 && peso < 50) {
			precioFinal += 50;
		} else if (peso >= 50 && peso < 80) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}

		return precioFinal;
	}
}
