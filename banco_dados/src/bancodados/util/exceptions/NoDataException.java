package bancodados.util.exceptions;

@SuppressWarnings("serial")
public class NoDataException extends RuntimeException {

	public NoDataException() {
		super("no data reached");
	}

	public NoDataException(String message) {
		super("no data reached: " + message);
	}

}
