package Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;


import db.user.AdminJDBC;
import db.user.EmployeeJDBC;
import db.user.HrJDBC;
import db.user.SalesManagerJDBC;
import db.user.SuperUserJDBC;
import model.AddAdmin;
import model.AddHr;
import model.AddSalesManager;
import model.employee;
import model.login;
import view.*;
import view.SuperUser.SuperClassHomepageFrame;
import view.User.UserHomepageFrame;

public class LoginFrameController implements ActionListener{
	LoginFrame loginFrame;

	
	public LoginFrameController(LoginFrame lF) {
		
		this.loginFrame = lF;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource() == loginFrame.getBtLogin())
		{
			String username = loginFrame.getTxtUsername().getText();
			String password = loginFrame.getTxtPassword().getText();
			System.out.println(username+" "+password);
			
			
			employee e1 = new employee();
			
			try{
				e1.setId(Integer.parseInt(password));
				e1.setName(username);

			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(loginFrame,"try again");
				new LoginFrame();
				loginFrame.dispose();
				
			}
			
			EmployeeJDBC ajdbc = new EmployeeJDBC();
			SuperUserJDBC sjdbc = new SuperUserJDBC();
			//DAONewsalesmanager sDAO = new DAONewsalesmanager();
			//DAONewAdmin aDAO = new  DAONewAdmin();
			//DAONewHr hDAO = new DAONewHr();
			
			

			try {
				if(sjdbc.validate(e1)) {
					JOptionPane.showMessageDialog(loginFrame, "Found \n Welcome SuperUser");
					new SuperClassHomepageFrame();
					loginFrame.dispose();
				}
				if(ajdbc.validate(e1))
				{
					if(e1!=null) {
						JOptionPane.showMessageDialog(loginFrame,"Found \n Welcome ");
						new UserHomepageFrame();
						loginFrame.dispose();
						return;
					}
				}
				
			} catch (HeadlessException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
}
/*login l = new login();
l.setUsername(username);
l.setUsername(password);
DAOSuperUser s1= new DAOSuperUser();
l=s1.validate(l);
if(l!=null) {
	new SuperClassHomepageFrame();
	loginFrame.dispose();
}

AddSalesManager a1 = new AddSalesManager();//User u1=new User();
a1.setId(Integer.parseInt(username));
a1.setName(password);
DAONewsalesmanager  l1= new DAONewsalesmanager();//db.DAO d1 = new DAO();
a1=l1.validate(a1);

if(a1!=null) {
	new UserHomepageFrame();
	loginFrame.dispose();
}

AddHr h1 = new AddHr();
h1.setId(Integer.parseInt(username));
h1.setName(password);
DAONewHr nr = new DAONewHr();
h1=nr.validate(h1);

if(h1!=null) {
	new UserHomepageFrame();
	loginFrame.dispose();
}

AddAdmin aa1 = new AddAdmin();
aa1.setId(Integer.parseInt(username));
aa1.setName(password);
DAONewAdmin Da1 =  new DAONewAdmin();
aa1=Da1.validate(aa1);

if(aa1!=null) {
	new UserHomepageFrame();
	loginFrame.dispose();
}
}

if(e.getSource() == loginFrame.getBtClear()){
System.out.println("Clear");
}*/