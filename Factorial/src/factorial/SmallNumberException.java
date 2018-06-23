package factorial;

@SuppressWarnings("serial")
public class SmallNumberException extends Exception {
	
	public SmallNumberException() {
		super("UnderFlow Error");
	}

}
