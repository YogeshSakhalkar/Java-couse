package view.User.seaech;

import java.awt.*;

import Controller.Windowlistner;
import Controller.User.UserSearch.UserNameSerchController;

public class UserNameSerchFrame extends Frame{
	Button btSubmit,btClear,btBack;
	TextField txtName;
	Label lbName;
	
	
	public UserNameSerchFrame() {
		btSubmit = new Button("Submit");
		btClear = new Button("Clear");
		btBack = new Button("Back to Previous page");
		
		txtName = new TextField(20);
		
		lbName = new Label("Name");
		
		this.setTitle("Search By Name");
		this.setVisible(true);
		this.setBounds(300, 200, 200, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbName);
		this.add(txtName);
		this.add(btSubmit);
		this.add(btClear);
		this.add(btBack);
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		UserNameSerchController u1 = new UserNameSerchController(this);
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


	public TextField getTxtName() {
		return txtName;
	}


	public void setTxtName(TextField txtName) {
		this.txtName = txtName;
	}


	public Label getLbName() {
		return lbName;
	}


	public void setLbName(Label lbName) {
		this.lbName = lbName;
	}
	
}
