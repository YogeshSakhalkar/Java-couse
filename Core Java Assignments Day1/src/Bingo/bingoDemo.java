package Bingo;

public class bingoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("first number was : "+a);
		System.out.println("Second number was : "+b);
		
		search s1 = new search(a,b);
		s1.SearchBingo();
	}

}
