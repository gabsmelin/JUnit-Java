package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.com.fiap.model.*;

class CalculadoraTeste {

	@Test
	void testSoma5Mais10() {
		 double n1 = 5;
		 double n2 = 10;
		
		 Calculadora C = new Calculadora();
		 
		 double resultadoEsperado = 15;
		 double resultadoReal = C.Somar(n1, n2);
		 assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testSoma4Mais4() {
		 double n1 = 4;
		 double n2 = 4;
		
		 Calculadora C = new Calculadora();
		 
		 double resultadoEsperado = 8;
		 double resultadoReal = C.Somar(n1, n2);
		 assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testSubtrair15Menos5() {
		 double n1 = 15;
		 double n2 = 5;
		
		 Calculadora C = new Calculadora();
		 
		 double resultadoEsperado = 10;
		 double resultadoReal = C.Subtrair(n1, n2);
		 assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testSubtrair5Menos5() {
		 double n1 = 5;
		 double n2 = 5;
		
		 Calculadora C = new Calculadora();
		 
		 double resultadoEsperado = 0;
		 double resultadoReal = C.Subtrair(n1, n2);
		 assertEquals(resultadoEsperado, resultadoReal);
	}

}
