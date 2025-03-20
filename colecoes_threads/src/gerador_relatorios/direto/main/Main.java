package gerador_relatorios.direto.main;

import gerador_relatorios.direto.relatorio.Relatorio;

public class Main {

	public static void main(String[] args) {

		String[] clientes = { "Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E" };

		for (String cliente : clientes) {
			new Thread(() -> Relatorio.processar(cliente)).start();
		}

	}

}
