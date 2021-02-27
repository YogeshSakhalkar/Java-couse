package Controller.User.UserSearch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.User.Search.UserNameSearchMain;
import view.User.UserHomepageFrame;
import view.User.seaech.UserIdSearchFrame;
import view.User.seaech.UserNameSerchFrame;
import view.User.seaech.UserSearchFrame;

public class UserSearchController implements ActionListener{

	UserSearchFrame userSearchFrame;
	public UserSearchController(UserSearchFrame u) {
		// TODO Auto-generated constructor stub
		this.userSearchFrame = u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == userSearchFrame.getBtId()) {
			new UserIdSearchFrame();
			userSearchFrame.dispose();
		}
		if(e.getSource() == userSearchFrame.getBtName()) {
			new UserNameSerchFrame();
			userSearchFrame.dispose();
		}
		if(e.getSource() == userSearchFrame.getBtBack()) {
			new UserHomepageFrame();
			userSearchFrame.dispose();
		}
	}
}
