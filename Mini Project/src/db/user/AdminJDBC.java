package db.user;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import model.AddAdmin;

public class AdminJDBC {

	public boolean insert(AddAdmin a) throws SQLException
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int flag=0;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/java_diploma";
			con = (Connection) DriverManager.getConnection(url,"root","root");
			
			pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, a.getId());
			pstmt.setString(2, a.getName());
			pstmt.setDouble(3, a.getSalary());
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement("insert into admin(allowance,empId) values (?,?)");
			pstmt.setDouble(1, ((AddAdmin)a).getAllowance());
			pstmt.setInt(2, a.getId());
			pstmt.executeUpdate();
			flag=1;
			rs = pstmt.executeQuery("SELECT * FROM employee e JOIN admin a on e.id = a.empId");
		
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}
			catch (Exception ex) 
			{
				System.out.println("Error:"+ex.getMessage());
			}
			
			finally 
			{
					pstmt.close();
					con.close();
			}
			
			if(flag==1)
				return true;
			else
				return false;
	}
	
}