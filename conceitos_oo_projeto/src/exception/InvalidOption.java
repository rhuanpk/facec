package exception;

@SuppressWarnings("serial")
public class InvalidOption extends Exception {

	public InvalidOption() {
		super("Opção inválida!");
	}

}
