package menu;

import java.util.ArrayList;

import exception.InvalidOption;
import interfaces.SubMenu;

public class Professor implements SubMenu {

	private static ArrayList<pessoa.Professor> professores = new ArrayList<>();

	@Override
	public int printMenu() {
		util.Method.printMenu("Professores", "Adicionar professor", "Listar Professores", "Pegar professor",
				util.Method.opcaoMenuVoltar);
		return 4;
	}

	@Override
	public Object[] itemsMenu() {
		return new Object[] { (Runnable) () -> {
			Professor.professores.add(new pessoa.Professor());
		}, (Runnable) () -> {
			professores.forEach(professor -> {
				professor.printInfos();
				System.out.println();
			});
			util.Method.continueEnter();
		}, (Runnable) () -> {
			int id;
			while (true) {
				try {
					id = util.Method.lerInt("Professor ID: ");
					break;
				} catch (InvalidOption e) {
				}
			}
			for (int index = 0; index < professores.size(); index++) {
				pessoa.Professor professor = professores.get(index);
				if (professor.getId() == id) {
					professor.printInfos();
					break;
				}
			}
			System.out.println();
			util.Method.continueEnter();
		} };
	}

}
