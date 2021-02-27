package Controller.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.User.UserHomepageFrame;
import view.User.UserSortFrame;
import view.User.seaech.UserIdSearchFrame;
import view.User.seaech.UserNameSerchFrame;

public class UserSortController implements ActionListener{

	UserSortFrame userSortFrame;
	public UserSortController(UserSortFrame u) {
		// TODO Auto-generated constructor stub
		userSortFrame = u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== userSortFrame.getBtId()) {
			//new UserIdSearchFrame();
			//userSortFrame.dispose();
		}
		if(e.getSource() == userSortFrame.getBtName()) {
			//new UserNameSerchFrame();
			//userSortFrame.dispose();
		}
		if(e.getSource() == userSortFrame.getBtBack()) {
			new UserHomepageFrame();
			userSortFrame.dispose();
		}
	}

}
