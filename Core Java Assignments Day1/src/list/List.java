package list;

import java.util.Scanner;

public class List {
	int N;
	public List(int n) {
		// TODO Auto-generated constructor stub
		this.N=n;
	}

	public int getN() {
		return N;
	}


	public void setN(int n) {
		N = n;
	}
	
	void EvenNumber() {
		System.out.println("Even Number is :");
		for(int i=0;i<=N;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print("\t"+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n;
		n= sc.nextInt();
		
		List L1 = new List(n);
		L1.EvenNumber();

	}

}
