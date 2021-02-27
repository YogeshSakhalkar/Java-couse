package date;


public class Employee {
	
	int id;
	String name;
	Date join_date;
	
	public Employee(int i,String n,Date d) {
		this.id=i;
		this.name=n;
		this.join_date=d;
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
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	public void display() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Joining Date: "+join_date);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Date d1 = new Date();
		Employee e1 = new Employee(100,"Rahul",d1);
		e1.display();
		
		d1 = new Date(21,10,2019);
		Employee e2 = new Employee(111,"Sachin",d1);
		e2.display();
		
		d1 = new Date(10,11,2020);
		Employee e3 = new Employee(133,"Rohit",d1);
		e3.display();
		
		d1 = new Date(31,9,1082);
		Employee e4 = new Employee(144,"Arfat",d1);
		e4.display();
		
		d1 = new Date(14,14,2020);
		Employee e5 = new Employee(122,"Satya",d1);
		e5.display();
				
	}
}
