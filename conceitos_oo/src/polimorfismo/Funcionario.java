package polimorfismo;

public class Funcionario extends Pessoa {

	@Override
	public void setNome(String nome) {
		if (nome == "") {
			nome = "sem nome";
		}
		super.setNome(nome);
	}

}
