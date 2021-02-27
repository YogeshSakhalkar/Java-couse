class admin_details{
	int id;
	String name;
	double salary;
	double allowance;
	
	admin_details()
	{
		this.id=0;
		this.name="null";
		this.salary=0;
		this.allowance=0;
	}
	
	admin_details(int id, String name, double salary, double allowance) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display()
	{
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("salary is :"+salary);
		System.out.println("Allowance is :"+allowance);
	}
}
class Admin {
	public static void main(String[] args) {
		admin_details d1 = new admin_details(144,"Dhoni",8900,10);
		d1.display();
	}
}
