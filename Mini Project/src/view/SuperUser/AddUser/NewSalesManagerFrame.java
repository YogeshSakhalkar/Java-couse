package view.SuperUser.AddUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.UserAdd.AddSalesManagerController;

public class NewSalesManagerFrame extends Frame{
	Button btSubmit,btClear;
	Button btBack;
	TextField txtId, txtName, txtSalary, txtIncentive, txtTarget;
	Label lbId, lbName, lbSalary, lbIncentive, lbTarget;
	
	public NewSalesManagerFrame() {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");
		
		txtId = new TextField(20);
		txtName = new TextField(20);
		txtSalary = new TextField(20);
		txtIncentive = new TextField(20);
		txtTarget = new TextField(20);
		
		lbId = new Label("Id");
		lbName = new Label("Name");
		lbSalary = new Label("Salary");
		lbTarget = new Label("Target");
		lbIncentive = new Label("Incentive");
		
		this.setTitle("Sales Manager");
		this.setVisible(true);
		this.setBounds(300, 200, 220, 400);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbId);
		this.add(txtId);
		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbIncentive);
		this.add(txtIncentive);
		this.add(lbTarget);
		this.add(txtTarget);
		this.add(btSubmit);
		this.add(btClear);
		this.add(btBack);	
		
		
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		AddSalesManagerController a1 = new AddSalesManagerController(this);
		btSubmit.addActionListener(a1);
		btClear.addActionListener(a1);
		btBack.addActionListener(a1);
	}

	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}

	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}

	public TextField getTxtId() {
		return txtId;
	}

	public void setTxtId(TextField txtId) {
		this.txtId = txtId;
	}

	public TextField getTxtName() {
		return txtName;
	}

	public void setTxtName(TextField txtName) {
		this.txtName = txtName;
	}

	public TextField getTxtSalary() {
		return txtSalary;
	}

	public void setTxtSalary(TextField txtSalary) {
		this.txtSalary = txtSalary;
	}

	public TextField getTxtIncentive() {
		return txtIncentive;
	}

	public void setTxtIncentive(TextField txtIncentive) {
		this.txtIncentive = txtIncentive;
	}

	public TextField getTxtTarget() {
		return txtTarget;
	}

	public void setTxtTarget(TextField txtTarget) {
		this.txtTarget = txtTarget;
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

	public Label getLbIncentive() {
		return lbIncentive;
	}

	public void setLbIncentive(Label lbIncentive) {
		this.lbIncentive = lbIncentive;
	}

	public Label getLbTarget() {
		return lbTarget;
	}

	public void setLbTarget(Label lbTarget) {
		this.lbTarget = lbTarget;
	}
	
}
