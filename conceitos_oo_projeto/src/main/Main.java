package main;

import menu.Secretaria;
import menu.Aluno;
import menu.Professor;

public class Main {

	public static void main(String[] args) {

		Secretaria secretaria = new Secretaria();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		util.Method.start(secretaria, aluno, professor);

	}

}
