package bancodados;

import java.sql.SQLException;

import bancodados.controller.ProductController;
import bancodados.util.Input;
import bancodados.util.Option;
import bancodados.util.Terminal;
import bancodados.view.ProductView;

public class Main {

	public static void main(String[] args) throws SQLException {

		ProductController product = new ProductController();
		int option = Option.start;

		while (option != 0) {

			System.out.println("##### sistema #####");
			System.out.println("1. produtos");
			System.out.println("2. vendas");
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

			switch (option) {
			// products
			case 1:
				while (option != 0) {
					option = ProductView.menu();
					switch (option) {
					case 1:
						product.create();
						break;
					case 2:
						product.list();
						break;
					case 3:
						product.get();
						break;
					case 4:
						product.update();
						break;
					case 5:
						product.delete();
						break;
					}
				}
				option = Option.start;
				break;
			// sales
			case 2:
				option = Option.start;
				break;
			// exit
			case 0:
				System.out.println("saindo");
				break;
			default:
				Terminal.wrongOption();
				break;
			}

		}

		Input.scanner.close();

	}

}
