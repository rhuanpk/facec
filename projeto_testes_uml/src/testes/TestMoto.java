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

import concretas.Moto;
import excecoes.IllegalState;

class TestMoto {

	@Test
	void ligar() {
		Moto moto = new Moto();
		moto.setDesligado();
		assertDoesNotThrow(() -> moto.ligar());
		assertTrue(moto.isLigado());
		assertFalse(moto.isDesligado());
	}

	@Test
	void desligar() {
		Moto moto = new Moto();
		moto.setLigado();
		assertDoesNotThrow(() -> moto.desligar());
		assertFalse(moto.isLigado());
		assertTrue(moto.isDesligado());
	}

	@Test
	void acelerar() {
		try {
			Moto moto = new Moto();
			moto.setLigado();
			final float horaEsperada = 1.125f;
			float horaRecebida = moto.acelerar(100, 80);
			assertTrue(moto.isMovimento());
			assertFalse(moto.isParado());
			assertEquals(horaEsperada, horaRecebida);
		} catch (IllegalState e) {
			fail(e.toString());
		}
	}

	@Test
	void frear() {
		Moto moto = new Moto();
		moto.setLigado();
		moto.setMovimento();
		assertDoesNotThrow(() -> moto.frear());
		assertFalse(moto.isMovimento());
		assertTrue(moto.isParado());
	}

	@Test
	void autonomia() {
		Moto moto = new Moto();
		final float autonomiaEsperada = 12.5f;
		float autonomiaRecebida = moto.autonomia(100, 10);
		assertEquals(autonomiaEsperada, autonomiaRecebida);
	}

	@Test
	void especificacoes() {
		Moto moto = new Moto();
		List<String> listaEspecificacoes = List.of("a", "b", "c");
		ArrayList<String> especificacoes = new ArrayList<>(listaEspecificacoes);
		moto.setEspecificacoes(especificacoes);
		assertArrayEquals(especificacoes.toArray(), moto.getEspecificacoes().toArray());
	}

}
