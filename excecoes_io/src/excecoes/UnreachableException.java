package excecoes;

@SuppressWarnings("serial")
public class UnreachableException extends Exception {

	public UnreachableException() {
		super("the file is unreachable (can not exists)");
	}

}
