package veiculos.contracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {
    Veiculo veiculo = new Veiculo() {
        @Override
        public void acelerar() {
        }
    };

    @Test
    void getMarca() {
        final String expected = "Marca";

        veiculo.setMarca("Marca");
        assertEquals(expected, veiculo.getMarca());

        veiculo.setMarca(" Marca");
        assertEquals(expected, veiculo.getMarca());

        veiculo.setMarca("Marca ");
        assertEquals(expected, veiculo.getMarca());

        veiculo.setMarca(" Marca ");
        assertEquals(expected, veiculo.getMarca());
    }

    @Test
    void setMarca() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(""));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(" "));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(null));
    }

    @Test
    void getModelo() {
        final String expected = "Modelo";

        veiculo.setModelo("Modelo");
        assertEquals(expected, veiculo.getModelo());

        veiculo.setModelo(" Modelo");
        assertEquals(expected, veiculo.getModelo());

        veiculo.setModelo("Modelo ");
        assertEquals(expected, veiculo.getModelo());

        veiculo.setModelo(" Modelo ");
        assertEquals(expected, veiculo.getModelo());
    }

    @Test
    void setModelo() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(""));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(" "));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(null));
    }

    @Test
    void getAno() {
        final Integer expected = 2000;
        veiculo.setAno(2000);
        assertEquals(expected, veiculo.getAno());
    }

    @Test
    void setAno() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setAno(-1));
    }

    @Test
    void getCor() {
        final String expected = "Cor";

        veiculo.setCor("Cor");
        assertEquals(expected, veiculo.getCor());

        veiculo.setCor(" Cor");
        assertEquals(expected, veiculo.getCor());

        veiculo.setCor("Cor ");
        assertEquals(expected, veiculo.getCor());

        veiculo.setCor(" Cor ");
        assertEquals(expected, veiculo.getCor());
    }

    @Test
    void setCor() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setCor(""));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setCor(" "));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setCor(null));
    }
}
