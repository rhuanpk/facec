package abstratas;

import interfaces.Combustao;

public abstract class Moto extends Veiculo implements Combustao {

	public Moto(String modelo, String cor) {
		super(modelo, cor);
	}

	@Override
	public void acelerar(float km, int velocidade) {
		System.out.println("destino em " + ((km / velocidade) * 0.9) + "h");
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
