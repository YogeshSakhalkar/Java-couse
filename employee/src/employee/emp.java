package employee;

class employee
{
	int id;
	char[] name;
	float salary;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	char[] getName() {
		return name;
	}
	void setName(char[] name) {
		this.name = name;
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
		System.out.println("salary is :"+salary);
	}
}
class demoClass
{
	public static void main(String[] args) {
		employee e1;
		e1.display();
	}
}