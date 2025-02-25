package abstrata;

public abstract class Motorizado extends Veiculo implements interfaces.Motorizado {

	private boolean ligado;
	private boolean desligado;

	public Motorizado() {
		super();
		setDesligado();
	}

	public Motorizado(String marca, String modelo, String cor) {
		super(marca, modelo, cor);
		setDesligado();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\n- Ligado: " + isLigado() + "\n");
		sb.append("- Desligado: " + isDesligado());
		return sb.toString();
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado() {
		this.ligado = true;
		setDesligado(false);
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isDesligado() {
		return desligado;
	}

	public void setDesligado() {
		this.desligado = true;
		setLigado(false);
	}

	private void setDesligado(boolean desligado) {
		this.desligado = desligado;
	}

}
