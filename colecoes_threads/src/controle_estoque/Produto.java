package controle_estoque;

import java.util.Objects;

import util.ThrowNew;

public class Produto {

	private static int serial = 0;

	private String nome;
	private String sku;
	private int codigo;
	private int quantidade;
	private boolean skuDefinido;

	public Produto(String nome, String sku, int quantidade) throws IllegalArgumentException {
		setNome(nome);
		setSku(sku);
		setCodigo();
		setQuantidade(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws IllegalArgumentException {
		ThrowNew.ifBlankString(nome, "nome");
		this.nome = nome;
	}

	public String getSku() {
		return sku;
	}

	private void setSku(String sku) {
		ThrowNew.ifTrueBoolean(skuDefinido, "skuDefinido");
		ThrowNew.ifBlankString(sku, "sku");
		this.skuDefinido = true;
		this.sku = sku;
	}

	public int getCodigo() {
		return codigo;
	}

	private void setCodigo() {
		this.codigo = ++serial;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		ThrowNew.ifLessThanZero(quantidade, "quantidade");
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Produto{");
		sb.append(String.format("nome='%s', ", nome));
		sb.append(String.format("sku=%s, ", sku));
		sb.append(String.format("codigo=%d, ", codigo));
		sb.append(String.format("quantidade=%d", quantidade));
		sb.append("}");

		return sb.toString();

	}

	/*
	 * Implementations of Set interface 1th uses hashCode() and if find 2th uses
	 * equals() to double check if in fact already exists the element in Set
	 */

	@Override
	public boolean equals(Object object) {

		if (this == object)
			return true;

		if (!(object instanceof Produto))
			return false;

		Produto produto = (Produto) object;
		return sku == produto.sku;

	}

	@Override
	public int hashCode() {
		return Objects.hash(sku);
	}

}
