package net.rhuanpk.veiculos.models.motorizeds;

import net.rhuanpk.veiculos.contracts.Energizavel;
import net.rhuanpk.veiculos.contracts.Motorizado;

public class Combustao extends Motorizado implements Energizavel {
    private String combustivel;

    @Override
    public void energizar() {
        System.out.printf("Veículo motorizado a combustão %s %s está enchendo o tanque com %s.\n", getMarca(), getModelo(), getCombustivel());
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
