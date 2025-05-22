package bancodados.controller;

import java.sql.SQLException;
import java.util.List;

import bancodados.model.dao.ProductDAO;
import bancodados.model.domain.Product;
import bancodados.view.ProductView;

public class ProductController {

	private ProductView view;
	private ProductDAO dao;

	public ProductController() {
		this.view = new ProductView();
		this.dao = new ProductDAO();
	}

	public void create() throws SQLException {

		Product model = new Product();

		String name = view.readName();
		String sku = view.readSku();
		double price = view.readPrice();

		model.setName(name);
		model.setSku(sku);
		model.setPrice(price);

		dao.create(model);

	}

	public void list() throws SQLException {
		List<Product> products = dao.list();
		for (Product product : products) {
			view.print(product.getName(), product.getSku(), product.getPrice());
		}
	}

	public void get() throws SQLException {
		String sku = view.readSku();
		Product product = dao.get(sku);
		view.print(product.getName(), product.getSku(), product.getPrice());
	}

	public void update() throws SQLException {

		Product model = new Product();
		String sku = view.readSku();
		Product product = dao.get(sku);

		String name = view.readName(product.getName());
		double price = view.readPrice(product.getPrice());

		model.setName(name);
		model.setSku(product.getSku());
		model.setPrice(price);

		dao.update(model);

	}

	public void delete() throws SQLException {
		String sku = view.readSku();
		dao.delete(sku);
	}

}
