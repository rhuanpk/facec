package calculadora;

import java.util.Scanner;

public class Calculadora {

	private static Scanner scanner = new Scanner(System.in);

	public static void somar() {
		float numero1 = getInput();
		float numero2 = getInput();
		float resultado = numero1 + numero2;
		System.out.println("resultado = " + resultado);
	}

	public static void subtrair() {
		float numero1 = getInput();
		float numero2 = getInput();
		float resultado = numero1 - numero2;
		System.out.println("resultado = " + resultado);
	}

	public static void multiplicar() {
		float numero1 = getInput();
		float numero2 = getInput();
		float resultado = numero1 * numero2;
		System.out.println("resultado = " + resultado);
	}

	public static void dividir() {
		float numero1 = getInput();
		float numero2 = getInput();
		float resultado = numero1 / numero2;
		System.out.println("resultado = " + resultado);
	}

	private static float getInput() {
		System.out.print("numero: ");
		return scanner.nextFloat();
	}

}
