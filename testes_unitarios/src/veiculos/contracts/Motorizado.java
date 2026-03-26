package veiculos.contracts;

public abstract class Motorizado extends Veiculo {
    protected Integer potencia;
    protected Boolean ligado;

    public Motorizado() {
        super();
        potencia = 0;
        ligado = false;
    }

    public void ligar() throws IllegalStateException {
        if (ligado) {
            throw new IllegalStateException("Não é possível ligar veículo motorizado já ligado!");
        }
        System.out.printf("Veículo motorizado %s %s está usando energia para ligar.\n", getMarca(), getModelo());
        System.out.printf("Veículo motorizado %s %s está ligado.\n", getMarca(), getModelo());
        ligado = true;
    }

    public void desligar() throws IllegalStateException {
        if (!ligado) {
            throw new IllegalStateException("Não é possível desligar veículo motorizado já desligado");
        }
        System.out.printf("Veículo motorizado %s %s está parando de usar energia.\n", getMarca(), getModelo());
        System.out.printf("Veículo motorizado %s %s está desligado.\n", getMarca(), getModelo());
        ligado = false;
    }

    @Override
    public void acelerar() throws IllegalStateException {
        if (!ligado) {
            throw new IllegalStateException("Não é possível acelerar veículo motorizado desligado!");
        }
        System.out.printf("Veículo motorizado %s %s está usando energia.\n", getMarca(), getModelo());
        System.out.printf("Veículo motorizado %s %s está aumentando a velocidade.\n", getMarca(), getModelo());
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) throws IllegalArgumentException {
        if (potencia == null || potencia < 0) {
            throw new IllegalArgumentException("Potência do veículo motorizado não pode ser menor que zero!");
        }
        this.potencia = potencia;
    }

    public Boolean isLigado() {
        return ligado;
    }
}
