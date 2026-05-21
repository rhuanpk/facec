package controller;

import model.Product;
import model.ProductDAO;
import view.ProductDTO;
import view.ProductView;

import java.sql.SQLException;

public class ProductController {
    private final ProductDAO dao;
    private final ProductView view;

    public ProductController(ProductDAO dao, ProductView view) {
        this.dao = dao;
        this.view = view;
    }

    public void create() throws SQLException {
        final Product product = new Product();
        final ProductDTO dto = view.read();

        product.setName(dto.name);
        product.setSku(dto.sku);
        product.setPrice(dto.price);

        dao.create(product);
    }

    public void list() throws SQLException {
        dao.list().forEach(product -> {
            view.print(new ProductDTO(
                    product.getName(),
                    product.getSku(),
                    product.getPrice()
            ));
        });
    }

    public void get() throws SQLException {
        final Product product = dao.get(view.readSku());
        view.print(new ProductDTO(
                product.getName(),
                product.getSku(),
                product.getPrice()
        ));
    }

    public void update() throws SQLException {
        dao.update(new Product(
                view.readName(),
                view.readSku(),
                view.readPrice()
        ));
    }

    public void delete() throws SQLException {
        dao.delete(view.readSku());
    }
}
