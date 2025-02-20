package result;

public class Professor {

	private int index;
	private pessoa.Professor professor;

	public Professor(int index, pessoa.Professor professor) {
		this.index = index;
		this.professor = professor;
	}

	public int getIndex() {
		return index;
	}

	public pessoa.Professor getProfessor() {
		return professor;
	}

}
