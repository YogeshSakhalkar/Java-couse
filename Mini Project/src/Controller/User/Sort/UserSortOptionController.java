package Controller.User.Sort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.User.sort.UserSortOptions;

public class UserSortOptionController implements ActionListener{

	UserSortOptions userSortOptions;
	public UserSortOptionController(UserSortOptions u) {
		// TODO Auto-generated constructor stub
		userSortOptions = u;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == userSortOptions.getBtSalesManager()) {
			
		}
		if(e.getSource() == userSortOptions.getBtHr()) {
			
		}
		if(e.getSource() == userSortOptions.getBtAdmin()) {
			
		}
	}

}
