package net.rhuanpk.veiculos.models.motorizeds;

import net.rhuanpk.veiculos.contracts.Energizavel;
import net.rhuanpk.veiculos.contracts.Motorizado;

public class Eletrico extends Motorizado implements Energizavel {
    private Float voltagem;

    @Override
    public void energizar() {
        System.out.printf("Veículo motorizado elétrico %s %s está carregando a bateria em %f.\n", getMarca(), getModelo(), getVoltagem());
    }

    public Float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(Float voltagem) {
        this.voltagem = voltagem;
    }
}
