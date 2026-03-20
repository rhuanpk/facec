package net.rhuanpk.thr0wnew;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        try {
            pessoa.setIdade(-1);
        } catch (IdadeInvalidaException e) {
            System.err.println("Idade não pode ser menor que zero!");
        }
    }
}
