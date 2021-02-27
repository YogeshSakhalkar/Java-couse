package p1;

public interface Printable {

	public void print();
	//after printonscreen it will be not a fuctional interface
	//but form the lamda prespective prinable will be still have 
	//default implementation and it will be compared with print()
	//because lamda is expanded that means it will compare with the method having non default method
	
	public default void pintOnScreen()
	{
		System.out.println("this is possible in interface");
	}
}
