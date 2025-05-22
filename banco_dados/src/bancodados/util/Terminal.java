package bancodados.util;

import java.util.Scanner;

public class Terminal {

	private static Scanner scanner = new Scanner(System.in);

	public static void wrongOption() {
		System.err.print("opcao invalida <enter> ");
		scanner.nextLine();
	}

}
