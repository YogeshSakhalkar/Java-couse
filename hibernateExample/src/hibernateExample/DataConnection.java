package hibernateExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnection {
	public static void main(String[] args) {
	
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//String url ="jdbc:mysql://localhost:3307/test";
			//Connection con= DriverManager.getConnection(url,"root","root");
			
			Connection con= ConnectionFactory.getConnection();
			Statement stmt=con.createStatement();
			String query ="select * form employee";
			String insertQuery= "insert into employee values(?,?,?)";
			ResultSet rs= stmt.executeQuery(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
