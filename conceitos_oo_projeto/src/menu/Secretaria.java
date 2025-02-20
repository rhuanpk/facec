package menu;

import interfaces.Menu;

public class Secretaria implements Menu {

	@Override
	public int printMenu() {
		util.Method.printMenu("Sistema de Secretaria", "Alunos", "Professores", util.Method.opcaoMenuSair);
		return 3;
	}

}
