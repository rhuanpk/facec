package excecoes;

@SuppressWarnings("serial")
public class IllegalState extends Exception {

	private final static String message = "estado ilegal do objeto";

	public IllegalState() {
		super(message);
	}

	public IllegalState(String mensagem) {
		super(message + ": " + mensagem);
	}

}
