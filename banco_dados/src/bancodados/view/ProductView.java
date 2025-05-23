package bancodados.view;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import bancodados.util.Input;
import bancodados.util.Terminal;
import bancodados.util.exceptions.Exceptions;

public class ProductView {

	public String readName() throws NoSuchElementException, IllegalStateException {
		System.out.print("nome do produto: ");
		return Input.scanner.nextLine();
	}

	public String readName(String current)
			throws NoSuchElementException, IllegalStateException, IllegalFormatException, NullPointerException {
		System.out.printf("nome do produto (%s): ", current);
		String name = Input.scanner.nextLine();
		return name.isBlank() ? current : name;
	}

	public String readSku() throws NoSuchElementException, IllegalStateException {
		System.out.print("sku do produto: ");
		return Input.scanner.nextLine();
	}

	public String readSku(String current)
			throws NoSuchElementException, IllegalStateException, IllegalFormatException, NullPointerException {
		System.out.printf("sku do produto (%s): ", current);
		String sku = Input.scanner.nextLine();
		return sku.isBlank() ? current : sku;
	}

	public double readPrice() throws InputMismatchException, NoSuchElementException, IllegalStateException {

		try {

			System.out.print("preco do produto: ");
			double price = Input.scanner.nextDouble();
			return price;

		} catch (InputMismatchException e) {
			Input.scanner.nextLine();
			throw e;
		}

	}

	public double readPrice(double current) throws NoSuchElementException, IllegalStateException,
			IllegalFormatException, NullPointerException, NumberFormatException {
		double price = current;

		System.out.printf("preco do produto ($%.2f): ", current);
		String reply = Input.scanner.nextLine();

		if (!reply.isBlank())
			price = Double.parseDouble(reply);

		return price;
	}

	public void print(String name, String sku, double price) {
		System.out.println("----- detalhe -----");
		System.out.println("produto: " + name);
		System.out.println("sku: " + sku);
		System.out.println("preco: $" + price);
	}

	public void message() {
		// System.err.println("view: " + Exceptions.ERROR_MESSAGE);
		System.out.println(Exceptions.ERROR_MESSAGE);
	}

	public void message(String message) {
		// System.err.println("view: " + message);
		System.out.println(message);
	}

	// public String messageString() {
	// return Exceptions.ERROR_MESSAGE + "view layer";
	// }

	// public String messageString(String message) {
	// return Exceptions.ERROR_MESSAGE + "view layer: " + message;
	// }

	public void error() {
		// System.err.println("view: " + Exceptions.ERROR_MESSAGE);
		System.err.println(Exceptions.ERROR_MESSAGE);
	}

	public void error(String message) {
		// System.err.println("view: " + message);
		System.err.println(message);
	}

	// public String errorString() {
	// return Exceptions.ERROR_MESSAGE + "view layer";
	// }

	// public String errorString(String message) {
	// return Exceptions.ERROR_MESSAGE + "view layer: " + message;
	// }

	public static int menu() throws NoSuchElementException, IllegalStateException {

		while (true) {

			int option;

			System.out.println("##### produtos #####");
			System.out.println("1. criar");
			System.out.println("2. listar");
			System.out.println("3. pegar");
			System.out.println("4. atualizar");
			System.out.println("5. deletar");
			System.out.println("0. sair");
			System.out.print("escolha: ");

			try {
				option = Input.scanner.nextInt();
			} catch (InputMismatchException e) {
				Terminal.wrongOption();
				continue;
			} finally {
				Input.scanner.nextLine();
			}

			if (option < 0 || option > 5) {
				Terminal.wrongOption();
				continue;
			}

			return option;

		}

	}

}
