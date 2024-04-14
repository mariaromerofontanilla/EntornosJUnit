package ejercicio05;

class Rectangulo extends Poligono {
	private double base;
	private double altura;

	public Rectangulo() {
		super(4);
	}

	public Rectangulo(double base, double altura) {
		super(4);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public String toString() {
		return super.toString() + ", Base: " + base + ", Altura: " + altura;
	}
}
