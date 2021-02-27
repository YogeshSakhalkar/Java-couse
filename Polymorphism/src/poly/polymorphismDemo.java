package poly;

class Employee extends Object{
	int id;
	String name;
	double sal;
	
	public Employee() {
		this.id=100;
		this.name="Not given";
		this.sal=111;
	}
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	void display() {
		System.out.println("id is : "+id);
		System.out.println("Name is: "+name);
		System.out.println("salary is: "+sal);
	}
	double calSalary() {
		return sal;
	}
}//emp ends here

class SalesManager extends Employee{
	double incentive;
	int target;
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
		this.incentive=100;
		this.target=100;
	}
	public SalesManager(int id, String name, double sal, int i, int t) {
		super(id, name, sal);
		// TODO Auto-generated constructor stub
		this.incentive=i;
		this.target=t;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	void display() {
		super.display();
		System.out.println("Incentive is: "+incentive);
		System.out.println("Target is: "+target);
	}
	double calSalary() {
		return sal+incentive;
	}
}//salesManager ends here

class Admin extends Employee{
	double allowance;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
		this.allowance=100;
	}

	public Admin(int id, String name, double sal, int a) {
		super(id, name, sal);
		// TODO Auto-generated constructor stub
		this.allowance=a;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display() {
		super.display();
		System.out.println("allowance is: "+allowance);
	}
	double calSalary() {
		return sal+allowance;
	}
}//admin ends here
public class polymorphismDemo {

	public static void main(String[] args) {
		polymorphismDemo d1 = new polymorphismDemo();
		d1.allEmployeeDetails(new SalesManager(120,"Rag",3000,300,30));
		d1.allEmployeeDetails(new Admin(130,"sav",337,13));
	}
	
	void allEmployeeDetails(Employee e1) {
		
		System.out.println(e1.getName());
		System.out.println("Calculated salary is:"+e1.calSalary());
		
		
		if(e1 instanceof SalesManager) {
			SalesManager s1 = (SalesManager)e1;
			System.out.println("Incentive is: "+s1.getIncentive());
		}
		
		if(e1 instanceof Admin) {
			Admin a1 = (Admin)e1;
			System.out.println("Allowance is: "+a1.getAllowance());
		}
	}
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Employee e1;
		e1 = new Employee(101,"sachin",3000);
		e1.display();
		System.out.println("calculated salary is:"+e1.calSalary());
		
		e1 = new SalesManager(102,"Rahul",20000,3000,30);
		e1.display();
		System.out.println("calculted salary is:"+e1.calSalary());
		
		e1 = new Admin(103,"surav",45000,5000);
		e1.display();
		System.out.println("calculated salary is: "+e1.calSalary());

	}

}
