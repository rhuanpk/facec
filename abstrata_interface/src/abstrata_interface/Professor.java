package abstrata_interface;

public class Professor extends Pessoa implements Acoes {

	private String disciplina;

	@Override
	public void alimenta() {
		System.out.println("professor se alimentando");
	}

	@Override
	public void comprimenta() {
		System.out.println("professor comprimentando");
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
