package bancodados.util;

import java.util.NoSuchElementException;

public class Terminal {

	public static void wrongOption() throws NoSuchElementException, IllegalStateException {
		System.err.print("invalid option <enter> ");
		Input.scanner.nextLine();
	}

}
