package Controller;

import java.awt.event.*;

import javax.swing.JOptionPane;

import model.User;
import view.LoginFrame;
import view.RegistrationFrame;



public class RegistrationFrameController implements ActionListener{
	
	RegistrationFrame registrationFrame;
	
	
	public RegistrationFrameController(RegistrationFrame rf) {
		// TODO Auto-generated constructor stub
		registrationFrame = rf;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub

		if(ae.getSource()== registrationFrame.getBtSubmit())
		{
			//System.out.println("SUBMIT");
			String uname =registrationFrame.getTxtUname().getText();
			String password = registrationFrame.getTxtPassword().getText();
			String city = registrationFrame.getTxtCity().getText();
			
			System.out.println(uname+" "+password+" "+city);
			
			User u1 = new User();
			u1.setUsername(uname);
			u1.setPassword(password);
			u1.setCity(city);
			
			db.DAO d1 = new db.DAO();
			if(d1.insert(u1))
			{
				System.out.println("successfully inserted!");
				JOptionPane.showMessageDialog(registrationFrame, "successfully inserted!");
				new LoginFrame();
				registrationFrame.dispose();
			}
			else
			{
				System.out.println("Register again");
			}
			

		}
		else 
		{
			System.out.println("CANCEL");
		}
	}
}
