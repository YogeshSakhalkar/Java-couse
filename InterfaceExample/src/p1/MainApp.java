package p1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Printable obj1 = new Employee();
		obj1.print();
		
		//this is an object of annomonus object
		Printable obj2 = new Printable() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("this is inside the main");
			}
		};
		obj2.print();
		*/
		
		
		//Approch 1 : Creating seperate class for implementing the interface
		ArithmethicOps add,subtract,division,multiplication;
		add=new Addition();
		add.operation(23,23);
		
		
		//Approch 2 : Creating annomonus inner class to implement interface
		subtract = new ArithmethicOps() {
			
			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		subtract.operation(100, 10);
		
		//Approch 3: using lamda expression
		multiplication=(a,b)->a*b;
		multiplication.operation(5, 5);
	}

}
