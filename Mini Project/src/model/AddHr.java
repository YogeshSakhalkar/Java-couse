package model;

import java.io.Serializable;

public class AddHr implements Serializable{

	int id;
	String name;
	double salary;
	double allowance;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public String toString() {
		return "\n Hr [id=" + id + ", name=" + name + ", salary=" + salary + ", allowance=" + allowance + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		AddHr h1 = (AddHr)obj;
		if(h1.getId()==this.getId()) {
			return true;
	}
		return false;
	}
	
}
