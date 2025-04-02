package main;

import java.util.Scanner;

import calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 5) {

			printMenu();
			System.out.print("escolha: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				Calculadora.somar();
				break;
			case 2:
				Calculadora.subtrair();
				break;
			case 3:
				Calculadora.multiplicar();
				break;
			case 4:
				Calculadora.dividir();
				break;
			case 5:
				System.out.println("obrigado!");
				break;
			default:
				System.err.println("opção incorreta!");
				break;
			}

			System.out.println();

		}

		scanner.close();

	}

	private static void printMenu() {

		StringBuilder sb = new StringBuilder();

		sb.append("--- calculadora ---\n");
		sb.append("1. somar\n");
		sb.append("2. subtrair\n");
		sb.append("3. multiplicar\n");
		sb.append("4. dividir\n");
		sb.append("5. sair\n");

		System.out.print(sb);

	}

}
