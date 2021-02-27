package p1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> allPerson = new ArrayList(); 
		allPerson.add(new Person("Yogesh","M",24));
		allPerson.add(new Person("Samin","M",24));
		allPerson.add(new Person("Devanad","M",24));
		allPerson.add(new Person("Nihaab","M",24));
		allPerson.add(new Person("Nilay","M",28));
		allPerson.add(new Person("Nikita","F",28));
		
		//1:filter the collection on gender and store at temp
		//2:iterate over temp location
		//3:increment the number -> count
		
		//iteterate over collection
		allPerson.stream().forEach(value->System.out.println(value.getName()));
		
		//filter
		allPerson.stream().filter(ref->ref.getGender().equals("M") && ref.getAge()<25);
		
		allPerson.stream().filter(ref->ref.getGender().equals("M") && ref.getAge()<25).forEach(value->System.out.println(value.getName()));
		
		//pipeline
		double avg_age=allPerson.stream().filter(ref->ref.getGender().equals("F")).mapToDouble(Person::getAge).max().getAsDouble();
		System.out.println("Max age is :"+avg_age);
	}

}
