package programacaocamadas.controller;

import programacaocamadas.model.Produto;
import programacaocamadas.view.ProdutoView;

public class ProdutoController {

	private Produto produto;
	private ProdutoView view;

	public ProdutoController(Produto produto, ProdutoView view) {
		this.produto = produto;
		this.view = view;
	}

	public void atualizarNome(String nome) {
		produto.setNome(nome);
	}

	public void atualizarPreco(double preco) {
		produto.setPreco(preco);
	}

	public void atualizarSku(String sku) {
		produto.setSku(sku);
	}

	public void exibirProduto() {
		view.exibirProduto(produto.getNome(), produto.getPreco(), produto.getSku());
	}

}
