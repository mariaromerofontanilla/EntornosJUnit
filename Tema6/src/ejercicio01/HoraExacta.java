package ejercicio01;

public class HoraExacta extends Hora {

	private int segundo = 0;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);

		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	public boolean setSegundo(int segundo) {
		boolean resultado = false;

		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
			resultado = true;
		}

		return resultado;
	}

	@Override
	public void inc() {
		segundo++;

		if (segundo == 60) {
			super.inc();
			segundo = 0;
		}
	}

	@Override
	public String toString() {
		String cadena = "";
		// cadena += this.hora + " : " + this.minuto;

		cadena = "%02d:%02d:%02d".formatted(super.hora, super.minuto, this.segundo);

		return cadena;
	}


}
