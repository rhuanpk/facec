package interfaces;

import excecoes.IllegalState;

public interface Motorizado {

	public void ligar() throws IllegalState;

	public void desligar() throws IllegalState;

	public float autonomia(float km, float combustivel);

}
