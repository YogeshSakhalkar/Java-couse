import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Phoneno implements Comparable{
	int phoneno;

	public Phoneno(int i) {
		// TODO Auto-generated constructor stub
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Phoneno [phoneno=" + phoneno + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Phoneno k1 = (Phoneno)o;
		return k1.phoneno-this.phoneno;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Phoneno p1=(Phoneno)obj;
		if(p1.phoneno == this.phoneno) {
		return true;
		}
		return true;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.phoneno;
	}
	
}
public class PhoneBook {
	String name;
	
	public PhoneBook(String name, double phoneNo) {
		super();
		this.name = name;
	}
	public PhoneBook(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "\n PhoneBook [name=" + name;
	}
	
}//class Phonebook ends here
class DemoPhone{
 public static void main(String[] args) {
	Map m1 = new HashMap();
	m1.put(new Phoneno(90490186),new PhoneBook("yoesh"));
	m1.put(new Phoneno(992305006),new PhoneBook("mom"));
	m1.put(new Phoneno (88888888), new PhoneBook("niki"));
	System.out.println(m1);
	/*int  i=1;
	int phno;
	while(i<100) {
		System.out.println("Enter the  options");
		System.out.println("1 allows to add  name and phone number");
		System.out.println("2 to  search base on phone number ");
		System.out.println("terminate");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1:System.out.println("enter the phone number");
				 phno= sc.nextInt();
				System.out.println("enter the name");
				String Uname = sc.nextLine();
				m1.put(new Phoneno (phno), new PhoneBook(Uname));
				System.out.println("Data Inserted");
				System.out.println(m1);
	    	break;
		case 2:System.out.println("enter the Phone number");
				phno = sc.nextInt();
				m1.put(new Phoneno (phno), new PhoneBook(null));
				System.out.println(m1);
			break;
		case 3:System.out.println("Quitting");
			break;
			default:System.out.println("invalid input");
		}
		if(n==3) {
			break;
		}
	}*/
}
}
