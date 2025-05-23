package bancodados.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import bancodados.util.exceptions.SQLConnectionException;

public class Database {

	private final String DSN = "jdbc:postgresql://localhost:5432/postgres?ssl=false";
	public Connection conn;

	public Database() throws SQLConnectionException {
		try {
			conn = DriverManager.getConnection(DSN, "postgres", "postgres");
		} catch (SQLException e) {
			throw new SQLConnectionException(e.getMessage());
		}
	}

}
