package polimorfismo;

public class Funcionario extends Pessoa {

	@Override
	public void corre() {
		System.out.println("funcionario correndo");
	}

	public void funcionarioCorre() {
		this.corre();
	}

	public void pessoaCorre() {
		super.corre();
	}

}
