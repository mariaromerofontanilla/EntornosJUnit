package ejercicio05;

abstract class Poligono {
	protected int numeroLados;

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public abstract double area();

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "Tipo de Polígono: " + getClass().getSimpleName() + ", Número de lados: " + numeroLados;
	}
}
