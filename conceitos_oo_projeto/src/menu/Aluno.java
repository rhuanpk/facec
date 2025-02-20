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

public class Aluno implements SubMenu {

	private static ArrayList<pessoa.Aluno> alunos = new ArrayList<>();

	private void addAluno() {
		alunos.add(new pessoa.Aluno());
	}

	private void listarAlunos() {
		if (alunos == null || alunos.isEmpty()) {
			System.out.println("Nenhum aluno registrado!");
		} else {
			alunos.forEach(aluno -> {
				aluno.printInfos();
				System.out.println();
			});
		}
		util.Method.continueEnter();
	}

	private pessoa.Aluno pegarAluno() throws ResourceUnexists {
		while (true) {
			int id;
			try {
				id = util.Method.lerInt("Aluno ID: ");
			} catch (Exception e) {
				continue;
			}
			for (int index = 0; index < alunos.size(); index++) {
				pessoa.Aluno aluno = alunos.get(index);
				if (aluno.getId() == id) {
					return aluno;
				}
			}
			throw new ResourceUnexists();
		}
	}

	private void buscarAluno() {
		try {
			pessoa.Aluno aluno = pegarAluno();
			aluno.printInfos();
			System.out.println();
			util.Method.continueEnter();
		} catch (ResourceUnexists e) {
			System.out.println(e.getMessage());
			util.Method.continueEnter();
		}
	}

	private void atualizarAluno() {
		while (true) {
			try {
				pessoa.Aluno aluno = pegarAluno();
				Field[] campos = aluno.getClass().getDeclaredFields();
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
				Field campoEscolhido = aluno.getClass().getDeclaredField(campoNome);
				campoEscolhido.setAccessible(false);
				PropertyEditor editor = PropertyEditorManager.findEditor(campoEscolhido.getType());
				if (editor == null) {
					System.out.println("Tipo de dado inválido!");
					util.Method.continueEnter();
					continue;
				}
				editor.setAsText(novoValor);
				campoEscolhido.set(aluno, editor.getValue());
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

	private void deletarAluno() {
		try {
			pessoa.Aluno aluno = pegarAluno();
			for (int index = 0; index < alunos.size(); index++) {
				pessoa.Aluno item = alunos.get(index);
				if (item.getId() == aluno.getId()) {
					alunos.remove(index);
				}
			}
		} catch (ResourceUnexists e) {
			System.out.println(e.getMessage());
			util.Method.continueEnter();
		}
	}

	@Override
	public int printMenu() {
		util.Method.printMenu("Alunos", "Adicionar aluno", "Listar alunos", "Buscar aluno", "Atualizar aluno",
				"Deletar aluno", util.Method.opcaoMenuVoltar);
		return 6;
	}

	@Override
	public Object[] itemsMenu() {
		return new Object[] { (Runnable) this::addAluno, (Runnable) this::listarAlunos, (Runnable) this::buscarAluno,
				(Runnable) this::atualizarAluno, (Runnable) this::deletarAluno };
	}

}
