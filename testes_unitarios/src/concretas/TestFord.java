package concretas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestFord {

	@Test
	void testAutonomia() {
		Ford fiesta = new Ford("99", "prata");
		float resultado = fiesta.autonomia(100, 10);
		assertEquals(10f, resultado);
	}

}
