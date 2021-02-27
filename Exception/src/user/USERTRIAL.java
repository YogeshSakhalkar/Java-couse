package user;

public class USERTRIAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		check c1 = new check(0,0);
		result=c1.show();
		if(result==true) {
			System.out.println("var1 var2 is 0 or greater than 0");
		}
		else 
		{
			System.out.println("var1 var2 is less than 0");
		}
	}

}
