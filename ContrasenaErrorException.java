
public class ContrasenaErrorException extends CuentaErrorException {
	public ContrasenaErrorException(String y) {
		super("Contrasena incorrecta");
	}
	public ContrasenaErrorException(String message) {
		super(message);
	}
}
