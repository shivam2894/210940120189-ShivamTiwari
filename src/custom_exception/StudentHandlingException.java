package custom_exception;

public class StudentHandlingException extends Exception {
	
	private static final long serialVersionUID=1L;
	public StudentHandlingException(String errMsg) {
		super(errMsg);
	}

}
