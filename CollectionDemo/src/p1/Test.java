package p1;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String  name;
	double sal;
	
	public Employee()
	{
		this.id = 100;
		this.name = "abc";
		this.sal = 2;	
	}
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.sal < o.sal) {
			return -1;
		}
		else if(o.sal<this.sal) {
			return 1;
		}else 
		return 0;
	}

	/*@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//Employee e1=(Employee)o;
		
		
		//return this.getId()-((Employee)o).getId();
		return this.getId()-o.getId();
	}*/
	
	
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		
		a1.add(new Employee(111,"b",20000));
		a1.add(new Employee(1002,"c",300));
		a1.add(new Employee(103,"a",490000));
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
	}

}
