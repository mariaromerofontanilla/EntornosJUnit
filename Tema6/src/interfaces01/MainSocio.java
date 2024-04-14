package interfaces01;

import java.util.Arrays;

public class MainSocio {
	public static void main(String[] args) {
		Socio socio1 = new Socio(3, "Juan", 30);
		Socio socio2 = new Socio(1, "Pedro", 25);
		Socio socio3 = new Socio(2, "María", 35);

		Socio[] socios = { socio1, socio2, socio3 };
		Arrays.sort(socios);

		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
}
