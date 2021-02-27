package Controller.SuperUser.EditUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SuperUser.SuperClassHomepageFrame;
import view.SuperUser.EditUser.EditAdminFrame;

public class EditAdminController implements ActionListener{

	EditAdminFrame editAdminFrame;
	public EditAdminController(EditAdminFrame e) {
		// TODO Auto-generated constructor stub
		editAdminFrame=e;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == editAdminFrame.getBtBack()) {
			new SuperClassHomepageFrame();
			editAdminFrame.dispose();
		}
	}

}
