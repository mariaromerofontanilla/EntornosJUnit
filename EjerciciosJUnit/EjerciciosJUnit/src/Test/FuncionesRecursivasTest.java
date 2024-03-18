package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource("sumatorio")
	void testSumatorio(int numero, int expected) {
		int resultado = FuncionesRecursivas.sumatorio(numero);
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("potencia")
	void testPotencia(double numero, int expo, double expected) {
		double resultado = FuncionesRecursivas.potencia(expected, expo);
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("fibonacci")
	void testFibonacci(int numero, int expected) {
		int resultado = FuncionesRecursivas.fibonacci(numero);
		assertEquals(expected, numero);
	}
	
	private static Stream<Arguments> sumatorio() {
		
		return Stream.of(

				Arguments.of(4, 10), 
				Arguments.of(0, 0), 
				Arguments.of(1, 1)

		);
		
	}
	
	private static Stream<Arguments> potencia() {
		
		return Stream.of(

				Arguments.of(2, 2, 4), 
				Arguments.of(2, 1, 1), 
				Arguments.of(2, 0, 1)

		);
		
	}
	
	private static Stream<Arguments> fibonacci() {
		
		return Stream.of(

				Arguments.of(1, 0), 
				Arguments.of(3, 1), 
				Arguments.of(4, 2)

		);
		
	}	

}
