package bancodados.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private final String DSN = "jdbc:postgresql://localhost:5432/postgres?ssl=false";
	public Connection conn;

	public Database() throws SQLException {
		conn = DriverManager.getConnection(DSN, "postgres", "postgres");
	}

}
