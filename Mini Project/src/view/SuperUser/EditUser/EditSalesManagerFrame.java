package view.SuperUser.EditUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.EditUser.EditSalesManagerController;
import model.AddSalesManager;

public class EditSalesManagerFrame extends Frame{

	Button btSubmit,btClear,btBack;
	TextField  txtName, txtSalary, txtIncentive, txtTarget;
	Label lbName, lbSalary, lbIncentive, lbTarget;
	
	public EditSalesManagerFrame(AddSalesManager s1) {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");
	
		txtName = new TextField(20);
		txtSalary = new TextField(20);
		txtIncentive = new TextField(20);
		txtTarget = new TextField(20);
		
		lbName = new Label("Name");
		lbSalary = new Label("Salary");
		lbTarget = new Label("Target");
		lbIncentive = new Label("Incentive");
		
		this.setTitle("Edit Sales Manager");
		this.setVisible(true);
		this.setBounds(300, 200, 200, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);

		this.add(lbName);
		this.add(txtName);
		txtName.setText(s1.getName());
		
		this.add(lbSalary);
		this.add(txtSalary);
		String sal=String.valueOf(s1.getSalary());
		txtSalary.setText(sal);
		
		this.add(lbIncentive);
		this.add(txtIncentive);
		String inc=String.valueOf(s1.getIncentive());
		txtIncentive.setText(inc);
		
		this.add(lbTarget);
		this.add(txtTarget);
		String Tar=String.valueOf(s1.getTarget());
		txtTarget.setText(Tar);
		
		this.add(btSubmit);
		this.add(btClear);
		this.add(btBack);

		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		EditSalesManagerController e1 = new EditSalesManagerController(this);
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
