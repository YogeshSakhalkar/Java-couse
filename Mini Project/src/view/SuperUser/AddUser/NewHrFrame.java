package view.SuperUser.AddUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.UserAdd.AddHrController;

public class NewHrFrame extends Frame{

	Button btSubmit,btClear;
	Button btBack;
	TextField txtId, txtName, txtSalary, txtAllowance; 
	Label lbId, lbName, lbSalary, lbAllowance;
	
	public NewHrFrame() {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");
		
		txtId = new TextField(20);
		txtName = new TextField(20);
		txtSalary = new TextField(20);
		txtAllowance = new TextField(20);
		
		lbId = new Label("Id");
		lbName = new Label("Name");
		lbSalary = new Label("Salary");
		lbAllowance = new Label("Allowance");

		
		this.setTitle("Hr");
		this.setVisible(true);
		this.setBounds(300, 200, 200, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbId);
		this.add(txtId);
		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbAllowance);
		this.add(txtAllowance);
		this.add(btSubmit);
		this.add(btClear);
		this.add(btBack);
		
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		AddHrController a1 = new AddHrController(this);
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

	public TextField getTxtAllowance() {
		return txtAllowance;
	}

	public void setTxtAllowance(TextField txtAllowance) {
		this.txtAllowance = txtAllowance;
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

	public Label getLbAllowance() {
		return lbAllowance;
	}

	public void setLbAllowance(Label lbAllowance) {
		this.lbAllowance = lbAllowance;
	}
	
}
