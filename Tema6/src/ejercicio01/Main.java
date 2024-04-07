package ejercicio01;

public class Main {

	public static void main(String[] args) {

		Hora hora = new Hora(3, 23);
		
		HoraExacta horaExacta = new HoraExacta(3, 23, 59);
		
		System.out.println(horaExacta);
		horaExacta.inc();
		
		System.out.println(horaExacta);

	}

}
