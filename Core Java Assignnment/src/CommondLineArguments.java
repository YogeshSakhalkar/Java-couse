
public class CommondLineArguments {
public static void main(String[] args) {
	if(args.length==0) {
		System.out.println("enter the first number : ");
		int a = Integer.parseInt(args[0]);
		System.out.println("enter the operation +, -, *, /  :\n");
		char p = args[1].charAt(1);
		System.out.println("enter the second number : ");
		int b = Integer.parseInt(args[2]);
		
		switch(p) {
		case '+':
			System.out.println("addition of 2 number is : "+(a+b));
			break;
		case '-':
			System.out.println("subtraction of 2 number is : "+(a-b));
			break;
		case '*':
			System.out.println("Multipication of 2 number is :"+(a*b));
			break;
		case '/':
			System.out.println("Division of 2 number is :"+(a/b));
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
}
