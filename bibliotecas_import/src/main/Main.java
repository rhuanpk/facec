package main;

import util.Prompt;

public class Main {

	public static void main(String[] args) {

		String nome = Prompt.string("nome: ");
		int idade = Prompt.integer("idade: ");

		System.out.println("nome = " + nome);
		System.out.println("idade = " + idade);

	}

}
