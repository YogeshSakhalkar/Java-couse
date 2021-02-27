package Salary;

class Emp {

	int EmpId;
	String empName;
	String Designation;
	double basic;
	double hra;
	int flag=0;
	public Emp() {
		EmpId = 111;
		this.empName = "not given";
		Designation = "not given";
		this.basic = 0;
	}
	
	public Emp(int empId, String empName, String designation, double basic){

		EmpId = empId;
		this.empName = empName;
		Designation = designation;
		setBasic(basic);
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public double getBasic() {
	
			return basic;
	}

	public void setBasic(double basic){
		if(basic<500)
		{
			try 
			{
				throw new LowSalException();
			}
		
			catch(LowSalException e)
			{
				System.out.println(e);
				flag=1;
			}
		}
		else
		{
			this.basic = basic;
		}

	}
	
	void printDET() {
		System.out.println("Id is: "+EmpId);
		System.out.println("Name is: "+empName);
		System.out.println("Designation is: "+Designation);
		if(flag==1) {
			return;
		}
		else {
		System.out.println("Salary is: "+basic);
		}
	}

	void calculateHRA() {
		if(flag==1) {
			return;
		}
		else {
		if(Designation=="Manager") {
			hra = basic * 0.1;
			System.out.println("Manager HRA is:"+hra);
			System.out.println();
		}
		
		if(Designation == "Officer") {
			hra = basic * 0.12;
			System.out.println("Officer HRA is:"+hra);
			System.out.println();
		}
		
		if(Designation == "CLERK") {
			hra = basic * 0.5;
			System.out.println("CLERK HRA is:"+hra);
			System.out.println();
		}
		}
	}
}


class EmpTest{
	
	public static void main(String[] args){
		
		Emp e1 = new Emp(112,"Rahul","Officer",80000);
		e1.printDET();
		e1.calculateHRA();
		
		Emp e2 = new Emp(132,"Sachin","Manager",400);
		e2.printDET();
		e2.calculateHRA();
	}
}

