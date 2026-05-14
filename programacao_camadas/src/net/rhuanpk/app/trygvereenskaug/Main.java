package net.rhuanpk.app.trygvereenskaug;

import net.rhuanpk.app.trygvereenskaug.layers.controller.ProductController;
import net.rhuanpk.app.trygvereenskaug.layers.model.Product;
import net.rhuanpk.app.trygvereenskaug.layers.view.ProductView;

public class Main {
    static void main() {
        Product model = new Product();
        ProductController controller = new ProductController(model);
        ProductView view = new ProductView(model, controller);

        view.update();
        view.close();
    }
}
