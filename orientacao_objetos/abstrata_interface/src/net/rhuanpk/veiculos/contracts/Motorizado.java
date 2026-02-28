package net.rhuanpk.veiculos.contracts;

public abstract class Motorizado extends Veiculo {
    protected Integer potencia;
    protected Boolean ligado;

    public void ligar() {
        System.out.printf("Veículo motorizado %s %s está usando energia para ligar.\n", getMarca(), getModelo());
        System.out.printf("Veículo motorizado %s %s está ligado.\n", getMarca(), getModelo());
        ligado = true;
    }

    public void desligar() {
        System.out.printf("Veículo motorizado %s %s está parando de usar energia.\n", getMarca(), getModelo());
        System.out.printf("Veículo motorizado %s %s está desligado.\n", getMarca(), getModelo());
        ligado = false;
    }

    @Override
    public void acelerar() {
        if (!ligado) {
            return;
        }
        System.out.printf("Veículo motorizado %s %s está usando energia.\n", getMarca(), getModelo());
        System.out.printf("Veículo motorizado %s %s está aumentando a velocidade.\n", getMarca(), getModelo());
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Boolean getLigado() {
        return ligado;
    }
}
