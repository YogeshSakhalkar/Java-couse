package ThirteenTime;

import java.util.Scanner;

public class CommondLineDemo {
	int Input1;
	int Input2;
	public CommondLineDemo(int input1, int input2) {
		// TODO Auto-generated constructor stub
		this.Input1=input1;
		this.Input2=input2;
	}
	

	public int getInput1() {
		return Input1;
	}


	public void setInput1(int input1) {
		Input1 = input1;
	}


	public int getInput2() {
		return Input2;
	}


	public void setInput2(int input2) {
		Input2 = input2;
	}
	
	void Solution()
	{
		int dummy;
		System.out.println(Input1);
		for (int i = 0; i < 13; i++) {

		dummy=Input1+Input2;
		System.out.println(dummy);
		Input1=Input2;
		Input2=dummy;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int input1 = myObj.nextInt();
		
		System.out.println("Enter the Second number :");
		int input2 = myObj.nextInt();
		
		CommondLineDemo d1 = new CommondLineDemo(input1,input2);
		d1.Solution();
	}

}
