package Controller.SuperUser.UserAdd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.user.AdminJDBC;
import db.user.HrJDBC;
import model.AddAdmin;
import view.SuperUser.AddUser.NewAdminFrame;
import view.SuperUser.AddUser.UserAddFrame;

public class AddAdminController implements ActionListener{
	
	NewAdminFrame newAdminFrame;
	public AddAdminController(NewAdminFrame n) {
		// TODO Auto-generated constructor stub
		newAdminFrame = n;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == newAdminFrame.getBtSubmit()) {
			String id = newAdminFrame.getTxtId().getText();
			String name = newAdminFrame.getTxtName().getText();
			String salary = newAdminFrame.getTxtSalary().getText();
			String allowance = newAdminFrame.getTxtAllowance().getText();
			
			AddAdmin a1 = new AddAdmin();
			a1.setId(Integer.parseInt(id));
			a1.setName(name);
			a1.setSalary(Double.parseDouble(salary));
			a1.setAllowance(Double.parseDouble(allowance));
			
			AdminJDBC Ad = new AdminJDBC();
			//db.DAONewAdmin na = new db.DAONewAdmin();
			try {
			if(Ad.insert(a1)== true) {
				System.out.println("successfully inserted!");
				JOptionPane.showMessageDialog(newAdminFrame, "successfully inserted!");
				new UserAddFrame();
				newAdminFrame.dispose();
			}
			else
			{
				System.out.println("Register again");
			}
			}
			catch(Exception e1) {
				System.out.println("Error"+e1.getMessage());
			}
			
			if(e.getSource() == newAdminFrame.getBtBack()) {
				new UserAddFrame();
				newAdminFrame.dispose();
			}

		}
		if(e.getSource() == newAdminFrame.getBtBack()) {
			new UserAddFrame();
			newAdminFrame.dispose();
		}
	}

}
