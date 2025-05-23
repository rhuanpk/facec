package bancodados.util.exceptions;

@SuppressWarnings("serial")
public class SQLConnectionException extends RuntimeException {

	public SQLConnectionException() {
		super("can't connect to the database");
	}

	public SQLConnectionException(String message) {
		super("can't connect to the database: " + message);
	}

}
