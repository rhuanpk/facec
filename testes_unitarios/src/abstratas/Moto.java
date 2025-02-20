package abstratas;

public abstract class Moto extends Veiculo {

	public Moto(String modelo, String cor) {
		super(modelo, cor);
	}

	@Override
	public void acelerar(float km, int velocidade) {
		System.out.println("destino em " + ((km / velocidade) * 0.9) + "h");
		setParado(false);
	}

}
