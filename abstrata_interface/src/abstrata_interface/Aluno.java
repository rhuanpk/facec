package abstrata_interface;

public class Aluno extends Pessoa {

	private String curso;

	@Override
	public void comprimenta() {
		System.out.println("aluno comprimentando");
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
