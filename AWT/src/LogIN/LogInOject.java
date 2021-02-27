package LogIN;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import p1.RegistrationFrame;

public class LogInOject extends Frame implements ActionListener{
	Button btLogin,btClear,btNewUser;
	TextField txtUname,txtPassword;
	Label lbUname,lbPassword;
	
	public LogInOject() {
		btLogin = new Button("LogIn");
		btClear = new Button("Clear");
		btNewUser = new Button("New User");
		
		txtUname = new TextField(20);
		txtPassword = new TextField(20);
		
		lbUname = new Label("Enter the username");
		lbPassword = new Label("Enter the password");
		
		txtPassword.setEchoChar('*');
		this.setLayout(new FlowLayout());
		this.setTitle("Registration Form");
		this.setVisible(true);
		this.setBounds(300, 200, 325, 350);
		this.setResizable(false);
		this.add(lbUname);
		this.add(txtUname);
		this.add(lbPassword);
		this.add(txtPassword);
		this.add(btLogin);
		this.add(btClear);
		this.add(btNewUser);
		
		MyWindowListener nw = new MyWindowListener(this);
		this.addWindowListener(nw);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btNewUser) {
			new RegistrationFrame();
			this.dispose();
		}
		else if(e.getSource() == btLogin) {
			System.out.println("you can successfully log in");
		}
		else {
			System.out.println("clear");
		}
	}

}