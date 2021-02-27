package view;
import java.awt.*;
import java.awt.event.*;

import Controller.*;

public class LoginFrame extends Frame {

	Button btLogin,btClear,btNewUser;
	TextField txtUname,txtPassword;
	Label lbUname,lbPassword;

public LoginFrame() {

	btLogin = new Button("Login");
	btClear = new Button("Clear");
	btNewUser = new Button("New User");
	
	txtUname = new TextField(20);
	txtPassword = new TextField(20);
	
	lbUname = new Label("Enter Username");
	lbPassword = new Label("Enter Password");
	
	
	txtPassword.setEchoChar('*');
	this.setTitle("login Form");
	this.setVisible(true);
	this.setBounds(250, 150, 300, 200);
	this.setResizable(false);
	
	this.setLayout(new FlowLayout());
	this.add(lbUname);
	this.add(txtUname);
	this.add(lbPassword);
	this.add(txtPassword);
	
	this.add(btLogin);
	this.add(btClear);
	this.add(btNewUser);
	
	Windowlistner ml = new Windowlistner(this);
	this.addWindowListener(ml);
	
	
	//gui.addWindowListener(Listener);
	
	
	LoginFrameController LC = new LoginFrameController(this);
	btLogin.addActionListener(LC);
	btNewUser.addActionListener(LC);
	btClear.addActionListener(LC);
	
	
	}

	public Button getBtLogin() {
		return btLogin;
	}
	
	public void setBtLogin(Button btLogin) {
		this.btLogin = btLogin;
	}
	
	public Button getBtClear() {
		return btClear;
	}
	
	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}
	
	public Button getBtNewUser() {
		return btNewUser;
	}
	
	public void setBtNewUser(Button btNewUser) {
		this.btNewUser = btNewUser;
	}
	
	public TextField getTxtUname() {
		return txtUname;
	}
	
	public void setTxtUname(TextField txtUname) {
		this.txtUname = txtUname;
	}
	
	public TextField getTxtPassword() {
		return txtPassword;
	}
	
	public void setTxtPassword(TextField txtPassword) {
		this.txtPassword = txtPassword;
	}
	
	public Label getLbUname() {
		return lbUname;
	}
	
	public void setLbUname(Label lbUname) {
		this.lbUname = lbUname;
	}
	
	public Label getLbPassword() {
		return lbPassword;
	}
	
	public void setLbPassword(Label lbPassword) {
		this.lbPassword = lbPassword;
	}
	

}//class lf ends here

