package view;

import java.awt.*;

import Controller.*;
import model.User;

public class WelcomeFrame extends Frame{

	Label lbwelcome;
	
	public WelcomeFrame(User u1) {
		lbwelcome = new Label(" Welocme "+u1.getUsername()+" your city is "+u1.getCity());
		this.setTitle("login successfull");
		this.setVisible(true);
		this.setBounds(250, 150, 300, 200);
		this.setResizable(false);
		
		this.setLayout(new FlowLayout());
		this.add(lbwelcome);
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
	}
}
