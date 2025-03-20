package gerador_relatorios.direto.relatorio;

public class Relatorio {

	public static void processar(String cliente) {

		double delay = Math.random() * 5000;

		try {
			System.out.println(String.format("Processando relatório: %s (%fms)", cliente, delay));
			Thread.sleep((long) delay);
			System.out.println("Finalizado relatório: " + cliente);
		} catch (InterruptedException e) {
			System.err.println("Erro em processar relatório: " + cliente);
		}

	}

}
