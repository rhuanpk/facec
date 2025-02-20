package menu;

import java.util.ArrayList;

import exception.InvalidOption;
import interfaces.SubMenu;

public class Aluno implements SubMenu {

	private static ArrayList<pessoa.Aluno> alunos = new ArrayList<>();

	@Override
	public int printMenu() {
		util.Method.printMenu("Alunos", "Adicionar aluno", "Listar alunos", "Pegar aluno", util.Method.opcaoMenuVoltar);
		return 4;
	}

	@Override
	public Object[] itemsMenu() {
		return new Object[] { (Runnable) () -> {
			alunos.add(new pessoa.Aluno());
		}, (Runnable) () -> {
			alunos.forEach(aluno -> {
				aluno.printInfos();
				System.out.println();
			});
			util.Method.continueEnter();
		}, (Runnable) () -> {
			int id;
			while (true) {
				try {
					id = util.Method.lerInt("Aluno ID: ");
					break;
				} catch (InvalidOption e) {
				}
			}
			for (int index = 0; index < alunos.size(); index++) {
				pessoa.Aluno aluno = alunos.get(index);
				if (aluno.getId() == id) {
					aluno.printInfos();
					break;
				}
			}
			System.out.println();
			util.Method.continueEnter();
		} };
	}
}
