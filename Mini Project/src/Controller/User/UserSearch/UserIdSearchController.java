package Controller.User.UserSearch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import db.user.EmployeeJDBC;
import model.AddAdmin;
import model.AddHr;
import model.AddSalesManager;
import model.employee;
import view.User.seaech.SalesManagerDetails;
import view.User.seaech.UserIdSearchFrame;
import view.User.seaech.UserSearchFrame;

public class UserIdSearchController implements ActionListener{
	
	UserIdSearchFrame userIdSearchFrame;
	
	public UserIdSearchController(UserIdSearchFrame u) {
		// TODO Auto-generated constructor stub
		this.userIdSearchFrame = u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == userIdSearchFrame.getBtSubmit()) {
			String UserId = userIdSearchFrame.getTxtId().getText();
			employee s1 = new employee();		
			
			/*
			 * AddSalesManager  s1 = new AddSalesManager();
				AddHr h1 = new AddHr();
				AddAdmin a1 =  new AddAdmin();
			*/
			try{
				
				s1.setId(Integer.parseInt(UserId));
				/*
				a1.setId(Integer.parseInt(UserId));
				h1.setId(Integer.parseInt(UserId));
				*/
			}
		
			catch (Exception eq) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(userIdSearchFrame, "Try Again");
				userIdSearchFrame.dispose();
				new UserIdSearchFrame();
			}
			
			EmployeeJDBC empDB = new EmployeeJDBC();
			
			try {
				if(empDB.SearchById(s1)==true) {
					JOptionPane.showMessageDialog(userIdSearchFrame, "Found");
					new SalesManagerDetails(s1);
					userIdSearchFrame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(userIdSearchFrame, "NOT Found");
				}
					
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			/*
			DAONewsalesmanager sDAO = new DAONewsalesmanager();
			DAONewAdmin aDAO = new  DAONewAdmin();
			DAONewHr hDAO = new DAONewHr();
			
			s1 = sDAO.verify(s1);
			a1 = aDAO.verify(a1);
			h1 = hDAO.verify(h1);
			*/
			
			/*
			if(s1 instanceof AddSalesManager)
			{
				if(s1!=null) {
					JOptionPane.showMessageDialog(userIdSearchFrame, "Found");
					new SalesManagerDetails(s1);
					userIdSearchFrame.dispose();
				}
			}
			if(h1 instanceof AddHr) {
				if(h1!=null) {
					JOptionPane.showMessageDialog(userIdSearchFrame, "Found");
					userIdSearchFrame.dispose();
				}
			}
			if(a1 instanceof AddAdmin) {
				
				if(a1!=null) {
					JOptionPane.showMessageDialog(userIdSearchFrame, "Found");
					userIdSearchFrame.dispose();
				}
			}
			*/
			}
		if(e.getSource() == userIdSearchFrame.getBtClear()) {
		
		}
		if(e.getSource() == userIdSearchFrame.getBtBack()) {
			new UserSearchFrame();
			userIdSearchFrame.dispose();
			
			
		}
	}

}
