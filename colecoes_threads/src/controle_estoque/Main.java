package controle_estoque;

public class Main {

	public static void main(String[] args) {

		Produto mouse = new Produto("Mouse", "M1", 50);
		Produto teclado = new Produto("Teclado", "T1", 30);
		Produto monitor = new Produto("Monitor", "M2", 20);
		Produto duplicado = new Produto("Mouse", "M1", 10);

		Estoque.adicionarProduto(mouse);
		Estoque.adicionarProduto(teclado);
		Estoque.adicionarProduto(monitor);
		Estoque.adicionarProduto(duplicado);

		System.out.println("\nLista de Produtos no Estoque:");
		Estoque.exibirProdutos();

		System.out.println("\nAtualizando estoque do Monitor:");
		Estoque.atualizarEstoque("M2", 5);

		System.out.println("\nLista Atualizada:");
		Estoque.exibirProdutos();

	}

}
