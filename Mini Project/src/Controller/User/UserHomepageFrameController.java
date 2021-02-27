package Controller.User;


import java.awt.event.*;

import view.User.UserCalSalSearchFrame;
import view.User.UserHomepageFrame;
import view.User.UserSortFrame;
import view.User.seaech.UserSearchFrame;

public class UserHomepageFrameController implements ActionListener{
	
	UserHomepageFrame userHomepageFrame;
	
	public UserHomepageFrameController(UserHomepageFrame u) {
		// TODO Auto-generated constructor stub
		this.userHomepageFrame=u;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()== userHomepageFrame.getBtSearch()) {
			new UserSearchFrame();
			userHomepageFrame.dispose();
		}
		if(ae.getSource() == userHomepageFrame.getBtCalsal()) {
			new UserCalSalSearchFrame();
			userHomepageFrame.dispose();
		}
		if(ae.getSource() == userHomepageFrame.getBtSort()) {
			new UserSortFrame();
			userHomepageFrame.dispose();
		}
	}

}
