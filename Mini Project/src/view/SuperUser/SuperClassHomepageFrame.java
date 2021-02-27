package view.SuperUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.SuperClassHomepageController;

public class SuperClassHomepageFrame extends Frame{

	Button btAddUser, btRemoveUser, btEditUser;
	Label lbTitle;
	Button btBack;
	
	public SuperClassHomepageFrame() {
		btAddUser = new Button("Add User");
		btRemoveUser = new Button("Remove User");
		btEditUser = new Button("Edit User");
		lbTitle = new Label("\n Hello SuperUser \n");
		btBack = new Button("Back to Previous page");
		
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(200, 200, 200, 200);
		this.setTitle("Welocome SuperUser");
		
		this.setLayout(new FlowLayout());
		
		this.add(lbTitle);
		this.add(btAddUser);
		this.add(btEditUser);
		this.add(btRemoveUser);
		this.add(btBack);
		
		Windowlistner l1 =  new Windowlistner(this);
		this.addWindowListener(l1);
		
		SuperClassHomepageController s1 = new SuperClassHomepageController(this);
		btAddUser.addActionListener(s1);
		btEditUser.addActionListener(s1);
		btRemoveUser.addActionListener(s1);
		btBack.addActionListener(s1);
	}

	public Button getBtAddUser() {
		return btAddUser;
	}

	public void setBtAddUser(Button btAddUser) {
		this.btAddUser = btAddUser;
	}

	public Button getBtRemoveUser() {
		return btRemoveUser;
	}

	public void setBtRemoveUser(Button btRemoveUser) {
		this.btRemoveUser = btRemoveUser;
	}

	public Button getBtEditUser() {
		return btEditUser;
	}

	public void setBtEditUser(Button btEditUser) {
		this.btEditUser = btEditUser;
	}

	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}
	
}
