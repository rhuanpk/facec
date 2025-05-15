package programacaocamadas;

import programacaocamadas.controller.ProdutoController;
import programacaocamadas.model.Produto;
import programacaocamadas.view.ProdutoView;

public class Main {

	public static void main(String[] args) {

		Produto produto = new Produto("Teclado", 100, "TCLD1");
		ProdutoView view = new ProdutoView();
		ProdutoController controller = new ProdutoController(produto, view);

		controller.exibirProduto();
		controller.atualizarNome("Teclado Vermelho");
		controller.atualizarPreco(150);
		controller.atualizarSku("TCLD2");
		controller.exibirProduto();

	}

}
