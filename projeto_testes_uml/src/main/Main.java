package main;

import java.util.ArrayList;
import java.util.List;

import concretas.Carro;
import concretas.Moto;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Carro mustang = new Carro("Ford", "Mach1", "Preto");
		System.out.println(mustang);
		Thread.sleep(1000);

		ArrayList<String> especificacoesMustang = new ArrayList<String>();
		especificacoesMustang.add("Motor v8");
		especificacoesMustang.add("483cv");
		especificacoesMustang.add("Gasolina");
		mustang.setEspecificacoes(especificacoesMustang);
		System.out.println(mustang);
		Thread.sleep(1000);

		mustang.ligar();
		System.out.println(mustang);
		Thread.sleep(1000);

		mustang.acelerar(100, 180);
		System.err.println(mustang);
		Thread.sleep(1000);

		mustang.frear();
		System.err.println(mustang);
		Thread.sleep(1000);

		mustang.desligar();
		System.out.println(mustang);
		Thread.sleep(1000);

		mustang.printAutonomia(150, 7);
		Thread.sleep(1000);

		Moto roadster = new Moto("Harley", "1200", "vermelha");
		System.out.println(roadster);
		Thread.sleep(1000);

		ArrayList<String> especificacoesRoadster = new ArrayList<String>();
		especificacoesRoadster.add("Moto Evolution");
		especificacoesRoadster.add("1202cv");
		especificacoesRoadster.add("Gasolina");
		roadster.setEspecificacoes(especificacoesRoadster);
		System.out.println(roadster);
		Thread.sleep(1000);

		roadster.ligar();
		System.out.println(roadster);
		Thread.sleep(1000);

		roadster.acelerar(100, 180);
		System.err.println(roadster);
		Thread.sleep(1000);

		roadster.frear();
		System.err.println(roadster);
		Thread.sleep(1000);

		roadster.desligar();
		System.out.println(roadster);
		Thread.sleep(1000);

		roadster.printAutonomia(150, 7);
		Thread.sleep(1000);

	}

}
