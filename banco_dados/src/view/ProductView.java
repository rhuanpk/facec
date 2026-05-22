package view;

import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);

    public String readName() {
        System.out.print("Product name: ");
        return scanner.nextLine();
    }

    public String readSku() {
        System.out.print("Product sku: ");
        return scanner.nextLine();
    }

    public double readPrice() {
        System.out.print("Product price: ");
        final double price = scanner.nextDouble();
        scanner.nextLine();
        return price;
    }

    public ProductDTO read() {
        final String name = readName();
        final String sku = readSku();
        final double price = readPrice();
        return new ProductDTO(name, sku, price);
    }

    public void print(ProductDTO product) {
        final String text = "===== PRODUCT =====\n" +
                String.format("- Product: %s [%s]\n", product.name, product.sku) +
                String.format("- Price: R$ %.2f", product.price);
        System.out.println(text);
    }

    public void close() {
        scanner.close();
    }
}
