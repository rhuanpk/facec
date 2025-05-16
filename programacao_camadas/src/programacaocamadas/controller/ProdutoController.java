package programacaocamadas.controller;

import programacaocamadas.model.Produto;
import programacaocamadas.view.ProdutoView;

public class ProdutoController {

	private Produto model;
	private ProdutoView view;

	public ProdutoController(Produto produto, ProdutoView view) {
		this.model = produto;
		this.view = view;
	}

	public void atualizarNome() {
		String nome = view.readNome();
		model.setNome(nome);
	}

	public void atualizarPreco() {
		double preco = view.readPreco();
		model.setPreco(preco);
	}

	public void atualizarSku() {
		String sku = view.readSku();
		model.setSku(sku);
	}

	public void exibirProduto() {
		view.printProduto(model.getNome(), model.getPreco(), model.getSku());
	}

}
