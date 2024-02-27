package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.com.fiap.model.*;

class ElevadorTeste {

	@Test
	void testEntrarNoElevador() {
		Elevador E1 = new Elevador();
		E1.setCargaAtual(72.1);
		
		double resultadoEsperado = 153;
		double resultadoReal = E1.entrarNoElevador(80.9);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	void testSairDoElevador() {
		Elevador E1 = new Elevador();
		E1.setCargaAtual(72.1);
		
		double resultadoEsperado = 72.1;
		double resultadoReal = E1.sairDoElevador(0);
		assertEquals(resultadoEsperado, resultadoReal, 0.1);
	}

	@Test
	void testAvaliarPesoAtivado() {
		Elevador E1 = new Elevador();
		E1.setCargaAtual(272.1);
		
		boolean resultadoReal = E1.avaliarPeso();
		assertEquals(true, resultadoReal);
	}
	@Test
	void testAvaliarPesoDesativado() {
		Elevador E1 = new Elevador();
		E1.setCargaAtual(172.1);
		
		boolean resultadoReal = E1.avaliarPeso();
		assertEquals(false, resultadoReal);
	}
}
