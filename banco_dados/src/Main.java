import controller.ProductController;
import model.ProductDAO;
import view.Menu;
import view.ProductView;

import java.sql.SQLException;

void main() throws SQLException {
    final Scanner scanner = new Scanner(System.in);
    final Menu menu = new Menu();

    final ProductDAO productDAO = new ProductDAO();
    final ProductView productView = new ProductView();
    final ProductController productController = new ProductController(productDAO, productView);

    menu.setOptions("1. Create", "2. List", "3. Get", "4. Update", "5. Delete", "0. Exit");
    loop:
    while (true) {
        menu.print();
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1 -> productController.create();
            case 2 -> productController.list();
            case 3 -> productController.get();
            case 4 -> productController.update();
            case 5 -> productController.delete();
            case 0 -> {
                break loop;
            }
            default -> IO.println("Invalid option!");
        }
    }

    productView.close();
    scanner.close();
}
