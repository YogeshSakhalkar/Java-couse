package gui.User.Search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.User.seaech.SalesManagerDetails;
import view.User.seaech.UserIdSearchFrame;

public class SalesManagerDetailsController implements ActionListener{
	SalesManagerDetails salesManagerDetails;
	public SalesManagerDetailsController(SalesManagerDetails s) {
		// TODO Auto-generated constructor stub
		salesManagerDetails = s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == salesManagerDetails.getBtback()) {
			new UserIdSearchFrame();
			salesManagerDetails.dispose();
		}
	}

}
