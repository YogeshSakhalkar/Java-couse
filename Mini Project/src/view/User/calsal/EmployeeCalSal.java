package view.User.calsal;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

import Controller.Windowlistner;
import Controller.User.CalSal.EmployeeCalSalController;
import model.AddSalesManager;
import model.employee;

public class EmployeeCalSal extends Frame{

	Label lbId,lbName,lbSalary;
	Button  btBack;
	public EmployeeCalSal(employee e1) {
		// TODO Auto-generated constructor stub
		lbId = new Label("Id : "+e1.getId());
		lbName = new Label("Name : "+e1.getName());
		lbSalary = new Label("Total Calculate Salary : "+e1.getSalary());
		btBack = new Button("Back to Previous page");
		
		this.setTitle("Calculated Salary ");
		this.setVisible(true);
		this.setBounds(250, 150, 300, 200);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbId);
		this.add(lbName);
		this.add(lbSalary);
		this.add(btBack);
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		EmployeeCalSalController sm1 = new EmployeeCalSalController(this);
		btBack.addActionListener(sm1);
	}
	public Label getLbId() {
		return lbId;
	}
	public void setLbId(Label lbId) {
		this.lbId = lbId;
	}
	public Label getLbName() {
		return lbName;
	}
	public void setLbName(Label lbName) {
		this.lbName = lbName;
	}
	public Label getLbSalary() {
		return lbSalary;
	}
	public void setLbSalary(Label lbSalary) {
		this.lbSalary = lbSalary;
	}
	public Button getBtBack() {
		return btBack;
	}
	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}

}
