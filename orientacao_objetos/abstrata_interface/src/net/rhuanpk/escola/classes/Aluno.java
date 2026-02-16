package net.rhuanpk.escola.classes;

import net.rhuanpk.escola.abstrata.Pessoa;
import net.rhuanpk.escola.interfaces.Util;

public class Aluno extends Pessoa {
    private String curso;

    @Override
    public void comprimentar() {
        System.out.println("Aluno " + nome + " está comprimentando.");
    }

    @Override
    public void setIdade(Integer idade) {
        if (idade < 18) {
            System.out.println("Erro: idade do aluno não pode ser menor que 18!");
        }
        super.setIdade(idade);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (Util.stringEmpty(curso, "Erro: curso não pode ser vazio!")) {
            return;
        }
        this.curso = curso;
    }
}
