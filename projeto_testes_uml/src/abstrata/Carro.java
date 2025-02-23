package abstrata;

import interfaces.Combustao;

public abstract class Carro extends Veiculo implements Combustao {

	public Carro(String modelo, String cor) {
		super(modelo, cor);
	}

	@Override
	public void acelerar(float km, int velocidade) {
		System.out.println("destino em " + ((km / velocidade) * 1) + "h");
		setParado(false);
	}

	@Override
	public float autonomia(float km, float combustivel) {
		return km / combustivel;
	}

	public void printAutonomia(float km, float combustivel) {
		System.out.println(getModelo() + " [" + getCor() + "] autonomia: " + autonomia(km, combustivel));
	}

}
