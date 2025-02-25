package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import concretas.Moto;

class TestMoto extends Moto {

	@Test
	void autonomia() {
		final float autonomiaEsperada = 20f;
		float autonomiaRecebida = super.autonomia(200, 10);
		assertEquals(autonomiaEsperada, autonomiaRecebida);
	}

}
