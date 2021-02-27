package db.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import model.employee;

public class EmployeeJDBC {

	public boolean SearchByName(employee e1) throws SQLException{
		// TODO Auto-generated method stub
		
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet  rs = null;
		int flag=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/java_diploma";
			con =  DriverManager.getConnection(url,"root","root");
			
			pstmt =  con.prepareStatement("SELECT * FROM employee e JOIN salesmanager s ON WHERE id=s.empId AND name= ?");
		
			pstmt.setString(1, e1.getName());
			
			rs=pstmt.executeQuery();
				if(rs.next())
				{
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)
					+"\t"+rs.getString(5));
					flag=1;
				}	
				
				pstmt = con.prepareStatement("SELECT * FROM employee e JOIN admin a ON e.id = a.empId where name=?");
				pstmt.setString(1, e1.getName());
				
				rs =pstmt.executeQuery();
				if(rs.next())
				{
		
					flag=1;
				}
				
				pstmt= con.prepareStatement("SELECT * FROM employee e JOIN hr h ON e.id = h.empId where name=?");
				pstmt.setString(1, e1.getName());
				
				rs = pstmt.executeQuery();
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

	public boolean SearchById(employee e1) throws SQLException
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int flag=0;
		try 
		{
		Class.forName("con.mysql.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3307/java_diploma";
		con = DriverManager.getConnection(url,"root","root");
		
		pstmt = con.prepareStatement("SELECT * FROM employee e JOIN salesmanager s ON e.id = s.empId where id=?");
		pstmt.setInt(1, e1.getId());
		rs = pstmt.executeQuery();
		if(rs.next())
		{
			flag=1;
		}
		
		pstmt = con.prepareStatement("SELECT * FROM employee e JOIN admin a ON e.id = a.empId where id=?");
		pstmt.setInt(1, e1.getId());
		rs = pstmt.executeQuery();
		if(rs.next())
		{
			flag=1;
		}
		
		pstmt = con.prepareStatement("SELECT * FROM employee e JOIN hr ON e.id = h.empId where id= ?");
		pstmt.setInt(1, e1.getId());
		rs = pstmt.executeQuery();
		if(rs.next())
		{
			flag=1;
		}
		}
		catch(Exception ex)
		{
			System.out.println("Error"+ex.getMessage());
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
	
	public boolean CalulateSalary(employee e1) throws SQLException{
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		int flag=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/java_diploma";
			con=DriverManager.getConnection(url,"root","root");
			
			pstmt =con.prepareStatement("SELECT id name,(salary+incentive) FROM employee e JOIN salesmanager s ON e.id =s.empId WHERE id =?");
			pstmt.setInt(1, e1.getId());

			
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				flag=1;
			}
			
			pstmt =con.prepareStatement("SELECT id,name,(salary+allowance) FROM employee e JOIN admin a ON e.id = a.empId WHERE id=?");
			pstmt.setInt(1, e1.getId());

			
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				flag=1;
			}
			
			pstmt = con.prepareStatement("SELECT id,name,(salary+commission) FROM employee e JOIN hr h ON e.id = h.empId WHERE id =?");
			pstmt.setInt(1, e1.getId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
					
				flag=1;
			}
		}
			catch(Exception ex)
			{
				System.out.println("Error"+ex.getMessage());
			}
			
			finally
			{
				pstmt.close();
				con.close();
			}
			if(flag==1)
			{
				return true;
			}
			else
			{
				return false;
			}
		
	}



}
