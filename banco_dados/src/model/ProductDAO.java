package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void create(Product product) throws SQLException {
        try {
            final Database db = new Database();
            final String sql = "INSERT INTO products (name, sku, price) VALUES (?, ?, ?)";

            final PreparedStatement stmt = db.conn.prepareStatement(sql);
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getSku());
            stmt.setDouble(3, product.getPrice());

            stmt.executeUpdate();
            stmt.close();
            db.conn.close();
        } catch (SQLException e) {
            throw new SQLException("error in database execution: " + e.getMessage());
        }
    }

    public List<Product> list() throws SQLException {
        try {
            final Database db = new Database();
            final String sql = "SELECT * FROM products";
            final List<Product> products = new ArrayList<>();

            final ResultSet result = db.conn.createStatement().executeQuery(sql);
            while (result.next()) {
                products.add(new Product(
                        result.getLong("id"),
                        result.getString("name"),
                        result.getString("sku"),
                        result.getDouble("price")
                ));
            }

            result.close();
            db.conn.close();
            return products;
        } catch (SQLException e) {
            throw new SQLException("error in database execution: " + e.getMessage());
        }
    }

    public Product get(String sku) throws SQLException {
        try {
            final Database db = new Database();
            final String sql = "SELECT * FROM products WHERE sku = ?";
            final Product product = new Product();

            final PreparedStatement stmt = db.conn.prepareStatement(sql);
            stmt.setString(1, sku);

            final ResultSet result = stmt.executeQuery();
            if (!result.next())
                return new Product();

            product.setId(result.getLong("id"));
            product.setName(result.getString("name"));
            product.setSku(result.getString("sku"));
            product.setPrice(result.getDouble("price"));

            result.close();
            db.conn.close();
            return product;
        } catch (SQLException e) {
            throw new SQLException("error in database execution: " + e.getMessage());
        }
    }

    public void update(Product product) throws SQLException {
        try {
            final Database db = new Database();
            final String sql = "UPDATE products SET name = ?, price = ? WHERE sku = ?";

            final PreparedStatement stmt = db.conn.prepareStatement(sql);
            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getPrice());
            stmt.setString(3, product.getSku());

            stmt.executeUpdate();
            stmt.close();
            db.conn.close();
        } catch (SQLException e) {
            throw new SQLException("error in database execution: " + e.getMessage());
        }
    }

    public void delete(String sku) throws SQLException {
        try {
            final Database db = new Database();
            final String sql = "DELETE FROM products WHERE sku = ?";

            final PreparedStatement stmt = db.conn.prepareStatement(sql);
            stmt.setString(1, sku);

            stmt.executeUpdate();
            stmt.close();
            db.conn.close();
        } catch (SQLException e) {
            throw new SQLException("error in database execution: " + e.getMessage());
        }
    }
}
