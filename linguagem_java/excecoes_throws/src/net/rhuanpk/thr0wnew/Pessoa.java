package net.rhuanpk.thr0wnew;

public class Pessoa {
    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException();
        }
        this.idade = idade;
    }
}
