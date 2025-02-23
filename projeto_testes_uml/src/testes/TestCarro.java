package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import abstrata.Carro;

class TestCarro extends Carro {

	public TestCarro() {
		super("modelo", "cor");
	}

	@Override
	public void frear() {
		System.out.println("frear");
	}

	@Test
	void autonomia() {
		final float autonomiaEsperada = 10f;
		float autonomiaRecebida = super.autonomia(100, 10);
		assertEquals(autonomiaEsperada, autonomiaRecebida);
	}

}
