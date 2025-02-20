package exception;

@SuppressWarnings("serial")
public class ResourceUnexists extends Exception {

	public ResourceUnexists() {
		super("Recurso não existe!");
	}

}
