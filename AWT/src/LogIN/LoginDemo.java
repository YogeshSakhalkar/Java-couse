package LogIN;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f1 = new Frame();
		f1.setVisible(true);
		f1.setBounds (250, 500, 220, 250);
		
		Button btLogin,btClear,btNewUser;
		
		TextField txtUname,txtPassword;
		Label lbUname,lbPassword;
		
		btLogin = new Button("LogIN");
		btClear = new Button("Clear Data");
		btNewUser = new Button("New User");
		txtUname = new TextField(20);
		txtPassword = new TextField(20);
		lbUname = new Label("Enter the username");
		lbPassword = new Label("Enter the password");
		
		txtPassword.setEchoChar('*');
		f1.setLayout(new FlowLayout());
		
		f1.add(lbUname);
		f1.add(txtUname);
		f1.add(lbPassword);
		f1.add(txtPassword);
		f1.add(btLogin);
		f1.add(btClear);
		f1.add(btNewUser);
		
		MyWindowListener nw = new MyWindowListener(f1);
		f1.addWindowListener(nw);
	}

}
