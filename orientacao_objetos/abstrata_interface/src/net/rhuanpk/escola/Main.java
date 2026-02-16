package net.rhuanpk.escola;

import net.rhuanpk.escola.classes.Aluno;
import net.rhuanpk.escola.classes.Professor;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        professor.setNome("Rhuan");
        professor.setIdade(26);
        professor.setDisciplina("Programação II");
        System.out.println("Professor:");
        System.out.println("- Nome: " + professor.getNome());
        System.out.println("- Idade: " + professor.getIdade());
        System.out.println("- Disciplina: " + professor.getDisciplina());

        aluno.setNome("Jorge");
        aluno.setIdade(57);
        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        System.out.printf("Aluno:\n- Nome: %s\n- Idade: %s\n- Disciplina: %s\n", aluno.getNome(), aluno.getIdade(), aluno.getCurso());

        professor.fazer();
        professor.comprimentar();

        aluno.comprimentar();
    }
}
