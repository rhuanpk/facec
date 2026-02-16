package net.rhuanpk.polimorfismo;

public class Funcionario extends Pessoa {
    @Override
    public void correr() {
        System.out.println("O funcionário " + nome + " está correndo.");
    }

    public void funcionarioCorre() {
        this.correr();
    }

    public void pessoaCorre() {
        super.correr();
    }
}
