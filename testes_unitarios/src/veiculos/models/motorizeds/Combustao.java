package veiculos.models.motorizeds;

import veiculos.contracts.Energizavel;
import veiculos.contracts.Motorizado;

public class Combustao extends Motorizado implements Energizavel {
    private String combustivel;

    public Combustao() {
        super();
        combustivel = "";
    }

    @Override
    public void energizar() {
        System.out.printf("Veículo motorizado a combustão %s %s está enchendo o tanque com %s.\n", getMarca(), getModelo(), getCombustivel());
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) throws IllegalArgumentException {
        if (combustivel == null || combustivel.isBlank()) {
            throw new IllegalArgumentException("Combustível do veículo motorizado a combustão não pode ser vazio!");
        }
        this.combustivel = combustivel;
    }
}
