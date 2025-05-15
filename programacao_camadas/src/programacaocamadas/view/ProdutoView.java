package programacaocamadas.view;

public class ProdutoView {

	public void exibirProduto(String nome, double preco, String sku) {

		System.out.println("Produto: " + nome + " [" + sku + "]");
		System.out.println("Preço: $ " + preco);

	}

}
