
public class UsuarioErrorException extends CuentaErrorException{
	public UsuarioErrorException(String x) {
		super("Usuario incorrecto");
	}
	public UsuarioErrorException(String message) {
		super(message);
	}

}
