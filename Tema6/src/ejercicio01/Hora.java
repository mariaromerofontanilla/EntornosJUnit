package ejercicio01;

public class Hora {
	protected int hora;
	protected int minuto;

	public Hora(int hora, int minuto) {

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}

	}

	public void inc() {
		minuto++;

		if (minuto == 60) {
			hora++;
			minuto = 0;
		}
		if (hora == 24) {
			hora = 0;
		}
	}

	public boolean setHora(int hora) {
		boolean resultado = false;

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			resultado = true;
		}
		return resultado;

	}

	public boolean setMinuto(int minuto) {
		boolean resultado = false;

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			resultado = true;
		}
		return resultado;
	}

	@Override
	public String toString() {
		String cadena = "";
		// cadena += this.hora + " : " + this.minuto;

		cadena = "%02d:%02d".formatted(this.hora, this.minuto);

		return cadena;
	}

}
