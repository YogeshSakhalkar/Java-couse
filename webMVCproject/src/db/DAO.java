package db;

import model.User;

public class DAO {

	public User validate(User u1) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(u1.getUsername().equals("yogesh")&& u1.getPassword().equals("12345")) {
			u1.setCity("GOA");
			return u1;
		}
		else 
		{
		return null;
		}
	}

}
