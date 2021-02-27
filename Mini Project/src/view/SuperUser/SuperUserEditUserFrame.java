package view.SuperUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.SuperUserEditUserController;

public class SuperUserEditUserFrame extends Frame{
	Button btSubmit,btClear,btBack;
	TextField txtId;
	Label lbId;
	
	public SuperUserEditUserFrame() {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");
		
		txtId = new TextField(20);
		
		lbId = new Label("Id");
		
		this.setTitle("Edit User Details");
		this.setVisible(true);
		this.setBounds(300, 200, 300, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbId);
		this.add(txtId);
		this.add(btSubmit);
		this.add(btClear);
		this.add(btBack);
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		SuperUserEditUserController u1 = new SuperUserEditUserController(this);
		btSubmit.addActionListener(u1);
		btClear.addActionListener(u1);
		btBack.addActionListener(u1);
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
