package gerador_relatorios.classe.relatorio;

import util.ThrowNew;

public class Relatorio implements Runnable {

	private String cliente;

	public Relatorio(String cliente) {
		this.cliente = cliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		ThrowNew.ifBlankString(cliente, "cliente");
		this.cliente = cliente;
	}

	@Override
	public void run() {
		try {
			System.out.println("Processando relatório: " + cliente);
			Thread.sleep((long) (Math.random() * 5000));
			System.out.println("Finalizado relatório: " + cliente);
		} catch (InterruptedException e) {
			System.err.println("Erro em processar relatório: " + cliente);
		}
	}

}
