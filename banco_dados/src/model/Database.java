package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String DSN = "jdbc:sqlite:app.db";
    public final Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(DSN);
        conn.createStatement().executeUpdate("""
                CREATE TABLE IF NOT EXISTS products (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    name TEXT NOT NULL,
                    sku TEXT NOT NULL UNIQUE,
                    price REAL NOT NULL,
                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                )
                """);
    }
}
