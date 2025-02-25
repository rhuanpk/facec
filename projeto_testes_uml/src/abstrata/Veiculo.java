package abstrata;

import java.util.ArrayList;

public abstract class Veiculo implements interfaces.Veiculo {

	private String marca;
	private String modelo;
	private String cor;
	private boolean movimento;
	private boolean parado;
	private ArrayList<String> especificacoes;

	public Veiculo() {
		setMarca("N/A");
		setModelo("N/A");
		setCor("N/A");
		setParado();
		setEspecificacoes(null);
	}

	public Veiculo(String marca, String modelo, String cor) {
		setMarca(marca);
		setModelo(modelo);
		setCor(cor);
		setParado();
		setEspecificacoes(null);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("- Marca: " + getMarca() + "\n");
		sb.append("- Modelo: " + getModelo() + "\n");
		sb.append("- Cor: " + getCor() + "\n");
		sb.append("- Movimento: " + isMovimento() + "\n");
		sb.append("- Parado: " + isParado() + "\n");
		sb.append("- Especificações: " + getEspecificacoes());
		return sb.toString();
	}

	public String tituloVeiculo() {
		return getMarca() + " " + getModelo() + " [" + getCor() + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isMovimento() {
		return movimento;
	}

	public void setMovimento() {
		this.movimento = true;
		setParado(false);
	}

	private void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}

	public boolean isParado() {
		return parado;
	}

	public void setParado() {
		this.parado = true;
		setMovimento(false);
	}

	private void setParado(boolean parado) {
		this.parado = parado;
	}

	public ArrayList<String> getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(ArrayList<String> especificacoes) {
		this.especificacoes = especificacoes;
	}

	public void addEspecificacoes(ArrayList<String> especificacoes) {
		if (especificacoes == null)
			return;
		if (this.especificacoes == null)
			this.especificacoes = new ArrayList<String>();
		this.especificacoes.addAll(especificacoes);
	}

}
