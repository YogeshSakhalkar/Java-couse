package book;

import java.util.Scanner;

public class BookTest {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of book object you want to create :");
		int n= sc.nextInt();
		Books[] b = new Books[n];

		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter the book name :");
			String name = sc.next();
			
			System.out.println("Enter the book price :");
			double price = sc.nextDouble();
			b[i]=new createBooks(name,price);
		}
		for (int i = 0; i < n; i++) {
			((createBooks) b[i]).showBooks();
		} 
	}
	}





