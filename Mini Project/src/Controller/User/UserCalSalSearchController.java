package Controller.User;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;


import db.user.EmployeeJDBC;
import model.AddAdmin;
import model.AddHr;
import model.AddSalesManager;
import model.employee;
import view.User.UserCalSalSearchFrame;
import view.User.UserHomepageFrame;
import view.User.calsal.EmployeeCalSal;


public class UserCalSalSearchController implements ActionListener{

	UserCalSalSearchFrame userCalSalSearchFrame;
	public UserCalSalSearchController(UserCalSalSearchFrame u) {
		// TODO Auto-generated constructor stub
		userCalSalSearchFrame = u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==userCalSalSearchFrame.getBtSubmit()) {
			
			String UserId = userCalSalSearchFrame.getTxtId().getText();

			employee e1 = new employee();
			try{
				e1.setId(Integer.parseInt(UserId));
				//a1.setId(Integer.parseInt(UserId));
				//h1.setId(Integer.parseInt(UserId));
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(userCalSalSearchFrame,"Try again");
				userCalSalSearchFrame.dispose();
				new UserCalSalSearchFrame();
			}
			
			EmployeeJDBC eJdbc  = new EmployeeJDBC();
			
			     
			
			try {
				if(eJdbc.CalulateSalary(e1)==true)
				{
					
						JOptionPane.showMessageDialog(userCalSalSearchFrame,"Found");
						new EmployeeCalSal(e1);
						userCalSalSearchFrame.dispose();
				}
					else
					{
						JOptionPane.showMessageDialog(userCalSalSearchFrame,"Not Found \n Please Try again");
						userCalSalSearchFrame.dispose();
						new UserCalSalSearchFrame();
					}
				
}
			 catch (HeadlessException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
		if(e.getSource() == userCalSalSearchFrame.getBtBack()) {
			new UserHomepageFrame();
			userCalSalSearchFrame.dispose();
		}
	}
	}
}
