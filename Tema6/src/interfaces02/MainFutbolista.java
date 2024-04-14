package interfaces02;

import java.util.Arrays;

public class MainFutbolista {
	public static void main(String[] args) {
		Futbolista futbolista1 = new Futbolista(10, "Messi", 34, 700);
		Futbolista futbolista2 = new Futbolista(7, "Cristiano", 36, 750);
		Futbolista futbolista3 = new Futbolista(10, "Neymar", 29, 200);

		Futbolista[] futbolistas = { futbolista1, futbolista2, futbolista3 };
		Arrays.sort(futbolistas);

		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}
}
