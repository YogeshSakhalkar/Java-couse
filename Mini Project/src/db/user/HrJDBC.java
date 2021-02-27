package db.user;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.AddHr;

public class HrJDBC {

	public boolean insert(AddHr h) throws SQLException
	{
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		int flag=0;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3307/java_diploma";
			con = DriverManager.getConnection(url,"root","root");
			
			pstmt = con.prepareStatement("insert into employee value(?,?,?)");
			pstmt.setInt(1, h.getId());
			pstmt.setString(2, h.getName());
			pstmt.setDouble(3, h.getSalary());
			pstmt.executeUpdate();
			
			pstmt=con.prepareStatement("insert into hr(commission,empId) values(?,?)");
			pstmt.setDouble(1, ((AddHr)h).getAllowance());
			pstmt.setInt(2, h.getId());
			pstmt.executeUpdate();
			flag=1;
			rs =pstmt.executeQuery("SELECT * FROM employee e JOIN hr h ON e.id=h.empId");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}
		catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
		finally {
				pstmt.close();
				con.close();
		}
		
		if(flag==1)
			return true;
		else
			return false;	
		}
		
	}

