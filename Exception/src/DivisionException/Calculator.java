package DivisionException;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		
		System.out.println("Enter Your Choice:");
		System.out.println("1-Addition"+"\t"+"2-Substraction");
		System.out.println("3-Multiplication"+"\t"+"4-Division");
		Scanner sc = new Scanner(System.in);
		int c =sc.nextInt();
		
		Number n = new Number(10,0);
		
		switch(c) {
			case 1: result= n.add();
					System.out.println("Addition is: "+result);
					break;
					
			case 2: result= n.sub();
					System.out.println("Substraction is: "+result);
					break;
			
			case 3: result= n.mul();
					System.out.println("Multiplication is: "+result);
					break;
			
			case 4: n.div();
					break;
		
			default:
					System.out.println("Invalid Choice");
		
		
		}
	}

}





