package encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;

	public void corre() {
		System.out.println("pessoa correndo");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
