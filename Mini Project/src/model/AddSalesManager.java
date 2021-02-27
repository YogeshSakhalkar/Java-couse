package model;

import java.io.Serializable;

public class AddSalesManager implements Serializable{
	int id,target;
	String name;
	double salary,incentive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	@Override
	public String toString() {
		return "\n SalesManager [id=" + id + ", target=" + target + ", name=" + name + ", salary=" + salary
				+ ", incentive=" + incentive + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		AddSalesManager s1 =(AddSalesManager)obj;
		if(s1.getId()==this.getId()) {
				return true;
		}
			return false;
	}
	
	
}
