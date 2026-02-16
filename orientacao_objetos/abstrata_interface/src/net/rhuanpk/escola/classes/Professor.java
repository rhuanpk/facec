package net.rhuanpk.escola.classes;

import net.rhuanpk.escola.abstrata.Pessoa;
import net.rhuanpk.escola.interfaces.Acoes;
import net.rhuanpk.escola.interfaces.Util;

public class Professor extends Pessoa implements Acoes {
    private String disciplina;

    @Override
    public void fazer() {
        System.out.println("Professor " + nome + " corrigindo atividades.");
    }

    @Override
    public void comprimentar() {
        System.out.println("Professor " + nome + " está comprimentando.");
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (Util.stringEmpty(disciplina, "Erro: disciplina não pode ser vazio!")) {
            return;
        }
        this.disciplina = disciplina;
    }
}
