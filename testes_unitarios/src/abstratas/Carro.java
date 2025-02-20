package abstratas;

public abstract class Carro extends Veiculo {

	public Carro(String modelo, String cor) {
		super(modelo, cor);
	}

	@Override
	public void acelerar(float km, int velocidade) {
		System.out.println("destino em " + ((km / velocidade) * 1) + "h");
		setParado(false);
	}

}
