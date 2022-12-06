
public class CuentaErrorException extends Exception{
	public CuentaErrorException() {
		super ("campo vacio");

	}
	public CuentaErrorException(String message) {
		super(message);

	}

}
