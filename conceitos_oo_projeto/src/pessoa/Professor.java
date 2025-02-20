package pessoa;

import java.util.ArrayList;

import interfaces.Menu;
import interfaces.SubMenu;

public class Professor extends Pessoa {

	private ArrayList<String> alunos;

	public Professor() {
		super(tipoProfessor);
	}

	public Professor(String nome, int idade, ArrayList<String> cursos, ArrayList<String> alunos) {
		super(tipoProfessor, nome, idade, cursos);
		setAlunos(alunos);
	}

	@Override
	public void printInfos() {
		super.printInfos();
		System.out.println("Alunos: " + alunos);
	}

	public ArrayList<String> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<String> alunos) {
		alunos.forEach(aluno -> {
			if (aluno.isEmpty() || aluno.isBlank())
				aluno = "N/A";
			this.alunos.add(aluno);
		});
	}

	public void appendAlunos(ArrayList<String> alunos) {
		for (int index = 0; index < alunos.size(); index++) {
			String aluno = alunos.get(index);
			if (aluno.isEmpty() || aluno.isBlank())
				alunos.set(index, "N/A");
		}
		this.alunos.addAll(cursos);
	}

}
