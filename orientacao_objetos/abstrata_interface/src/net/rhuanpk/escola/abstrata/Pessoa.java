package net.rhuanpk.escola.abstrata;

public abstract class Pessoa {
    protected String nome;
    protected Integer idade;

    public abstract void comprimentar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) {
            System.out.println("Erro: nome não pode ser vazio!");
            return;
        }
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade < 0) {
            System.out.println("Erro: idade não pode ser menor que 0!");
            return;
        }
        this.idade = idade;
    }
}
