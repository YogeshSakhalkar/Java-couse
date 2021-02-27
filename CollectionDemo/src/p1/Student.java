package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	int roll;
	String name;
	double marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\n Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	

}//class student ends here

class StudentsDemo{
	public static void main(String[] args) {
		ArrayList List = new ArrayList();
		List.add(new Student(10, "sachin", 100));
		List.add(new Student(7 , "Dhoni", 99));
		List.add(new Student(99, "Ganguli", 78));
		List.add(new Student(45, "rohit", 82));
		
		System.out.println(List);
		
		RollComparator rc = new RollComparator();
		Collections.sort(List,rc);
		System.out.println(List);
		
		MarkComparator mc = new MarkComparator();
		Collections.sort(List,mc);
		System.out.println(List);
		
		NameComparator nc = new NameComparator();
		Collections.sort(List,nc);
		System.out.println(List);
	}
}
