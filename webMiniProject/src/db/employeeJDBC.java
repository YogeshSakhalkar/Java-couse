package db;

import java.sql.Connection;
import java.sql.DriverManager;

import model.employee;

public class employeeJDBC {

	public employee validate(employee e1) {
		// TODO Auto-generated method stub
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int flag=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			String url = "jdbc:mysql://localhost:3307/web_java_diploma";
			con = DriverManager.getConnection(url,"root","root");
			
			pstmt = con.prepareStatement("");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}

}
