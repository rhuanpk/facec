package menu;

import java.util.ArrayList;
import java.util.Scanner;

import exception.InvalidOption;
import exception.ReadInt;
import exception.ResourceUnexists;
import interfaces.SubMenu;

public class Aluno implements SubMenu {

	private static final Scanner sc = new Scanner(System.in);

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

	private result.Aluno pegarAluno() throws ResourceUnexists {
		while (true) {
			int id;
			try {
				id = util.Method.lerInt("Aluno ID: ");
				for (int index = 0; index < alunos.size(); index++) {
					pessoa.Aluno aluno = alunos.get(index);
					if (aluno.getId() == id) {
						return new result.Aluno(index, aluno);
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

	private void buscarAluno() {
		try {
			pessoa.Aluno aluno = pegarAluno().getAluno();
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
				int alunoIndex = pegarAluno().getIndex();
				System.out.println("1. Nome");
				System.out.println("2. Idade");
				System.out.println("3. Cursos");
				System.out.println("4. Professores");
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
					alunos.get(alunoIndex).setNome(nome);
					break;
				case 2:
					System.out.print("Nova idade: ");
					String idade = sc.nextLine();
					alunos.get(alunoIndex).setIdade(Integer.parseInt(idade));
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
					alunos.get(alunoIndex).setCursos(cursos);
					break;
				case 4:
					ArrayList<String> professores = new ArrayList<>();
					System.out.println("Para encerrar: <ENTER>");
					while (true) {
						System.out.print("Add professor: ");
						String curso = sc.nextLine();
						if (curso.isEmpty() || curso.isBlank())
							break;
						professores.add(curso);
					}
					alunos.get(alunoIndex).setProfessores(professores);
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

	private void deletarAluno() {
		try {
			alunos.remove(pegarAluno().getIndex());
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
