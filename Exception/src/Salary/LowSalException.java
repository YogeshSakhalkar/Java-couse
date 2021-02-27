package Salary;

public class LowSalException extends RuntimeException {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Basic is Less than 500";
	}
}
