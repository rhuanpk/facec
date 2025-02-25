package concretas;

import abstrata.Motorizado;
import excecoes.IllegalState;

public class Moto extends Motorizado {

	public Moto() {
		super();
	}

	public Moto(String marca, String modelo, String cor) {
		super(marca, modelo, cor);
	}

	@Override
	public String toString() {
		return "Moto:\n" + super.toString();
	}

	@Override
	public float acelerar(float km, int velocidade) throws IllegalState {
		if (isDesligado())
			throw new IllegalState(tituloVeiculo() + " precisa estar LIGADO para acelerar");
		setMovimento();
		return (km / velocidade) * 0.9f;
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
		return (km / combustivel) * 1.25f;
	}

	@Override
	public String tituloVeiculo() {
		return "Moto: " + super.tituloVeiculo();
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
