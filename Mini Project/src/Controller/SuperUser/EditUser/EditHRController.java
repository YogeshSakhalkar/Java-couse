package Controller.SuperUser.EditUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SuperUser.SuperClassHomepageFrame;
import view.SuperUser.EditUser.EditHRFrame;

public class EditHRController implements ActionListener{

	EditHRFrame editHRFrame;
	public EditHRController(EditHRFrame e) {
		// TODO Auto-generated constructor stub
		editHRFrame =e;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == editHRFrame.getBtBack()) {
			new SuperClassHomepageFrame();
			editHRFrame.dispose();
		}
	}

}
