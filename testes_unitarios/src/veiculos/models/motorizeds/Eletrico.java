package veiculos.models.motorizeds;

import veiculos.contracts.Energizavel;
import veiculos.contracts.Motorizado;

public class Eletrico extends Motorizado implements Energizavel {
    private Float voltagem;

    public Eletrico() {
        super();
        voltagem = 0f;
    }

    @Override
    public void energizar() {
        System.out.printf("Veículo motorizado elétrico %s %s está carregando a bateria em %f.\n", getMarca(), getModelo(), getVoltagem());
    }

    public Float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(Float voltagem) throws IllegalArgumentException {
        if (voltagem == null || voltagem < 0) {
            throw new IllegalArgumentException("Voltagem do veículo motorizado elétrico não pode ser menor que zero!");
        }
        this.voltagem = voltagem;
    }
}
