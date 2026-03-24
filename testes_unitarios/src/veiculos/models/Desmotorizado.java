package veiculos.models;

import veiculos.contracts.Veiculo;

public class Desmotorizado extends Veiculo {
    private Boolean instavel;

    public Desmotorizado() {
        super();
        instavel = false;
    }

    @Override
    public void acelerar() {
        System.out.printf("Veículo desmotorizado %s %s está usando força.\n", getMarca(), getModelo());
        System.out.printf("Veículo desmotorizado %s %s está aumentando a velocidade.\n", getMarca(), getModelo());
    }

    public Boolean isInstavel() {
        return instavel;
    }

    public void setInstavel(Boolean instavel) {
        if (instavel == null) {
            throw new IllegalArgumentException("Instabilidade do veículo desmotorizado não pode ser nula!");
        }
        this.instavel = instavel;
    }
}
