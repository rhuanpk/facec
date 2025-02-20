package pessoa;

import java.util.ArrayList;

import interfaces.Menu;
import interfaces.SubMenu;

public class Aluno extends Pessoa {

	private ArrayList<String> professores;

	public Aluno() {
		super(tipoAluno);
	}

	public Aluno(String nome, int idade, ArrayList<String> cursos, ArrayList<String> professores) {
		super(tipoAluno, nome, idade, cursos);
		setProfessores(professores);
	}

	@Override
	public void printInfos() {
		super.printInfos();
		System.out.println("Professores: " + professores);
	}

	public ArrayList<String> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<String> professores) {
		professores.forEach(professor -> {
			if (professor.isEmpty() || professor.isBlank())
				professor = "N/A";
			this.professores.add(professor);
		});
	}

	public void appendProfessores(ArrayList<String> professores) {
		for (int index = 0; index < professores.size(); index++) {
			String professor = professores.get(index);
			if (professor.isEmpty() || professor.isBlank())
				professores.set(index, "N/A");
		}
		this.professores.addAll(cursos);
	}

}
