package heranca;

public class Aluno extends Pessoa {

	private float nota;

	public void printInfos() {
		System.out.println("nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		System.out.println("nota: " + this.nota);
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

}
