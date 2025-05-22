package bancodados.view;

import bancodados.util.Input;
import bancodados.util.Terminal;

public class ProductView {

	public String readName() {
		System.out.print("nome do produto: ");
		return Input.scanner.nextLine();
	}

	public String readName(String current) {
		System.out.printf("nome do produto (%s): ", current);
		String name = Input.scanner.nextLine();
		return name.isBlank() ? current : name;
	}

	public String readSku() {
		System.out.print("sku do produto: ");
		return Input.scanner.nextLine();
	}

	public String readSku(String current) {
		System.out.printf("sku do produto (%s): ", current);
		String sku = Input.scanner.nextLine();
		return sku.isBlank() ? current : sku;
	}

	public double readPrice() {
		System.out.print("preco do produto: ");
		double price = Input.scanner.nextDouble();
		Input.scanner.nextLine();
		return price;
	}

	public double readPrice(double current) {
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

	public static int menu() {

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

			if (Input.scanner.hasNextInt()) {
				option = Input.scanner.nextInt();
				Input.scanner.nextLine();
			} else {
				Input.scanner.next();
				Terminal.wrongOption();
				continue;
			}

			if (option < 0 || option > 5) {
				Terminal.wrongOption();
				continue;
			}

			return option;

		}

	}

}
