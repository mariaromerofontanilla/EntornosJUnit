package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {

	@ParameterizedTest
	@MethodSource("magica")
	void testEsMagica(int tabla[][], boolean expected) {
		boolean resultado = Tablas.esMagica(tabla);
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("gira90")
	void testGira90(int[][] tablaInicio, int[][] expected) {
		int[][] resultado = Tablas.gira90(tablaInicio);
		assertArrayEquals(expected, resultado);
	}
	
	private static Stream<Arguments> magica(){
		
		return Stream.of(
				
				Arguments.of((Object) new int[][] {{1, 1}, {1, 1}}, true),
				Arguments.of((Object) new int[][] {{1, 2}, {1, 1}}, false)
				
		);
		
	}
	
	 public static Stream<Object[]> gira90() {
		 
	        return Stream.of(
	                new Object[][]{
	                        {new int[][]{{1, 2}, {3, 4}}, new int[][]{{3, 1}, {4, 2}}},
	                        {new int[][]{{1}}, new int[][]{{1}}},
	                        {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}}
	                }
	        );
	    }
}
