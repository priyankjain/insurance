package insurance;

public class IllegalPolicyCodeException extends Exception {
	final static long serialVersionUID=1L;
	/** Creates an IllegalPolicyCodeException with a given message */
	public IllegalPolicyCodeException(String message) {
	super(message);
	}

}
