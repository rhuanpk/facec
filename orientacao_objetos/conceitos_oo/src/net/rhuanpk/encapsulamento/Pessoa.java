package net.rhuanpk.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    public void correr() {
        System.out.println("A pessoa " + nome + " está correndo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == "") {
            System.out.println("Erro: nome não poder ser vazio!");
            return;
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Erro: idade não pode ser menor que 0!");
        } else {
            this.idade = idade;
        }
    }
}
