package net.rhuanpk.app.trygvereenskaug.layers.view;

import net.rhuanpk.app.trygvereenskaug.contracts.observer.Observer;
import net.rhuanpk.app.trygvereenskaug.layers.controller.ProductController;
import net.rhuanpk.app.trygvereenskaug.layers.model.Product;

import java.util.Scanner;

public class ProductView implements Observer {
    private final Scanner scanner = new Scanner(System.in);
    private final Product model;
    private final ProductController controller;

    public ProductView(Product model, ProductController controller) {
        this.model = model;
        this.controller = controller;
        model.addObserver(this);
    }

    @Override
    public void render() {
        String text = "===== PRODUCT =====\n" +
                String.format("- Product: %s [%s]\n", model.getName(), model.getSku()) +
                String.format("- Price: R$ %.2f\n", model.getPrice()) +
                "===================";
        System.out.println(text);
    }

    @Override
    public void close() {
        scanner.close();
        model.removeObserver(this);
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
}
