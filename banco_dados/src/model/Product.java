package model;

public class Product {
    private long id;
    private String name;
    private String sku;
    private double price;

    public Product() {
        id = 0;
        name = "";
        sku = "";
        price = 0;
    }

    public Product(String name, String sku, double price) {
        setName(name);
        setSku(sku);
        setPrice(price);
    }

    public Product(long id, String name, String sku, double price) {
        setId(id);
        setName(name);
        setSku(sku);
        setPrice(price);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) throws IllegalArgumentException {
        if (id < 1) {
            throw new IllegalArgumentException("id cant be less than 1");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("name cant be empty or blank");
        }
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) throws IllegalArgumentException {
        if (sku.isBlank()) {
            throw new IllegalArgumentException("sku cant be empty or blank");
        }
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price < 0) {
            throw new IllegalArgumentException("id cant be less than 0");
        }
        this.price = price;
    }
}
