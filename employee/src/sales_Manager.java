class sales_details{
	int id;
	String name;
	float salary;
	float incentive;
	int target;
	
	sales_details()
	{
		id=0;
		name="null";
		salary=0;
		incentive=0;
		target=0;
	}
	
	sales_details(int id, String name, float salary, float incentive, int target) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
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
	float getSalary() {
		return salary;
	}
	void setSalary(float salary) {
		this.salary = salary;
	}
	float getIncentive() {
		return incentive;
	}
	void setIncentive(float incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	
	void display()
	{
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("salary is :"+salary);
		System.out.println("Incentive is :"+incentive);
		System.out.println("target is :"+target);
	}
}
class sales_Manager {
	public static void main(String[] args) {
		sales_details s1 = new sales_details(203,"gopro",500000,80000,798);
		s1.display();
	}
}
