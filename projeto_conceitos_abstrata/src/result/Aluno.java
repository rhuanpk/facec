package result;

public class Aluno {

	private int index;
	private pessoa.Aluno aluno;

	public Aluno(int index, pessoa.Aluno aluno) {
		this.index = index;
		this.aluno = aluno;
	}

	public int getIndex() {
		return index;
	}

	public pessoa.Aluno getAluno() {
		return aluno;
	}

}
