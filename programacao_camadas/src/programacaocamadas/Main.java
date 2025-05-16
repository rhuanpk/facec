package programacaocamadas;

import programacaocamadas.controller.ProdutoController;
import programacaocamadas.model.Produto;
import programacaocamadas.view.ProdutoView;

public class Main {

	public static void main(String[] args) {

		Produto produto = new Produto();
		ProdutoView view = new ProdutoView();
		ProdutoController controller = new ProdutoController(produto, view);

		controller.atualizarNome();
		controller.atualizarPreco();
		controller.atualizarSku();
		controller.exibirProduto();

	}

}
