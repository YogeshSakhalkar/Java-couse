package Controller.SuperUser.UserAdd;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.sql.SQLException;

import javax.swing.JOptionPane;


import db.user.SalesManagerJDBC;
import model.AddSalesManager;
import view.LoginFrame;
import view.SuperUser.SuperClassHomepageFrame;
import view.SuperUser.AddUser.NewSalesManagerFrame;
import view.SuperUser.AddUser.UserAddFrame;

public class AddSalesManagerController implements ActionListener{
	
	NewSalesManagerFrame newSalesManagerFrame;
	
	public AddSalesManagerController(NewSalesManagerFrame n) {
		// TODO Auto-generated constructor stub
		newSalesManagerFrame=n;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == newSalesManagerFrame.getBtSubmit()) 
		{
			String id = newSalesManagerFrame.getTxtId().getText();
			String name = newSalesManagerFrame.getTxtName().getText();
			String salary = newSalesManagerFrame.getTxtSalary().getText();
			String incentive = newSalesManagerFrame.getTxtIncentive().getText();
			String target = newSalesManagerFrame.getTxtTarget().getText();
			
			AddSalesManager a1 = new AddSalesManager();
			
			try 
			{
				a1.setId(Integer.parseInt(id));
				a1.setName(name);
				a1.setSalary(Double.parseDouble(salary));
				a1.setIncentive(Double.parseDouble(incentive));
				a1.setTarget(Integer.parseInt(target));
			}
			catch(NumberFormatException e1)
			{
				JOptionPane.showMessageDialog(newSalesManagerFrame, "Enter valid details");
				return;
			}
			SalesManagerJDBC smDB = new SalesManagerJDBC();
			//db.DAONewsalesmanager d1= new  db.DAONewsalesmanager();
			
			try {
				if(smDB.insert(a1)==true)
				{
					System.out.println("successfully inserted!");
					JOptionPane.showMessageDialog(newSalesManagerFrame, "successfully inserted!");
					new UserAddFrame();
					newSalesManagerFrame.dispose();
				}
				else
				{
					System.out.println("Register again");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource() == newSalesManagerFrame.getBtBack()) {
			new UserAddFrame();
			newSalesManagerFrame.dispose();
		}
	}
	}

