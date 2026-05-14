package net.rhuanpk.app.cvm.view;

import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);

    public String readName() {
        System.out.print("Product name: ");
        return scanner.nextLine();
    }

    public Double readPrice() {
        System.out.print("Product price: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return price;
    }

    public String readSku() {
        System.out.print("Product SKU: ");
        return scanner.nextLine();
    }

    public void print(String name, Double price, String sku) {
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
