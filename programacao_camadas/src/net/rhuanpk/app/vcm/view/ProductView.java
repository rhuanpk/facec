package net.rhuanpk.app.vcm.view;

import net.rhuanpk.app.vcm.controller.ProductController;

import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);
    private final ProductController controller;

    public ProductView(ProductController controller) {
        this.controller = controller;
    }

    public void update() {
        System.out.print("Product name: ");
        String name = scanner.nextLine();

        System.out.print("Product price: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product SKU: ");
        String sku = scanner.nextLine();

        controller.update(name, price, sku);
    }

    public void print() {
        String name = controller.getName();
        Double price = controller.getPrice();
        String sku = controller.getSku();

        String text = "===== PRODUCT =====\n" +
                String.format("- Product: %s [%s]\n", name, sku) +
                String.format("- Price: R$ %.2f\n", price) +
                "===================";
        System.out.println(text);
    }

    public void close() {
        scanner.close();
    }
}
