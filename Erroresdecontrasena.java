
public class Erroresdecontrasena extends ContrasenaErrorException {
	public  Erroresdecontrasena(String ec) {
		super("Solo se admiten caracteres alfanumericos");
	
	}

	public Erroresdecontrasena(String message) {
		super(message);

	}
	

}
