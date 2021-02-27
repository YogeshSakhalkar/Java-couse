class demoClass
{
	int id;
	String name;
	float salary;

	demoClass()
	{
		id=0;
		name="null";
		salary=0;
	}

	demoClass(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}

	float getSalary() {
		return salary;
	}
	void setSalary(float salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("Salary is :"+salary);
	}
}
class emp {
	public static void main(String[] args) {
		demoClass e1;
		e1 = new demoClass();
		System.out.println(e1);
		e1.display();
		demoClass e2 = new demoClass(101,"sachin",30000);
		e2.display();
	}
}


