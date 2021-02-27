package view.User;

import java.awt.*;

import Controller.Windowlistner;
import Controller.User.UserSortController;

public class UserSortFrame extends Frame{
 
	Button btName, btId, btBack ;
	
	public UserSortFrame() {
		btName = new Button("BY Name");
		btId = new Button("BY Id");
		btBack = new Button("Back to Previous page");
		
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(200, 200, 300, 200);
		this.setLayout(new FlowLayout());
		this.setTitle("Sort By");
		
		this.add(btName);
		this.add(btId);
		this.add(btBack);
		
		Windowlistner l1 = new Windowlistner(this);
		this.addWindowListener(l1);
		
		UserSortController u1 = new UserSortController(this);
		btId.addActionListener(u1);
		btName.addActionListener(u1);
		btBack.addActionListener(u1);
	}

	public Button getBtName() {
		return btName;
	}

	public void setBtName(Button btName) {
		this.btName = btName;
	}

	public Button getBtId() {
		return btId;
	}

	public void setBtId(Button btId) {
		this.btId = btId;
	}

	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}
	
}
