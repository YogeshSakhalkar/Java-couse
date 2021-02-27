package view;

import java.awt.*;

import Controller.*;

public class LoginFrame extends Frame{

	Button btLogin, btClear;
	TextField txtUsername, txtPassword;
	Label lbUsername,lbPassword;
	
	public LoginFrame() {
		btLogin = new Button("Login");
		btClear = new Button("Clear");
		
		txtUsername = new TextField(15);
		txtPassword = new TextField(15);
		
		lbUsername = new Label("Username : ");
		lbPassword = new Label("Password : ");
		
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(200, 200, 250, 500);
		txtPassword.setEchoChar('*');
		this.setTitle("Login");
		
		this.setLayout(new FlowLayout());
		this.add(lbUsername);
		this.add(txtUsername);
		
		this.add(lbPassword);
		this.add(txtPassword);
		
		this.add(btLogin);
		this.add(btClear);
		
		Windowlistner l1 = new Windowlistner(this);
		this.addWindowListener(l1);
		
		LoginFrameController Lfc = new LoginFrameController(this);
		btLogin.addActionListener(Lfc);
		btClear.addActionListener(Lfc);
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

	public TextField getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(TextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	public TextField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(TextField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public Label getLbUsername() {
		return lbUsername;
	}

	public void setLbUsername(Label lbUsername) {
		this.lbUsername = lbUsername;
	}

	public Label getLbPassword() {
		return lbPassword;
	}

	public void setLbPassword(Label lbPassword) {
		this.lbPassword = lbPassword;
	}
	
}
