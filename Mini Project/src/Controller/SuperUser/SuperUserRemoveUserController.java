package Controller.SuperUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SuperUser.SuperClassHomepageFrame;
import view.SuperUser.SuperUserRemoveUserFrame;

public class SuperUserRemoveUserController implements ActionListener{

	SuperUserRemoveUserFrame superUserRemoveUserFrame;
	public SuperUserRemoveUserController(SuperUserRemoveUserFrame s) {
		// TODO Auto-generated constructor stub
		superUserRemoveUserFrame = s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == superUserRemoveUserFrame.getBtBack()) {
			new SuperClassHomepageFrame();
			superUserRemoveUserFrame.dispose();
		}
	}

}
