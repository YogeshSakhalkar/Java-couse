package Controller.SuperUser.EditUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.AddAdmin;
import model.AddHr;
import model.AddSalesManager;
import view.SuperUser.SuperUserEditUserFrame;
import view.SuperUser.EditUser.EditSalesManagerFrame;

public class EditSalesManagerController implements ActionListener{

	EditSalesManagerFrame editSalesManagerFrame;
	public EditSalesManagerController(EditSalesManagerFrame e) {
		// TODO Auto-generated constructor stub
		editSalesManagerFrame =e;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == editSalesManagerFrame.getBtSubmit()) {
			
		}
		
		if(e.getSource() == editSalesManagerFrame.getBtBack()) {
			new SuperUserEditUserFrame();
			editSalesManagerFrame.dispose();
		}
	}

}
