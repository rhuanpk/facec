package net.rhuanpk.app.trygvereenskaug.layers.controller;

import net.rhuanpk.app.trygvereenskaug.layers.model.Product;

public class ProductController {
    private final Product model;

    public ProductController(Product model) {
        this.model = model;
    }

    public void update(String name, Double price, String sku) {
        model.pauseNotifications();

        model.setName(name.trim());
        model.setPrice(price);
        model.setSku(sku.trim());

        model.resumeNotifications();
    }
}
