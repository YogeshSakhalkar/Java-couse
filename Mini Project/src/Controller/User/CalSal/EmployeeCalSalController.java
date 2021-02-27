package Controller.User.CalSal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.User.UserCalSalSearchFrame;
import view.User.calsal.EmployeeCalSal;


public class EmployeeCalSalController implements ActionListener{

	EmployeeCalSal employeeCalSal;
	public EmployeeCalSalController(EmployeeCalSal s) {
		// TODO Auto-generated constructor stub
		employeeCalSal = s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == employeeCalSal.getBtBack()) {
			employeeCalSal.dispose();
			new UserCalSalSearchFrame();
	}
	}
}
