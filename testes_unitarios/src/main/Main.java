package main;

import concretas.Ford;
import concretas.Harley;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Ford mustang = new Ford("mach1", "preto");
		System.out.println(mustang);
		Thread.sleep(1000);

		mustang.acelerar(100, 180);
		System.err.println(mustang);
		Thread.sleep(1000);

		mustang.frear();
		System.err.println(mustang);
		Thread.sleep(1000);

		Harley roadster = new Harley("1200", "vermelha");
		System.out.println(roadster);
		Thread.sleep(1000);

		roadster.acelerar(150, 130);
		System.err.println(roadster);
		Thread.sleep(1000);

		roadster.frear();
		System.err.println(roadster);
		Thread.sleep(1000);

	}

}
