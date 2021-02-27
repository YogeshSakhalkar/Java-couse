package Controller.SuperUser.UserAdd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LoginFrame;
import view.SuperUser.SuperClassHomepageFrame;
import view.SuperUser.AddUser.NewAdminFrame;
import view.SuperUser.AddUser.NewHrFrame;
import view.SuperUser.AddUser.NewSalesManagerFrame;
import view.SuperUser.AddUser.UserAddFrame;

public class UserAddController implements  ActionListener{

	UserAddFrame userAddFrame;
	public UserAddController(UserAddFrame u) {
		// TODO Auto-generated constructor stub
		this.userAddFrame=u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == userAddFrame.getBtAdmin()) {
			new NewAdminFrame();
			userAddFrame.dispose();
		}
		if(e.getSource() == userAddFrame.getBtHr()) {
			new NewHrFrame();
			userAddFrame.dispose();
		}
		if(e.getSource() == userAddFrame.getBtSalesManager()) {
			new NewSalesManagerFrame();
			userAddFrame.dispose();
		}
		if(e.getSource() == userAddFrame.getBtBack()) {
			new SuperClassHomepageFrame();
			userAddFrame.dispose();
		}
	}

}
