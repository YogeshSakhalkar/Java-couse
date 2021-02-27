package db.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.AddAdmin;
import model.AddSalesManager;

public class SalesManagerJDBC {

	public boolean insert(AddSalesManager e) throws SQLException
	{
	
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		int flag=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded sucessfully");
			String Url ="jdbc:mysql://localhost:3307/java_diploma";
			con = DriverManager.getConnection(Url,"root","root");
			System.out.println("Connction Sucessfull");
			
			pstmt=con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, e.getId());
			pstmt.setString(2, e.getName());
			pstmt.setDouble(3, e.getSalary());
			pstmt.executeUpdate();
			
			
			pstmt=con.prepareStatement("insert into salesmanager(incentive,target,empId) values (?,?,?)");
			pstmt.setDouble( 1, ((AddSalesManager) e).getIncentive());
			pstmt.setInt( 2, ((AddSalesManager) e).getTarget());
			pstmt.setInt( 3, e.getId() );
			pstmt.executeUpdate();
			flag=1;
			rs=pstmt.executeQuery("SELECT * FROM employee e JOIN salesmanager s ON e.id = s.empId");
			
				while(rs.next())
				{
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
				}
			

		}
		catch(Exception ex) {
			System.out.println("Error" +ex.getMessage());
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

