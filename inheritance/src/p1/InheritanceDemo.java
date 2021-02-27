package p1;

class Employee
{
	int id;
	String name;
	double sal;
	
	public Employee() {
		this.id=100;
		this.name="Not given";
		this.sal=1000;
		System.out.println("Employee default consructor");
	}

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		System.out.println("Employee parameterized consructor");
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
	void display()
	{
		System.out.println("The id is :"+id);
		System.out.println("The name is :"+name);
		System.out.println("The salary is :"+sal);
	}
}//Employee ends here

class salesManager extends Employee
{
	double incentive;
	int target;
	

	public salesManager() {
		super();//parameter intialization list
		// TODO Auto-generated constructor stub
		this.incentive=0;
		this.target=0;
		System.out.println("SalesManager default consructor");
	}
	public salesManager(int id, String name, double sal,double i,int t) {
		super(id, name, sal);//parameter intialized list 
		// TODO Auto-generated constructor stub
		this.incentive=i;
		this.target=t;
		System.out.println("SalesManger parameterized consructor");
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
	void display()
	{
		super.display();
		System.out.println("Incentive is : "+this.incentive);
		System.out.println("Target is :"+this.target);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salesManager s1 = new salesManager();//emp default & sm default
		//s1.display();
		salesManager s2 = new salesManager(112,"yogesh",405000,3000,30);
		//emp default & sm para
		//s2.display();
		System.out.println(s2.toString());
	}

}
