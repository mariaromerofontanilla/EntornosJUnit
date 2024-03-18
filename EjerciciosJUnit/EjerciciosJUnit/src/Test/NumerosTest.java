package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("primo")
	void testEsPrimo(int numero, boolean primo) {
		Numeros num = new Numeros(numero);
		boolean esPri = num.esPrimo();
		assertEquals(primo, numero);
	}
	
	@ParameterizedTest
	@MethodSource("capicua")
	void testEsCapicua(int numero, boolean capicua) {
		Numeros num = new Numeros(numero);
		boolean esCap = num.esCapicua();
		assertEquals (capicua, esCap);
	}

	private static Stream<Arguments> capicua(){
		
		return Stream.of(
				
				Arguments.of(1221, true),
				Arguments.of(1231, false),
				Arguments.of(-2222, false)
				
		);
		
	}
	
	private static Stream<Arguments> primo(){
		
		return Stream.of(
				
				Arguments.of(11, true),
				Arguments.of(-20, false),
				Arguments.of(0, false)
				
		);
		
	}


}
