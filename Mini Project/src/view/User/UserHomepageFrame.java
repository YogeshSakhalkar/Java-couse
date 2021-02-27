package view.User;

import java.awt.*;


import Controller.Windowlistner;
import Controller.User.UserHomepageFrameController;

public class UserHomepageFrame extends Frame{

	Button btSearch, btSort, btCalsal;
	
	public UserHomepageFrame() {
		
		btSearch = new Button("Search");
		btSort = new Button("Sort");
		btCalsal = new Button("Calulate Salary");
		
		this.setVisible(true);
		this.setBounds(200, 200, 500, 500);
		this.setResizable(false);
		this.setTitle("Welcome User");
		this.setLayout(new FlowLayout());
		
		this.add(btSearch);
		this.add(btSort);
		this.add(btCalsal);
		
		Windowlistner l1 = new Windowlistner(this);
		this.addWindowListener(l1);
		
		UserHomepageFrameController rc = new UserHomepageFrameController(this);
		btSearch.addActionListener(rc);
		btCalsal.addActionListener(rc);
		btSort.addActionListener(rc);
	}

	public Button getBtSearch() {
		return btSearch;
	}

	public void setBtSearch(Button btSearch) {
		this.btSearch = btSearch;
	}

	public Button getBtSort() {
		return btSort;
	}

	public void setBtSort(Button btSort) {
		this.btSort = btSort;
	}

	public Button getBtCalsal() {
		return btCalsal;
	}

	public void setBtCalsal(Button btCalsal) {
		this.btCalsal = btCalsal;
	}
	
}
