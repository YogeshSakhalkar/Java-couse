package Controller.SuperUser.UserAdd;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import db.user.HrJDBC;
import model.AddHr;
import view.SuperUser.AddUser.NewHrFrame;
import view.SuperUser.AddUser.UserAddFrame;

public class AddHrController implements ActionListener{
	
	NewHrFrame newHrFrame;
	public AddHrController(NewHrFrame n) {
		// TODO Auto-generated constructor stub
		newHrFrame=n;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		if(ae.getSource() ==newHrFrame.getBtSubmit()) {
			String id = newHrFrame.getTxtId().getText();
			String name = newHrFrame.getTxtName().getText();
			String salary = newHrFrame.getTxtSalary().getText();
			String allowance = newHrFrame.getTxtAllowance().getText();
			
			AddHr ah1 = new AddHr();
			ah1.setId(Integer.parseInt(id));
			ah1.setName(name);
			ah1.setSalary(Double.parseDouble(salary));
			ah1.setAllowance(Double.parseDouble(allowance));
			
			HrJDBC hr = new HrJDBC();
			//db.DAONewHr h1 = new db.DAONewHr();
			
			try {
				if(hr.insert(ah1)== true) 
				{
					System.out.println("successfully inserted!");
					JOptionPane.showMessageDialog(newHrFrame, "successfully inserted!");
					new UserAddFrame();
					newHrFrame.dispose();
				}
				else
		
				{
					JOptionPane.showMessageDialog(newHrFrame, "Not Inserted Please Try Again..!");
				}
			}
			 catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Error"+e.getMessage());
				}

		}
		if(ae.getSource() == newHrFrame.getBtBack()) {
			new UserAddFrame();
			newHrFrame.dispose();
	}
	}
}
