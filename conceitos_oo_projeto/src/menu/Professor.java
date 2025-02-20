package menu;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

import exception.InvalidOption;
import exception.ReadInt;
import exception.ResourceUnexists;
import interfaces.SubMenu;

public class Professor implements SubMenu {

	private static ArrayList<pessoa.Professor> professores = new ArrayList<>();

	private void addProfessor() {
		professores.add(new pessoa.Professor());
	}

	private void listarProfessor() {
		if (professores == null || professores.isEmpty()) {
			System.out.println("Nenhum professor registrado!");
		} else {
			professores.forEach(professor -> {
				professor.printInfos();
				System.out.println();
			});
		}
		util.Method.continueEnter();
	}

	private pessoa.Professor pegarProfessor() throws ResourceUnexists {
		while (true) {
			int id;
			try {
				id = util.Method.lerInt("Professor ID: ");
			} catch (Exception e) {
				continue;
			}
			for (int index = 0; index < professores.size(); index++) {
				pessoa.Professor professor = professores.get(index);
				if (professor.getId() == id) {
					return professor;
				}
			}
			throw new ResourceUnexists();
		}
	}

	private void buscarProfessor() {
		try {
			pessoa.Professor professor = pegarProfessor();
			professor.printInfos();
			System.out.println();
			util.Method.continueEnter();
		} catch (ResourceUnexists e) {
			System.out.println(e.getMessage());
			util.Method.continueEnter();
		}
	}

	private void atualizarProfessor() {
		while (true) {
			try {
				pessoa.Professor professor = pegarProfessor();
				Field[] campos = professor.getClass().getDeclaredFields();
				for (int index = 0; index < campos.length; index++) {
					System.out.println(index + 1 + ". " + campos[index].getName().toUpperCase());
				}
				System.out.println("0. Voltar");
				int campoIndex = util.Method.lerInt("\nCampo: ");
				if (campoIndex == 0)
					break;
				if (campoIndex < 1 || campoIndex > campos.length) {
					InvalidOption invalidOption = new InvalidOption();
					System.out.println(invalidOption.getMessage());
					util.Method.continueEnter();
					continue;
				}
				Scanner sc = new Scanner(System.in);
				System.out.print("Novo valor: ");
				String novoValor = sc.nextLine();
				String campoNome = campos[campoIndex - 1].getName();
				Field campoEscolhido = professor.getClass().getDeclaredField(campoNome);
				campoEscolhido.setAccessible(false);
				PropertyEditor editor = PropertyEditorManager.findEditor(campoEscolhido.getType());
				if (editor == null) {
					System.out.println("Tipo de dado inválido!");
					util.Method.continueEnter();
					continue;
				}
				editor.setAsText(novoValor);
				campoEscolhido.set(professor, editor.getValue());
				sc.close();
			} catch (ReadInt e) {
				System.out.println(e.getMessage());
				util.Method.continueEnter();
				continue;
			} catch (ResourceUnexists e) {
				System.out.println(e.getMessage());
				util.Method.continueEnter();
				break;
			} catch (NoSuchFieldException | SecurityException e) {
				System.out.println("Erro ao pegar o campo!");
				util.Method.continueEnter();
				break;
			} catch (IllegalArgumentException | IllegalAccessException e) {
				System.out.println("Erro na definição do campo!");
				util.Method.continueEnter();
				break;
			} catch (Exception e) {
				System.out.println("Erro ao pegar os campos!");
				util.Method.continueEnter();
				break;
			}
		}

	}

	private void deletarProfessor() {
		try {
			pessoa.Professor professor = pegarProfessor();
			for (int index = 0; index < professores.size(); index++) {
				pessoa.Professor item = professores.get(index);
				if (item.getId() == professor.getId()) {
					professores.remove(index);
				}
			}
		} catch (ResourceUnexists e) {
			System.out.println(e.getMessage());
			util.Method.continueEnter();
		}
	}

	@Override
	public int printMenu() {
		util.Method.printMenu("Professores", "Adicionar professor", "Listar professores", "Buscar professor",
				"Atualizar professor", "Deletar professor", util.Method.opcaoMenuVoltar);
		return 6;
	}

	@Override
	public Object[] itemsMenu() {
		return new Object[] { (Runnable) this::addProfessor, (Runnable) this::listarProfessor,
				(Runnable) this::buscarProfessor, (Runnable) this::atualizarProfessor,
				(Runnable) this::deletarProfessor };
	}

}
