package ExceptionRectangle;

public class IIlegalInputException extends RuntimeException {
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Values should be in between 0.0 to 20.0";
	}
}
