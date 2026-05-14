package net.rhuanpk.app.vcm.controller;

import net.rhuanpk.app.vcm.model.Product;

public class ProductController {
    private final Product model;

    public ProductController(Product model) {
        this.model = model;
    }

    public void update(String name, Double price, String sku) {
        model.setName(name);
        model.setPrice(price);
        model.setSku(sku);
    }

    public String getName() {
        return model.getName();
    }

    public Double getPrice() {
        return model.getPrice();
    }

    public String getSku() {
        return model.getSku();
    }
}
