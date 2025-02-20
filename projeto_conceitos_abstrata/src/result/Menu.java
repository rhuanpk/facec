package result;

public class Menu {

	private boolean exit;
	private int opcao;

	public Menu(boolean startOver, int opcao) {
		this.exit = startOver;
		this.opcao = opcao;
	}

	public boolean isExit() {
		return exit;
	}

	public int getOpcao() {
		return opcao;
	}

}
