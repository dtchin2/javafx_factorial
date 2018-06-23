package factorial;

@SuppressWarnings("serial")
public class LargeNumberException extends Exception {
	
	public LargeNumberException() {
		super("OverFlow Error");
	}
}
