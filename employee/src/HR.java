class hr_details{
	int id;
	String name;
	double salary;
	double commission;
	
	hr_details()
	{
		this.id=0;
		this.name="null";
		this.salary=0;
		this.commission=0;
	}
	hr_details(int id, String name, double salary, double commission) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
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
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	void display()
	{
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("salary is :"+salary);
		System.out.println("Commission is :"+this.commission);
	}
	
}
class HR {
public static void main(String[] args) {
	hr_details h1 =  new hr_details(789,"Luffy",15000000,899020);
	h1.display();
}
}
