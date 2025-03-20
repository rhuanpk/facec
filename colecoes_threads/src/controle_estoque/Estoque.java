package controle_estoque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Estoque {

	private static Set<Produto> produtos = new HashSet<>();
	private static List<Produto> registro = new ArrayList<>();
	private static Map<String, Produto> lista = new HashMap<>();

	public static void adicionarProduto(Produto produto) {

		registro.add(produto);

		if (produtos.add(produto)) {
			lista.put(produto.getSku(), produto);
			System.out.println("Produto adicionado com sucesso!");
		} else {
			System.err.println("Produto com SKU duplicado!");
		}

	}

	public static void atualizarEstoque(String sku, int quantidade) {

		Produto produto = lista.get(sku);

		if (produto != null) {
			produto.setQuantidade(quantidade);
			System.out.println("Estoque atualizado: " + produto);
		} else {
			System.err.println("Produto não encontrado!");
		}

	}

	public static void exibirProdutos() {
		produtos.forEach(System.out::println);
	}

}
