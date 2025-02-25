package concretas;

import abstrata.Motorizado;

public class Carro extends Motorizado {

	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, String cor) {
		super(marca, modelo, cor);
	}

	@Override
	public String toString() {
		return "Carro:\n" + super.toString();
	}

	@Override
	public void acelerar(float km, int velocidade) {
		if (isDesligado()) {
			System.out.println(tituloVeiculo() + " precisa estar LIGADO para acelerar");
			return;
		}
		System.out.println(tituloVeiculo() + " DESTINO em " + ((km / velocidade) * 1) + "h");
		setMovimento();
	}

	@Override
	public void frear() {
		try {
			if (isDesligado() || isParado()) {
				System.out.println(tituloVeiculo() + " precisa estar LIGADO e em MOVIMENTO para parar");
				return;
			}
			System.out.print(tituloVeiculo() + " FRENAGEM em 1.5s... ");
			Thread.sleep(1500);
			setParado();
			System.out.println("PARADO");
		} catch (InterruptedException e) {
		}
	}

	@Override
	public void ligar() {
		if (isLigado()) {
			System.out.println(tituloVeiculo() + " precisa estar DESLIGADO para ligar");
			return;
		}
		setLigado();
		System.out.println(tituloVeiculo() + " LIGOU");
	}

	@Override
	public void desligar() {
		if (isDesligado()) {
			System.out.println(tituloVeiculo() + " precisa estar LIGADO para desligar");
			return;
		}
		setDesligado();
		System.out.println(tituloVeiculo() + " DESLIGOU");
	}

	@Override
	public float autonomia(float km, float combustivel) {
		return km / combustivel;
	}

	public void printAutonomia(float km, float combustivel) {
		System.out.println(tituloVeiculo() + " AUTONOMIA: " + autonomia(km, combustivel));
	}

	@Override
	public String tituloVeiculo() {
		return "Carro: " + super.tituloVeiculo();
	}

}
