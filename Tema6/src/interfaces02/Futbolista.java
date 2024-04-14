package interfaces02;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {
	private int numeroCamiseta;
	private String nombre;
	private int edad;
	private int numGoles;

	public Futbolista(int numeroCamiseta, String nombre, int edad, int numGoles) {
		this.numeroCamiseta = numeroCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public int compareTo(Futbolista otroFutbolista) {
		int compareCamiseta = Integer.compare(this.numeroCamiseta, otroFutbolista.numeroCamiseta);
		if (compareCamiseta != 0) {
			return compareCamiseta;
		}
		return this.nombre.compareTo(otroFutbolista.nombre);
	}

	@Override
	public String toString() {
		return "Futbolista{" + "numeroCamiseta=" + numeroCamiseta + ", nombre='" + nombre + '\'' + ", edad=" + edad
				+ ", numGoles=" + numGoles + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Futbolista that = (Futbolista) o;
		return numeroCamiseta == that.numeroCamiseta && Objects.equals(nombre, that.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCamiseta, nombre);
	}
}
