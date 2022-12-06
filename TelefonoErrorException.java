import java.io.*;
public class TelefonoErrorException extends UsuarioErrorException {
	public TelefonoErrorException(String num) {
		super ("No existe");
		
	}
	public TelefonoErrorException(String message) {
		super(message);

	}
	

}
