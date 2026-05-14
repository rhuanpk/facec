package net.rhuanpk.app.cvm;

import net.rhuanpk.app.cvm.controller.ProductController;
import net.rhuanpk.app.cvm.model.Product;
import net.rhuanpk.app.cvm.view.ProductView;

public class Main {
    static void main() {
        Product product = new Product();
        ProductView productView = new ProductView();
        ProductController productController = new ProductController(product, productView);

        productController.update();
        productController.print();
    }
}
