package Controller.SuperUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.SuperUser.SuperUserEditUserMain;
import view.LoginFrame;
import view.SuperUser.SuperClassHomepageFrame;
import view.SuperUser.SuperUserEditUserFrame;
import view.SuperUser.SuperUserRemoveUserFrame;
import view.SuperUser.AddUser.UserAddFrame;

public class SuperClassHomepageController implements ActionListener{

	SuperClassHomepageFrame superClassHomepageFrame;
	public SuperClassHomepageController(SuperClassHomepageFrame sc) {
		// TODO Auto-generated constructor stub
		superClassHomepageFrame=sc;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == superClassHomepageFrame.getBtAddUser()) {
			new  UserAddFrame();
			superClassHomepageFrame.dispose();
		}
		if(e.getSource() == superClassHomepageFrame.getBtEditUser()) {
			new SuperUserEditUserFrame();
			superClassHomepageFrame.dispose();
		}
		if(e.getSource() == superClassHomepageFrame.getBtRemoveUser()) {
			new SuperUserRemoveUserFrame();
			superClassHomepageFrame.dispose();
		}
		if(e.getSource() == superClassHomepageFrame.getBtBack()) {
			new LoginFrame();
			superClassHomepageFrame.dispose();
		}
	}

	
}
