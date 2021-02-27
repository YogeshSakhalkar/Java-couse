package view.SuperUser.EditUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.EditUser.EditHRController;

public class EditHRFrame extends Frame{
 
	Button btSubmit,btClear,btBack;
	TextField  txtName, txtSalary, txtCommission; 
	Label lbName, lbSalary, lbCommission;
	public EditHRFrame() {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");

		txtName = new TextField(20);
		txtSalary = new TextField(20);
		txtCommission = new TextField(20);
		

		lbName = new Label("Name");
		lbSalary = new Label("Salary");
		lbCommission = new Label("Commission");

		
		this.setTitle("Edit HR");
		this.setVisible(true);
		this.setBounds(300, 200, 200, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);

		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbCommission);
		this.add(txtCommission);
		this.add(btSubmit);
		this.add(btClear);
		this.add(btBack);
		
		
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		EditHRController e1 = new EditHRController(this);
		btSubmit.addActionListener(e1);
		btClear.addActionListener(e1);
		btClear.addActionListener(e1);
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
	public TextField getTxtCommission() {
		return txtCommission;
	}
	public void setTxtCommission(TextField txtCommission) {
		this.txtCommission = txtCommission;
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
	public Label getLbCommission() {
		return lbCommission;
	}
	public void setLbCommission(Label lbCommission) {
		this.lbCommission = lbCommission;
	}
	
}
