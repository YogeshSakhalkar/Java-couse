import java.util.ArrayList;

public class Student {
	String name;

	public Student(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nStudent [name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s1 = (Student)obj;
		
		if(s1.name.equals(this.name))
			return true;
		else
			return false;
	}
}
class StudentDemo
{
	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
		mylist.add(new Student("Rahul"));
		mylist.add(new Student("Kartik"));
		
		System.out.println(mylist);
		if(mylist.contains(new Student("Rahul")))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}
