package bancodados.controller;

import java.sql.SQLException;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;

import bancodados.model.Product;
import bancodados.model.dao.ProductDAO;
import bancodados.util.Log;
import bancodados.util.exceptions.NoDataException;
import bancodados.util.exceptions.SQLConnectionException;
import bancodados.view.ProductView;

public class ProductController {

	private ProductView view;
	private ProductDAO dao;
	private Log log;

	public ProductController() {
		view = new ProductView();
		dao = new ProductDAO();
		log = new Log(this);
	}

	public void create() {

		try {

			Product model = new Product();

			String name = view.readName();
			String sku = view.readSku();
			double price = view.readPrice();

			model.setName(name);
			model.setSku(sku);
			model.setPrice(price);

			dao.create(model);

		} catch (InputMismatchException e) {
			view.error("product price must be float");
		} catch (NoSuchElementException e) {
			log.logger.warning(e.getMessage());
			view.error();
		} catch (IllegalStateException e) {
			log.logger.severe(e.getMessage());
			view.error();
		} catch (IllegalArgumentException e) {
			view.error(e.getMessage());
		} catch (SQLConnectionException e) {
			log.logger.severe(e.getMessage());
			view.error("error database connection");
		} catch (SQLException e) {
			log.logger.severe(e.getMessage());
			view.error();
		}

	}

	public void list() {

		try {

			List<Product> products = dao.list();
			for (Product product : products) {
				view.print(product.getName(), product.getSku(), product.getPrice());
			}

		} catch (SQLConnectionException e) {
			log.logger.severe(e.getMessage());
			view.error("error database connection");
		} catch (SQLException e) {
			log.logger.severe(e.getMessage());
			view.error();
		}

	}

	public void get() {

		try {

			String sku = view.readSku();
			Product product = dao.get(sku);
			view.print(product.getName(), product.getSku(), product.getPrice());

		} catch (NoDataException e) {
			view.message("no product found");
		} catch (NoSuchElementException e) {
			log.logger.warning(e.getMessage());
			view.error();
		} catch (IllegalStateException e) {
			log.logger.severe(e.getMessage());
			view.error();
		} catch (SQLConnectionException e) {
			log.logger.severe(e.getMessage());
			view.error("error database connection");
		} catch (SQLException e) {
			log.logger.severe(e.getMessage());
			view.error();
		}

	}

	public void update() {

		try {

			Product model = new Product();
			String sku = view.readSku();
			Product product = dao.get(sku);

			String name = view.readName(product.getName());
			double price = view.readPrice(product.getPrice());

			model.setName(name);
			model.setSku(product.getSku());
			model.setPrice(price);

			dao.update(model);

		} catch (NoDataException e) {
			view.message("no product found");
		} catch (NoSuchElementException e) {
			log.logger.warning(e.getMessage());
			view.error();
		} catch (IllegalStateException e) {
			log.logger.severe(e.getMessage());
			view.error();
		} catch (IllegalFormatException | NullPointerException e) {
			log.logger.severe(e.getMessage());
			view.error();
		} catch (NumberFormatException e) {
			view.error("product price must be float");
		} catch (IllegalArgumentException e) {
			view.error(e.getMessage());
		} catch (SQLConnectionException e) {
			log.logger.severe(e.getMessage());
			view.error("error database connection");
		} catch (SQLException e) {
			log.logger.severe(e.getMessage());
			view.error();
		}

	}

	public void delete() throws SQLException {

		try {

			String sku = view.readSku();
			dao.delete(sku);

		} catch (NoSuchElementException e) {
			log.logger.warning(e.getMessage());
			view.error();
		} catch (IllegalStateException e) {
			log.logger.severe(e.getMessage());
			view.error();
		} catch (SQLConnectionException e) {
			log.logger.severe(e.getMessage());
			view.error("error database connection");
		} catch (SQLException e) {
			log.logger.severe(e.getMessage());
			view.error();
		}

	}

}
