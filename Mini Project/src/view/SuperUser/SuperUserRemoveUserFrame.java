package view.SuperUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.SuperUserRemoveUserController;

public class SuperUserRemoveUserFrame extends Frame{
	Button btSubmit,btClear,btBack;
	TextField txtId;
	Label lbId;
	
	public SuperUserRemoveUserFrame() {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");
		
		txtId = new TextField(20);
		
		lbId = new Label("Id");
		
		this.setTitle("Calulate Salary");
		this.setVisible(true);
		this.setBounds(300, 200, 200, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbId);
		this.add(txtId);
		this.add(btSubmit);
		this.add(btClear);
		this.add(btBack);
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		SuperUserRemoveUserController s1 = new SuperUserRemoveUserController(this);
		btBack.addActionListener(s1);
		btClear.addActionListener(s1);
		btSubmit.addActionListener(s1);
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

	public TextField getTxtId() {
		return txtId;
	}

	public void setTxtId(TextField txtId) {
		this.txtId = txtId;
	}

	public Label getLbId() {
		return lbId;
	}

	public void setLbId(Label lbId) {
		this.lbId = lbId;
	}
	
}
