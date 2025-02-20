package menu;

import java.util.ArrayList;
import java.util.Scanner;

import exception.InvalidOption;
import exception.ReadInt;
import exception.ResourceUnexists;
import interfaces.SubMenu;

public class Professor implements SubMenu {

	private static final Scanner sc = new Scanner(System.in);

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

	private result.Professor pegarProfessor() throws ResourceUnexists {
		while (true) {
			int id;
			try {
				id = util.Method.lerInt("Professor ID: ");
				for (int index = 0; index < professores.size(); index++) {
					pessoa.Professor professor = professores.get(index);
					if (professor.getId() == id) {
						return new result.Professor(index, professor);
					}
				}
				throw new ResourceUnexists();
			} catch (ReadInt e) {
				System.out.println(e.getMessage());
				util.Method.continueEnter();
				continue;
			}
		}
	}

	private void buscarProfessor() {
		try {
			pessoa.Professor professor = pegarProfessor().getProfessor();
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
				int professorIndex = pegarProfessor().getIndex();
				System.out.println("1. Nome");
				System.out.println("2. Idade");
				System.out.println("3. Cursos");
				System.out.println("4. Alunos");
				System.out.println("0. Voltar");
				int campoIndex = util.Method.lerInt("\nCampo: ");
				if (campoIndex == 0)
					break;
				if (campoIndex < 1 || campoIndex > 4) {
					InvalidOption invalidOption = new InvalidOption();
					System.out.println(invalidOption.getMessage());
					util.Method.continueEnter();
					continue;
				}
				switch (campoIndex) {
				case 1:
					System.out.print("Novo nome: ");
					String nome = sc.nextLine();
					professores.get(professorIndex).setNome(nome);
					break;
				case 2:
					System.out.print("Nova idade: ");
					String idade = sc.nextLine();
					professores.get(professorIndex).setIdade(Integer.parseInt(idade));
					break;
				case 3:
					ArrayList<String> cursos = new ArrayList<>();
					System.out.println("Para encerrar: <ENTER>");
					while (true) {
						System.out.print("Add curso: ");
						String curso = sc.nextLine();
						if (curso.isEmpty() || curso.isBlank())
							break;
						cursos.add(curso);
					}
					professores.get(professorIndex).setCursos(cursos);
					break;
				case 4:
					ArrayList<String> alunos = new ArrayList<>();
					System.out.println("Para encerrar: <ENTER>");
					while (true) {
						System.out.print("Add aluno: ");
						String curso = sc.nextLine();
						if (curso.isEmpty() || curso.isBlank())
							break;
						alunos.add(curso);
					}
					professores.get(professorIndex).setAlunos(alunos);
					break;
				}
				System.out.println();
			} catch (ResourceUnexists e) {
				System.out.println(e.getMessage());
				util.Method.continueEnter();
				break;
			} catch (ReadInt e) {
				System.out.println(e.getMessage());
				util.Method.continueEnter();
				continue;
			} catch (NumberFormatException e) {
				System.out.println("Valor passado não é inteiro!");
				util.Method.continueEnter();
				break;
			}
		}
	}

	private void deletarProfessor() {
		try {
			professores.remove(pegarProfessor().getIndex());
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
