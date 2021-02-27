package Controller.User.UserSearch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.User.seaech.UserNameSerchFrame;
import view.User.seaech.UserSearchFrame;

public class UserNameSerchController implements ActionListener{

	UserNameSerchFrame userNameSerchFrame;
	public UserNameSerchController(UserNameSerchFrame u) {
		// TODO Auto-generated constructor stub
		userNameSerchFrame =u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == userNameSerchFrame.getBtSubmit()) {
			
		}
		if(e.getSource() == userNameSerchFrame.getBtBack()) {
			new UserSearchFrame();
			userNameSerchFrame.dispose();
		}
	}

}
