package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import concretas.Carro;

class TestCarro {

	@Test
	void autonomia() {
		Carro fiesta = new Carro();
		final float autonomiaEsperada = 10f;
		float autonomiaRecebida = fiesta.autonomia(100, 10);
		assertEquals(autonomiaEsperada, autonomiaRecebida);
	}

}
