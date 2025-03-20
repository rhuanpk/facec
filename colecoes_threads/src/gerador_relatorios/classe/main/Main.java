package gerador_relatorios.classe.main;

import gerador_relatorios.classe.relatorio.Relatorio;

public class Main {

	public static void main(String[] args) {

		String[] clientes = { "Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E" };

		for (String cliente : clientes) {
			new Thread(new Relatorio(cliente)).start();
		}

	}

}
