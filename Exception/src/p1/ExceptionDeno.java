package p1;

public class ExceptionDeno {
	void myfun()
	{
		Voter v1 = new Voter(10);
		try {
			v1.ValidateAge();
		} 
		catch (InvalidAgeException e) {
			
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDeno dv = new ExceptionDeno();
		dv.myfun();
		
	}

}
