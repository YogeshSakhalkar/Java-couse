package view.User.seaech;

import java.awt.*;

import Controller.Windowlistner;
import Controller.User.UserSearch.UserSearchController;

public class UserSearchFrame extends Frame{

	Button btName, btId, btBack;
	public UserSearchFrame() {

		btName = new Button("Name");
		btId = new Button("Id");
		btBack = new Button("Return to pervious page");
		
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(200, 200, 200, 200);
		this.setLayout(new FlowLayout());
		this.setTitle("Search Page");
		
		this.add(btName);
		this.add(btId);
		System.out.println("\n\n");
		this.add(btBack);
		
		Windowlistner l1 = new Windowlistner(this);
		this.addWindowListener(l1);
		
		UserSearchController u1 = new UserSearchController(this);
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
