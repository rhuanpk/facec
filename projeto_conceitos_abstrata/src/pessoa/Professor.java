package pessoa;

import java.util.ArrayList;

public class Professor extends Pessoa {

	private ArrayList<String> alunos;

	public Professor() {
		super(tipoProfessor);
		setAlunos(null);
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
		if (this.alunos == null)
			this.alunos = new ArrayList<>();
		if (alunos == null)
			return;
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
