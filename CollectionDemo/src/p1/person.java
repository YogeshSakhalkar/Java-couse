package p1;

import java.util.TreeSet;

class personDetails implements Comparable<personDetails>{
	int adhar;
	int age;
	String name;
	
	public personDetails(int adhar, int age, String name) {
		super();
		this.adhar = adhar;
		this.age = age;
		this.name = name;
	}
	public int getAdhar() {
		return adhar;
	}
	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n personDetails [adhar=" + adhar + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(personDetails o) {
		// TODO Auto-generated method stub
		System.out.println("person ka compare to");
		return o.adhar-this.adhar;
	}
	
}
public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1 = new TreeSet();
		t1.add(new personDetails(1221, 24, "Yogesh"));
		t1.add(new personDetails(122, 23, "Nihaab"));
		t1.add(new personDetails(444, 22, "samin"));
		
		System.out.println(t1);
	}

}
