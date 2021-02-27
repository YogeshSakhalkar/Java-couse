package p1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f1 = new Frame();
		f1.setVisible(true);
		f1.setBounds(300, 200, 325, 350);
		
		Button btSubmit,btClear;
		
		TextField txtUname, txtPassword, txtCity;
		Label lbUname, lbPassword, lbCity;
		
		btSubmit= new Button("Submit Data");
		btClear = new Button("Clear Data");
		txtUname = new TextField(20);
		txtPassword = new TextField(20);
		txtCity = new TextField(20);
		lbUname  = new Label("Enter the User name");
		lbPassword = new Label("Enter the password");
		lbCity = new Label("enter the city");
		
		txtPassword.setEchoChar('*');
		f1.setLayout(new FlowLayout());
		f1.setResizable(false);
		f1.add(lbUname);
		f1.add(txtUname);
		f1.add(lbPassword);
		f1.add(txtPassword);
		f1.add(lbCity);
		f1.add(txtCity);
		f1.add(btClear);
		f1.add(btSubmit);
		
		MyWindowListener nw = new MyWindowListener(f1);
		f1.addWindowListener(nw);
		

	}

}
