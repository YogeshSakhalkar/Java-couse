package Bingo;

public class search {
	int A,B;
	int flag = 0;
	final int [] arr = {7, 25, 5, 19, 30};
	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}
	
	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public search(int a, int b) {
		// TODO Auto-generated constructor stub
		this.A=a;
		this.B=b;
	}
	
	void SearchBingo()
	{

		for (int i = 0; i < arr.length; i++) {
			if(A==arr[i]) {
				flag+=1;
			}
			if(B==arr[i]) {
				flag+=1;
			}
		}
		if(flag==2) {
			System.out.println("Bingo..!");
		}
		else
		{
			System.out.println("Not found..!");
		}
		display();
	}
   void display() {
	   System.out.println("The array was :");
	   for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
   }
}
