package concretas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestHarley {

	@Test
	void testAutonomia() {
		Harley x350 = new Harley("2025", "vermelha");
		float resultado = x350.autonomia(200, 10);
		assertEquals(20f, resultado);
	}

}
