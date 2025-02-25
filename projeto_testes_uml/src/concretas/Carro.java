package concretas;

import abstrata.Motorizado;
import excecoes.IllegalState;

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
	public float acelerar(float km, int velocidade) throws IllegalState {
		if (isDesligado())
			throw new IllegalState(tituloVeiculo() + " precisa estar LIGADO para acelerar");
		setMovimento();
		return (km / velocidade) * 1;
	}

	@Override
	public void frear() throws IllegalState {
		try {
			if (isDesligado() || isParado())
				throw new IllegalState(tituloVeiculo() + " precisa estar LIGADO e em MOVIMENTO para parar");
			System.out.print(tituloVeiculo() + " FRENAGEM em 1.5s... ");
			Thread.sleep(1500);
			setParado();
			System.out.println("PARADO");
		} catch (InterruptedException e) {
		}
	}

	@Override
	public void ligar() throws IllegalState {
		if (isLigado())
			throw new IllegalState(tituloVeiculo() + " precisa estar DESLIGADO para ligar");
		setLigado();
		System.out.println(tituloVeiculo() + " LIGOU");
	}

	@Override
	public void desligar() throws IllegalState {
		if (isDesligado())
			throw new IllegalState(tituloVeiculo() + " precisa estar LIGADO para desligar");
		setDesligado();
		System.out.println(tituloVeiculo() + " DESLIGOU");
	}

	@Override
	public float autonomia(float km, float combustivel) {
		return km / combustivel;
	}

	@Override
	public String tituloVeiculo() {
		return "Carro: " + super.tituloVeiculo();
	}

	public void printAcelerar(float km, int velocidade) {
		try {
			System.out.println(tituloVeiculo() + " DESTINO em " + acelerar(km, velocidade) + "h");
		} catch (IllegalState e) {
			System.out.println(e.toString());
		}
	}

	public void printAutonomia(float km, float combustivel) {
		System.out.println(tituloVeiculo() + " AUTONOMIA: " + autonomia(km, combustivel));
	}

}
