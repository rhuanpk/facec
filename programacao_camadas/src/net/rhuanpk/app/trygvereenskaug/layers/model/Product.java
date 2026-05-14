package net.rhuanpk.app.trygvereenskaug.layers.model;

public class Product extends Model {
    private String name;
    private Double price;
    private String sku;

    public Product() {
        name = "";
        price = 0.0;
        sku = "";
    }

    public Product(String name, Double price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            return;
        }
        this.name = name;
        dispatchNotifications();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            return;
        }
        this.price = price;
        dispatchNotifications();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        if (sku.isBlank()) {
            return;
        }
        this.sku = sku;
        dispatchNotifications();
    }
}
