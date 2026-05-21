package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String DSN = "jdbc:sqlite:app.db";
    public final Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(DSN);
    }
}
