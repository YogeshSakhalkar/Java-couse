import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	
	int id;
	String name;
	String address;
	
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Employee e1 =(Employee)obj;
		if(e1.getId()==this.getId()){
			return true;
		}
		else {
			return false;
		}
	}
		/*if(e1.getName()==this.getName()) {
			return true;
		}
		return false;
	}*/
	

}

class EmpDemo{
	public static void main(String[] args) {
		
		ArrayList e = addInput();
		display(e);
		cheking(e);
	}
	
	private static void cheking(ArrayList e) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the id");
		int id = sc.nextInt();
		//String name1=sc.nextLine();
		if(e.contains(new Employee(id, null, null))) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}

	public static  ArrayList addInput(){
		ArrayList mylist = new ArrayList();
		mylist.add(new Employee(111,"yogesh","Mumbai"));
		mylist.add(new Employee(105,"nihaab","Pune"));
		mylist.add(new Employee(127,"samin","Thane"));
		//System.out.println(mylist);
		return mylist;
		
	}
	
	public static void display(ArrayList e) {
		
		Iterator i1 = e.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}