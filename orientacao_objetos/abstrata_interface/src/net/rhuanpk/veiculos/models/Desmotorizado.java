package net.rhuanpk.veiculos.models;

import net.rhuanpk.veiculos.contracts.Veiculo;

public class Desmotorizado extends Veiculo {
    private Boolean instavel;

    @Override
    public void acelerar() {
        System.out.printf("Veículo desmotorizado %s %s está usando força.\n", getMarca(), getModelo());
        System.out.printf("Veículo desmotorizado %s %s está aumentando a velocidade.\n", getMarca(), getModelo());
    }

    public Boolean getInstavel() {
        return instavel;
    }

    public void setInstavel(Boolean instavel) {
        this.instavel = instavel;
    }
}
