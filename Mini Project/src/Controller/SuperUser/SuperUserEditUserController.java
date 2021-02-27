package Controller.SuperUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import db.DAONewAdmin;
import db.DAONewHr;
import db.DAONewsalesmanager;
import db.user.EmployeeJDBC;
import model.AddAdmin;
import model.AddHr;
import model.AddSalesManager;
import model.employee;
import view.SuperUser.SuperClassHomepageFrame;
import view.SuperUser.SuperUserEditUserFrame;
import view.SuperUser.EditUser.EditSalesManagerFrame;

public class SuperUserEditUserController implements ActionListener{

	SuperUserEditUserFrame superUserEditUserFrame;
	public SuperUserEditUserController(SuperUserEditUserFrame s) {
		// TODO Auto-generated constructor stub
		this.superUserEditUserFrame = s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == superUserEditUserFrame.getBtSubmit()) {
			String UserId = superUserEditUserFrame.getTxtId().getText();

			employee e1 = new employee();
			try{
				e1.setId(Integer.parseInt(UserId));
				//a1.setId(Integer.parseInt(UserId));
				//h1.setId(Integer.parseInt(UserId));
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(superUserEditUserFrame,"Try Again");
				superUserEditUserFrame.dispose();
				new SuperUserEditUserFrame();
			}
			
				EmployeeJDBC ejdbc = new EmployeeJDBC();
				//DAONewsalesmanager sDAO = new DAONewsalesmanager();
				//DAONewAdmin aDAO = new  DAONewAdmin();
				//DAONewHr hDAO = new DAONewHr();
				
				
				
				if(ejdbc.EditSM(e1))
				{
					if(e1!=null) {
						JOptionPane.showMessageDialog(superUserEditUserFrame,"Found");
						superUserEditUserFrame.dispose();
						new EditSalesManagerFrame(e1);
						}
					}
		}
		if(e.getSource() == superUserEditUserFrame.getBtBack()) {
			new SuperClassHomepageFrame();
			superUserEditUserFrame.dispose();
		}
	}

}
