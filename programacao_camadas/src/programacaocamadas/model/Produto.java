package programacaocamadas.model;

public class Produto {

	private String nome;
	private double preco;
	private String sku;

	public Produto(String nome, double preco, String sku) {
		setNome(nome);
		setPreco(preco);
		setSku(sku);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}
