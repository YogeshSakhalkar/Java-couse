package db.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.employee;

public class SuperUserJDBC {

	public boolean validate(employee e1) throws SQLException{
		// TODO Auto-generated method stub
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet  rs = null;
		int flag=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/java_diploma";
			con =  DriverManager.getConnection(url,"root","root");
			
			pstmt =  con.prepareStatement("SELECT * FROM superuser WHERE id=? AND name= ?");
			pstmt.setInt(1, e1.getId());
			pstmt.setString(2, e1.getName());
			rs=pstmt.executeQuery();
				if(rs.next())
				{
					flag=1;
				}	
			}
		catch(Exception ex) {
				System.out.println("Error "+ex.getMessage());
			}
		finally {
			pstmt.close();
			con.close();
		}
		if(flag==1) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
