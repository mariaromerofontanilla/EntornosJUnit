package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Examen.Codifica;

class ExamenTest {

	@ParameterizedTest
	@MethodSource("codifica")
	void test(String cadena, String expected) {
		String resultado = Codifica.codificaCadena(cadena);
		assertEquals(expected, resultado);
	}

	private static Stream<Arguments> codifica() {
		return Stream.of(
				//Arguments.of(null, ""),
				Arguments.of("ei", "pv"),
				Arguments.of("d", "d")
				);
	}

}
