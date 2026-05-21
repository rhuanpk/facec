package view;

public class ProductDTO {
    public long id;
    public String name;
    public String sku;
    public double price;

    public ProductDTO() {
        id = 0;
        name = "";
        sku = "";
        price = 0;
    }

    public ProductDTO(String name, String sku, double price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }

    public ProductDTO(long id, String name, String sku, double price) {
        this.id = id;
        this.name = name;
        this.sku = sku;
        this.price = price;
    }
}
