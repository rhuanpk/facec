package testes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import concretas.Carro;
import excecoes.IllegalState;

class TestCarro {

	@Test
	void ligar() {
		Carro carro = new Carro();
		carro.setDesligado();
		assertDoesNotThrow(() -> carro.ligar());
		assertTrue(carro.isLigado());
		assertFalse(carro.isDesligado());
	}

	@Test
	void desligar() {
		Carro carro = new Carro();
		carro.setLigado();
		assertDoesNotThrow(() -> carro.desligar());
		assertFalse(carro.isLigado());
		assertTrue(carro.isDesligado());
	}

	@Test
	void acelerar() {
		try {
			Carro carro = new Carro();
			carro.setLigado();
			final float horaEsperada = 1.25f;
			float horaRecebida = carro.acelerar(100, 80);
			assertTrue(carro.isMovimento());
			assertFalse(carro.isParado());
			assertEquals(horaEsperada, horaRecebida);
		} catch (IllegalState e) {
			fail(e.toString());
		}
	}

	@Test
	void frear() {
		Carro carro = new Carro();
		carro.setLigado();
		carro.setMovimento();
		assertDoesNotThrow(() -> carro.frear());
		assertFalse(carro.isMovimento());
		assertTrue(carro.isParado());
	}

	@Test
	void autonomia() {
		Carro carro = new Carro();
		final float autonomiaEsperada = 10f;
		float autonomiaRecebida = carro.autonomia(100, 10);
		assertEquals(autonomiaEsperada, autonomiaRecebida);
	}

	@Test
	void especificacoes() {
		Carro carro = new Carro();
		List<String> listaEspecificacoes = List.of("a", "b", "c");
		ArrayList<String> especificacoes = new ArrayList<>(listaEspecificacoes);
		carro.setEspecificacoes(especificacoes);
		assertArrayEquals(especificacoes.toArray(), carro.getEspecificacoes().toArray());
	}

}
