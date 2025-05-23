package bancodados.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bancodados.model.Product;
import bancodados.util.exceptions.NoDataException;
import bancodados.util.exceptions.SQLConnectionException;

public class ProductDAO {

	public void create(Product product) throws SQLException, SQLConnectionException {

		try {

			Database db = new Database();
			String sql = "INSERT INTO products (name, sku, price) VALUES (?, ?, ?)";

			PreparedStatement stmt = db.conn.prepareStatement(sql);
			stmt.setString(1, product.getName());
			stmt.setString(2, product.getSku());
			stmt.setDouble(3, product.getPrice());

			stmt.executeUpdate();
			stmt.close();
			db.conn.close();

		} catch (SQLException e) {
			throw new SQLException("error in sql execution: " + e.getMessage());
		} catch (SQLConnectionException e) {
			throw new SQLConnectionException(e.getMessage());
		}

	}

	public List<Product> list() throws SQLException, SQLConnectionException {

		try {

			Database db = new Database();
			String sql = "SELECT * FROM products";
			List<Product> products = new ArrayList<>();

			ResultSet result = db.conn.createStatement().executeQuery(sql);
			while (result.next()) {
				Product product = new Product();
				product.setId(result.getLong("id"));
				product.setName(result.getString("name"));
				product.setSku(result.getString("sku"));
				product.setPrice(result.getDouble("price"));
				products.add(product);
			}

			result.close();
			db.conn.close();
			return products;

		} catch (SQLException e) {
			throw new SQLException("error in sql execution: " + e.getMessage());
		} catch (SQLConnectionException e) {
			throw new SQLConnectionException(e.getMessage());
		}

	}

	public Product get(String sku) throws SQLException, SQLConnectionException, NoDataException {

		try {

			Database db = new Database();
			String sql = "SELECT * FROM products WHERE sku = ?";
			Product product = new Product();

			PreparedStatement stmt = db.conn.prepareStatement(sql);
			stmt.setString(1, sku);

			ResultSet result = stmt.executeQuery();
			if (!result.next())
				throw new NoDataException("no rows in result");

			product.setId(result.getLong("id"));
			product.setName(result.getString("name"));
			product.setSku(result.getString("sku"));
			product.setPrice(result.getDouble("price"));

			result.close();
			db.conn.close();
			return product;

		} catch (SQLException e) {
			throw new SQLException("error in sql execution: " + e.getMessage());
		} catch (SQLConnectionException e) {
			throw new SQLConnectionException(e.getMessage());
		}

	}

	public void update(Product product) throws SQLException, SQLConnectionException {

		try {

			Database db = new Database();
			String sql = "UPDATE products SET name = ?, price = ? WHERE sku = ?";

			PreparedStatement stmt = db.conn.prepareStatement(sql);
			stmt.setString(1, product.getName());
			stmt.setDouble(2, product.getPrice());
			stmt.setString(3, product.getSku());

			stmt.executeUpdate();
			stmt.close();
			db.conn.close();

		} catch (SQLException e) {
			throw new SQLException("error in sql execution: " + e.getMessage());
		} catch (SQLConnectionException e) {
			throw new SQLConnectionException(e.getMessage());
		}

	}

	public void delete(String sku) throws SQLException, SQLConnectionException {

		try {

			Database db = new Database();
			String sql = "DELETE FROM products WHERE sku = ?";

			PreparedStatement stmt = db.conn.prepareStatement(sql);
			stmt.setString(1, sku);

			stmt.executeUpdate();
			stmt.close();
			db.conn.close();

		} catch (SQLException e) {
			throw new SQLException("error in sql execution: " + e.getMessage());
		} catch (SQLConnectionException e) {
			throw new SQLConnectionException(e.getMessage());
		}

	}

}
