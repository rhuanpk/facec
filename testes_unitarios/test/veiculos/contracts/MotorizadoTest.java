package veiculos.contracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorizadoTest {
    Motorizado motorizado = new Motorizado() {
        @Override
        public void acelerar() throws IllegalStateException {
            super.acelerar();
        }
    };

    @Test
    void ligar() {
        motorizado.ligar();
        assertTrue(motorizado.isLigado());
        assertThrows(IllegalStateException.class, () -> motorizado.ligar());
    }

    @Test
    void desligar() {
        motorizado.ligar();
        motorizado.desligar();
        assertFalse(motorizado.isLigado());
        assertThrows(IllegalStateException.class, () -> motorizado.desligar());
    }

    @Test
    void acelerar() {
        assertThrows(IllegalStateException.class, () -> motorizado.acelerar());
    }

    @Test
    void getPotencia() {
        final Integer expected = 1000;
        motorizado.setPotencia(1000);
        assertEquals(expected, motorizado.getPotencia());
    }

    @Test
    void setPotencia() {
        assertThrows(IllegalArgumentException.class, () -> motorizado.setPotencia(-1));
    }

    @Test
    void isLigado() {
        assertFalse(motorizado.isLigado());
        motorizado.ligar();
        assertTrue(motorizado.isLigado());
        motorizado.desligar();
        assertFalse(motorizado.isLigado());
    }
}