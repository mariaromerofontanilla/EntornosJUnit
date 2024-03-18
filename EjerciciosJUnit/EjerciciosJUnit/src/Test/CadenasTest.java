package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {
	@ParameterizedTest
	@MethodSource("espacios")
	void testCuentaEspacios(String frase, int expected) {
		Cadenas cad = new Cadenas(frase);
		int resultado = cad.cuentaEspacios();
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("reves")
	void testDelReves(String frase, String expected) {
		Cadenas cad = new Cadenas(frase);
		String resultado = cad.delReves();
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("cuenta")
	void testContarPalabra(String frase, String palabra, int expected) {
		Cadenas cad = new Cadenas(frase);
		int resultado = cad.contarPalabra(palabra);
		assertEquals(expected, resultado);
	}

	private static Stream<Arguments> espacios() {

		return Stream.of(

				Arguments.of("Hola Mundo Es Un Infierno", 4), 
				Arguments.of("Maria", 0), 
				Arguments.of("a", 0),
				Arguments.of("", 0)

		);

	}

	private static Stream<Arguments> reves() {

		return Stream.of(

				Arguments.of("Hola Mundo Es Un Infierno", "onreifnI nU sE odnuM aloH"),
				Arguments.of("Maria", "airaM"), 
				Arguments.of("a", "a"), 
				Arguments.of("", "")

		);
	}

	private static Stream<Arguments> cuenta() {

		return Stream.of(

				Arguments.of("Le voy a ir a comer", "a", 2), 
				Arguments.of("maria", "maria", 1),
				Arguments.of("a", "a", 0), 
				Arguments.of(" ", " ", 0)
				
			);

	}
}