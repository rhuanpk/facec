package net.rhuanpk.app.cvm.controller;

import net.rhuanpk.app.cvm.model.Product;
import net.rhuanpk.app.cvm.view.ProductView;

public class ProductController {
    private final Product model;
    private final ProductView view;

    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void update() {
        model.setName(view.readName());
        model.setPrice(view.readPrice());
        model.setSku(view.readSku());
    }

    public void print() {
        view.print(model.getName(), model.getPrice(), model.getSku());
    }
}
