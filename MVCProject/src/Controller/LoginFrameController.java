package Controller;

import java.awt.event.*;

import db.DAO;
import model.User;
import view.*;



public class LoginFrameController implements ActionListener{
	
	LoginFrame loginFrame;
	
	public LoginFrameController(LoginFrame lF) {
		// TODO Auto-generated constructor stub
		this.loginFrame=lF;
	}

	@Override
	public void actionPerformed(ActionEvent ar) {
		if(ar.getSource()==loginFrame.getBtNewUser()) {
			
			loginFrame.dispose();
			new RegistrationFrame();
		}
		
		else {
					if(ar.getSource() == loginFrame.getBtLogin())
					{
						String username = loginFrame.getTxtUname().getText();
						String password = loginFrame.getTxtPassword().getText();
						System.out.println(username+" "+password);
						
						User u1=new User();
						u1.setUsername(username);
						u1.setPassword(password);
						db.DAO d1 = new DAO();
						u1=d1.validate(u1);
						
						if(u1!=null) {
							new WelcomeFrame(u1);
							loginFrame.dispose();
						}
					}
					
					else if(ar.getSource() == loginFrame.getBtClear()){
						System.out.println("Clear");
					}
		
		}
	}
}
