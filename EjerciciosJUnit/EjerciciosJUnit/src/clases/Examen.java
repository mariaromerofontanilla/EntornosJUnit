package clases;

public class Examen {

	/**
	 * Clase con una única función para realizar pruebas sobre la codificación de
	 * una cadena
	 * 
	 * @author Elena Rivero
	 *
	 */
	public class Codifica {

		/**
		 * Función que recibe una cadena de texto y devuelve otra cadena con la
		 * codificación de la misma atendiendo a los arrays definidos de forma global.
		 * 
		 * @param cadena Cadena introducida por parámetro que se quiere codificar
		 * @return Devuelve la cadena introducida por parámetro codificada atendiendo a
		 *         los arrays
		 */
		public static String codificaCadena(String cadena) {
			char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
			char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

			String conj1 = String.valueOf(conjunto1);
			String result = "";
			int pos = 0;
			char caracter;

			for (int i = cadena.length() - 1; i >= 0; i--) {

				caracter = cadena.charAt(i);

				pos = conj1.indexOf(caracter);

				if (pos >= 0) {
					result += conjunto2[pos];
				} else {
					result += caracter;
				}

			}

			return result;
		}
	}

}
