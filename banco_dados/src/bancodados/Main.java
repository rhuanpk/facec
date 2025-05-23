package bancodados;

import java.sql.SQLException;
import java.util.InputMismatchException;

import bancodados.controller.ProductController;
import bancodados.util.Input;
import bancodados.util.Option;
import bancodados.util.Terminal;
import bancodados.util.exceptions.Exceptions;
import bancodados.view.ProductView;

public class Main {

	public static void main(String[] args) throws SQLException {

		try {

			ProductController product = new ProductController();
			int option = Option.start;

			while (option != 0) {

				System.out.println("##### sistema #####");
				System.out.println("1. produtos");
				System.out.println("2. vendas");
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

		} catch (Exception e) {
			System.err.println(Exceptions.ERROR_MESSAGE);
		} finally {
			Input.scanner.close();
		}

	}

}
