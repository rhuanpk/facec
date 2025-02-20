package concretas;

import abstratas.Moto;

public class Harley extends Moto {

	public Harley(String modelo, String cor) {
		super(modelo, cor);
	}

	@Override
	public void frear() {
		System.out.println("frenagem em 5s");
		setParado(true);
	}

}
