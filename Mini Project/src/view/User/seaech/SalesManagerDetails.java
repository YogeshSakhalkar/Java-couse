package view.User.seaech;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import Controller.Windowlistner;
import gui.User.Search.SalesManagerDetailsController;
import model.AddSalesManager;
import model.employee;

public class SalesManagerDetails extends Frame{

	Label lbId,lbName,lbSalary,lbTarget,lbIncentive,lbCommission,lbAllowance;
	Button btback;
	
	public SalesManagerDetails(employee s1) {
		// TODO Auto-generated constructor stub

		lbId = new Label("Id : "+s1.getId());
		lbName = new Label("Name : "+s1.getName());
		lbSalary = new Label("Salary : "+s1.getSalary());
		lbTarget = new Label("Target : "+s1.getTarget());
		lbIncentive = new Label("Incentive : "+s1.getIncentive());
		lbCommission = new Label("Commission :"+s1.getCommission());
		lbAllowance = new Label("Allowance :"+s1.getAllowance());
		btback = new Button("Back to Previous page");
		
		this.setTitle("Sales Manager Details");
		this.setVisible(true);
		this.setBounds(250, 150, 300, 200);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbId);
		this.add(lbName);
		this.add(lbSalary);
		this.add(lbTarget);
		this.add(lbIncentive);
		this.add(lbCommission);
		this.add(lbAllowance);
		this.add(btback);
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		SalesManagerDetailsController ss1 = new SalesManagerDetailsController(this);
		btback.addActionListener(ss1);
	}

	public Button getBtback() {
		return btback;
	}

	public void setBtback(Button btback) {
		this.btback = btback;
	}
	
}