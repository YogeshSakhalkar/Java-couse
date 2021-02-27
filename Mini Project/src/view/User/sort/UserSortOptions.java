package view.User.sort;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import Controller.Windowlistner;
import Controller.User.UserSortController;
import Controller.User.Sort.UserSortOptionController;

public class UserSortOptions extends Frame{
	Button btSalesManager, btAdmin, btHr ,btback;
	
	public UserSortOptions() {
		btSalesManager = new Button("Sales Manager");
		btAdmin = new Button("Admin");
		btHr = new Button("HR");
		btback = new Button("back to previous page");
		
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(200, 200, 300, 200);
		this.setLayout(new FlowLayout());
		this.setTitle("Sort By");
		
		this.add(btSalesManager);
		this.add(btAdmin);
		this.add(btHr);
		this.add(btback);
		
		Windowlistner l1 = new Windowlistner(this);
		this.addWindowListener(l1);
		
		UserSortOptionController u1 = new UserSortOptionController(this);
		btSalesManager.addActionListener(u1);
		btAdmin.addActionListener(u1);
		btHr.addActionListener(u1);
		btback.addActionListener(u1);
	}

	public Button getBtSalesManager() {
		return btSalesManager;
	}

	public void setBtSalesManager(Button btSalesManager) {
		this.btSalesManager = btSalesManager;
	}

	public Button getBtAdmin() {
		return btAdmin;
	}

	public void setBtAdmin(Button btAdmin) {
		this.btAdmin = btAdmin;
	}

	public Button getBtHr() {
		return btHr;
	}

	public void setBtHr(Button btHr) {
		this.btHr = btHr;
	}
	
}
