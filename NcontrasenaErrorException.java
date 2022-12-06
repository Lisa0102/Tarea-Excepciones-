
public class NcontrasenaErrorException extends ContrasenaErrorException {
	public NcontrasenaErrorException(String nc) {
		super("No coinciden");
		
	}

	public NcontrasenaErrorException(String message) {
		super(message);

	}
	
}
