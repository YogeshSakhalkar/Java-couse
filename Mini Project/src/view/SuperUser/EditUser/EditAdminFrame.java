package view.SuperUser.EditUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.EditUser.EditAdminController;

public class EditAdminFrame extends Frame{

	Button btSubmit,btClear, btBack;
	TextField  txtName, txtSalary, txtAllowance; 
	Label lbName, lbSalary, lbAllowance;
	public EditAdminFrame() {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");
		
		txtName = new TextField(20);
		txtSalary = new TextField(20);
		txtAllowance = new TextField(20);
		
		lbName = new Label("Name");
		lbSalary = new Label("Salary");
		lbAllowance = new Label("Allowance");

		
		this.setTitle("Edit Admin");
		this.setVisible(true);
		this.setBounds(300, 200, 200, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);

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
		
		EditAdminController e1 = new EditAdminController(this);
		btSubmit.addActionListener(e1);
		btClear.addActionListener(e1);
		btBack.addActionListener(e1);
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
	public Button getBtBack() {
		return btBack;
	}
	public void setBtBack(Button btBack) {
		this.btBack = btBack;
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
