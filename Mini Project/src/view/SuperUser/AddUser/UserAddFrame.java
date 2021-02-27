package view.SuperUser.AddUser;

import java.awt.*;

import Controller.Windowlistner;
import Controller.SuperUser.UserAdd.UserAddController;

public class UserAddFrame extends Frame{
	
	Button btSalesManager, btAdmin,btHr;
	Button btBack;
	
	public UserAddFrame() {
		btSalesManager = new Button("SalesManager");
		btAdmin = new Button("Admin");
		btHr = new Button("HR");
		btBack = new Button("Back to Previous page");
		
		
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(200, 200, 300, 200);
		this.setLayout(new FlowLayout());
		this.setTitle("Search Page");
		
		this.add(btAdmin);
		this.add(btSalesManager);
		this.add(btHr);
		this.add(btBack);

		
		Windowlistner l1 = new Windowlistner(this);
		this.addWindowListener(l1);
		
		UserAddController u1 = new UserAddController(this);
		btAdmin.addActionListener(u1);
		btSalesManager.addActionListener(u1);
		btHr.addActionListener(u1);
		btBack.addActionListener(u1);
	}
	
	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
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
