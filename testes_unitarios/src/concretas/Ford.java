package concretas;

import abstratas.Carro;

public class Ford extends Carro {

	public Ford(String modelo, String cor) {
		super(modelo, cor);
	}

	@Override
	public void frear() {
		System.out.println("frenagem em 3s");
		setParado(true);
	}

}
