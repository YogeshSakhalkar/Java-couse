package app;

/*class saySomething implements Sayble{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hello friends");
	}
	
}*/

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to java");
		//Sayble say = new saySomething();
		//say.say();
		Sayble sayi=(msg)->{
			System.out.println("hi friends"+msg);
		};
		sayi.say("It's Java 8 feature");
	
	Welcome wel=(a,b)->{
		//System.out.println("Addtion"+(a+b));
		int c=a+b;
		return c;
	};
	int result = wel.add(20,30);
	System.out.println("Result :"+result);
}
}
