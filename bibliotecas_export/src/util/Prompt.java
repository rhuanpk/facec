package util;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Prompt {

	private static Scanner scanner = new Scanner(System.in);

	private static String nextString() throws NoSuchElementException, IllegalStateException {
		return scanner.nextLine();
	}

	public static String string() throws NoSuchElementException, IllegalStateException {
		System.out.print("String input: ");
		return nextString();
	}

	public static String string(String message) throws NoSuchElementException, IllegalStateException {
		System.out.print(message);
		return nextString();
	}

	private static int nextInt() throws InputMismatchException, NoSuchElementException, IllegalStateException {
		return scanner.nextInt();
	}

	public static int integer() throws InputMismatchException, NoSuchElementException, IllegalStateException {
		System.out.print("Integer input: ");
		return nextInt();
	}

	public static int integer(String message)
			throws InputMismatchException, NoSuchElementException, IllegalStateException {
		System.out.print(message);
		return nextInt();
	}

}
