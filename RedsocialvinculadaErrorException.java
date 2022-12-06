
public class RedsocialvinculadaErrorException extends UsuarioErrorException {
	public RedsocialvinculadaErrorException(String red) {
		super("No esta vinculada a esa red");
		
	}

	public RedsocialvinculadaErrorException(String message) {
		super(message);

	}
	
}
