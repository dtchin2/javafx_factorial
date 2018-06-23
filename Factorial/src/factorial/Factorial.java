package factorial;

public class Factorial {

	
	public static Long factorial(Long n) {
		if (n == 0) {
			return (long) 1;
		}
		else {
			return (n * (factorial(n-1)));
		}
	}
	
}
