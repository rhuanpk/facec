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
        veiculo.setMarca("Marca");
        assertEquals("Marca", veiculo.getMarca());
    }

    @Test
    void setMarca() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(""));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(null));
    }

    @Test
    void getModelo() {
        veiculo.setModelo("Modelo");
        assertEquals("Modelo", veiculo.getModelo());
    }

    @Test
    void setModelo() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(""));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setMarca(null));
    }

    @Test
    void getAno() {
        veiculo.setAno(2000);
        assertEquals(2000, veiculo.getAno());
    }

    @Test
    void setAno() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setAno(-1));
    }

    @Test
    void getCor() {
        veiculo.setCor("Cor");
        assertEquals("Cor", veiculo.getCor());
    }

    @Test
    void setCor() {
        assertThrows(IllegalArgumentException.class, () -> veiculo.setCor(""));
        assertThrows(IllegalArgumentException.class, () -> veiculo.setCor(null));
    }
}
