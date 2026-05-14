package net.rhuanpk.app.vcm;

import net.rhuanpk.app.vcm.controller.ProductController;
import net.rhuanpk.app.vcm.model.Product;
import net.rhuanpk.app.vcm.view.ProductView;

public class Main {
    static void main() {
        Product model = new Product();
        ProductController controller = new ProductController(model);
        ProductView view = new ProductView(controller);

        view.update();
        view.print();
    }
}
