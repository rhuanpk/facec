package interfaces;

import excecoes.IllegalState;

public interface Veiculo {

	public float acelerar(float km, int velocidade) throws IllegalState;

	public void frear() throws IllegalState;

}
