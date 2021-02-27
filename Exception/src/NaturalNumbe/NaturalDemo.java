package NaturalNumbe;

import java.util.Scanner;

public class NaturalDemo {
	public double avgFirstN(int N) {
		int result=0;
		double avg=0;
		if(N<0) {
			throw new IIlegalArgumentException();
		}
		else
		{
			for (int i = 1; i <= N; i++) {
				result+=i;
				System.out.println(result);
			}
			avg=result/N;
		}
		return avg;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		N=sc.nextInt();
		NaturalDemo n1 = new NaturalDemo();
		System.out.println("the average of "+N+ "Natural Number is :"+n1.avgFirstN(N));
	}

}
