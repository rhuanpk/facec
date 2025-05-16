package programacaocamadas.view;

import java.util.Scanner;

public class ProdutoView {

	private Scanner scanner = new Scanner(System.in);

	public String readNome() {
		System.out.print("nome do produto: ");
		return scanner.nextLine();
	}

	public double readPreco() {
		System.out.print("preco do produto: ");
		double preco = scanner.nextDouble();
		scanner.nextLine();
		return preco;
	}

	public String readSku() {
		System.out.print("sku do produto: ");
		return scanner.nextLine();
	}

	public void printProduto(String nome, double preco, String sku) {
		System.out.println("----- detalhes -----");
		System.out.println("produto: " + nome + " [" + sku + "]");
		System.out.println("preço: $" + preco);
	}

}
