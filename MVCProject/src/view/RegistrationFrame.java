package view;

import java.awt.*;
import java.awt.event.*;

import Controller.*;



public class RegistrationFrame 
							extends Frame 
										{

	Button btSubmit,btClear;
	
	TextField txtUname, txtPassword, txtCity;
	Label lbUname, lbPassword, lbCity;
	
	public RegistrationFrame() {
		
		btSubmit= new Button("Submit Data");
		btClear = new Button("Clear Data");
		
		txtUname = new TextField(20);
		txtPassword = new TextField(20);
		txtCity = new TextField(20);
		
		lbUname  = new Label("Enter the User name");
		lbPassword = new Label("Enter the password");
		lbCity = new Label("enter the city");
		
		txtPassword.setEchoChar('*');
		this.setTitle("Registration Form");
		this.setVisible(true);
		this.setBounds(300, 200, 325, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(lbUname);
		this.add(txtUname);
		this.add(lbPassword);
		this.add(txtPassword);
		this.add(lbCity);
		this.add(txtCity);
		this.add(btClear);
		this.add(btSubmit);
		
		Windowlistner mw = new Windowlistner(this);
		this.addWindowListener(mw);
		
		//gui.addWindowListener(listener)
		
		RegistrationFrameController rc = new RegistrationFrameController(this);
		btSubmit.addActionListener(rc);
		btClear.addActionListener(rc);
	}

	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}

	public TextField getTxtUname() {
		return txtUname;
	}

	public void setTxtUname(TextField txtUname) {
		this.txtUname = txtUname;
	}

	public TextField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(TextField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public TextField getTxtCity() {
		return txtCity;
	}

	public void setTxtCity(TextField txtCity) {
		this.txtCity = txtCity;
	}

	public Label getLbUname() {
		return lbUname;
	}

	public void setLbUname(Label lbUname) {
		this.lbUname = lbUname;
	}

	public Label getLbPassword() {
		return lbPassword;
	}

	public void setLbPassword(Label lbPassword) {
		this.lbPassword = lbPassword;
	}

	public Label getLbCity() {
		return lbCity;
	}

	public void setLbCity(Label lbCity) {
		this.lbCity = lbCity;
	}



}//RF class ends here

