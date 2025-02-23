package abstrata;

import interfaces.Acoes;

public abstract class Veiculo implements Acoes {

	private String modelo;
	private String cor;
	private boolean parado;

	public Veiculo(String modelo, String cor) {
		setModelo(modelo);
		setCor(cor);
		setParado(true);
	}

	public String toString() {
		return getModelo() + " [" + getCor() + "] parado: " + isParado();
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isParado() {
		return parado;
	}

	protected void setParado(boolean parado) {
		this.parado = parado;
	}

}
